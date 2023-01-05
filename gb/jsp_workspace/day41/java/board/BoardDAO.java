package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCUtil;

public class BoardDAO {

//	final String INSERT = "INSERT INTO BOARD VALUES((SELECT IFNULL(MAX(a.NUM), 0) + 1 FROM BOARD a), ?, ?)";
//	NUM에 제약조건으로 AUTO_INCREMENT를 달았을 때는
	final String INSERT = "INSERT INTO BOARD (TITLE,CONTENT,WRITER) VALUES(?,?,?)";
	final String UPDATE = "UPDATE BOARD SET TITLE=?, CONTENT=? WHERE NUM=?";
	final String UPDATE_CNT = "UPDATE BOARD SET CNT=CNT+1 WHERE NUM=?";
	final String DELETE = "DELETE FROM BOARD WHERE NUM=?";
	final String SELECTONE = "SELECT * FROM BOARD WHERE NUM=?";
	final String SELECTALL = "SELECT * FROM BOARD ORDER BY NUM ASC";
//	MySQL에서 단독으로 사용할 때는 괜찮으나 Connector를 사용했을 시에는 LIKE를 사용해도 전체가 검색된다.
	// JDBC 미사용 시
//	final String SELECT_TITLE = "SELECT * FROM BOARD WHERE TITLE LIKE '%'||?||'%' ORDER BY NUM ASC";
	// JDBC 사용 시
	final String SELECT_TITLE = "SELECT * FROM BOARD WHERE TITLE LIKE CONCAT('%',?,'%') ORDER BY NUM ASC";
	final String SELECT_CONTENT = "SELECT * FROM BOARD WHERE CONTENT LIKE CONCAT('%',?,'%') ORDER BY NUM ASC";
	final String SELECT_WRITER = "SELECT * FROM BOARD WHERE WRITER LIKE CONCAT('%',?,'%') ORDER BY NUM ASC";
	final String SELECT_TOP = "SELECT * FROM BOARD ORDER BY CNT DESC LIMIT 3";

	Connection conn;
	PreparedStatement pstmt;

	public boolean insert(BoardVO bvo) {
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, bvo.getTitle());
			pstmt.setString(2, bvo.getContent());
			pstmt.setString(3, bvo.getWriter());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return true;
	}

	public boolean update(BoardVO bvo) {
		if (bvo.getWriter().equals("admin")) {
			return false;
		}
		conn = JDBCUtil.connect();
		try {
			// 단순 조회이기 때문에, title, content값이 없다면 조회수 증가
			if (bvo.getTitle() == null) {
				pstmt = conn.prepareStatement(UPDATE_CNT);
				pstmt.setInt(1, bvo.getNum());
			} else {
				pstmt = conn.prepareStatement(UPDATE);
				pstmt.setString(1, bvo.getTitle());
				pstmt.setString(2, bvo.getContent());
				pstmt.setInt(3, bvo.getNum());
			}
			int res = pstmt.executeUpdate();
			if (res <= 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return true;
	}

	public boolean delete(BoardVO bvo) {
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, bvo.getNum());
			int res = pstmt.executeUpdate();
			if (res <= 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return true;
	}

	public BoardVO selectOne(BoardVO bvo) {
		BoardVO data = null;
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(UPDATE_CNT);
			pstmt.setInt(1, bvo.getNum());
			pstmt.executeUpdate();

			pstmt = conn.prepareStatement(SELECTONE);
			pstmt.setInt(1, bvo.getNum());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				data = new BoardVO();
				data.setNum(rs.getInt("NUM"));
				data.setTitle(rs.getString("TITLE"));
				data.setContent(rs.getString("CONTENT"));
				data.setWriter(rs.getString("WRITER"));
				data.setCnt(rs.getInt("CNT"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return data;
	}

	public ArrayList<BoardVO> selectAll(BoardVO bvo) {
		ArrayList<BoardVO> datas = new ArrayList<BoardVO>();
		conn = JDBCUtil.connect();
		try {
			if (bvo == null) {
				pstmt = conn.prepareStatement(SELECTALL);
			} else if (bvo.getSearchCondition().equals("제목")) {
				pstmt = conn.prepareStatement(SELECT_TITLE);
				pstmt.setString(1, bvo.getSearchContent());
			} else if (bvo.getSearchCondition().equals("작성자")) {
				pstmt = conn.prepareStatement(SELECT_WRITER);
				pstmt.setString(1, bvo.getSearchContent());
			} else if(bvo.getSearchCondition().equals("TOP")) {
				pstmt = conn.prepareStatement(SELECT_TOP);
			}
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO data = new BoardVO();
				data.setNum(rs.getInt("NUM"));
				data.setTitle(rs.getString("TITLE"));
				data.setContent(rs.getString("CONTENT"));
				data.setWriter(rs.getString("WRITER"));
				data.setCnt(rs.getInt("CNT"));
				datas.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return datas;
	}
}
