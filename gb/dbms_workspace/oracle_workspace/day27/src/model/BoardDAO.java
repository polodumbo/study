package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// [ PreparedStatement ]
//  : 향상된 Statement
public class BoardDAO {
	Connection conn;
	PreparedStatement pstmt;

	final String INSERT = "INSERT INTO BOARD VALUES((SELECT NVL(MAX(NUM),0)+1 FROM BOARD),?,?,?,0)";
	final String SELECTALL = "SELECT * FROM BOARD ORDER BY NUM ASC";
	final String SELECT_TITLE = "SELECT * FROM BOARD WHERE TITLE LIKE '%'||?||'%' ORDER BY NUM ASC";
	final String SELECT_CONTENT = "SELECT * FROM BOARD WHERE CONTENT LIKE '%'||?||'%' ORDER BY NUM ASC";
	final String SELECT_WRITER = "SELECT * FROM BOARD WHERE WRITER LIKE '%'||?||'%' ORDER BY NUM ASC";
	final String SELECTONE = "SELECT * FROM BOARD WHERE NUM=?";
	final String UPDATE_CNT = "UPDATE BOARD SET CNT=CNT+1 WHERE NUM=?";
	final String UPDATE_TITLE = "UPDATE BOARD SET TITLE=? WHERE NUM=?";
	final String DELETE = "DELETE FROM BOARD WHERE NUM=?";

	public BoardVO selectOne(BoardVO bvo) {
		conn = JDBCUtil.connect();
		BoardVO data = null;
		try {
			pstmt = conn.prepareStatement(SELECTONE);
			pstmt.setInt(1, bvo.getNum());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				data = new BoardVO();
				data.setCnt(rs.getInt("CNT"));
				data.setContent(rs.getString("CONTENT"));
				data.setNum(rs.getInt("NUM"));
				data.setTitle(rs.getString("TITLE"));
				data.setWriter(rs.getString("WRITER"));
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
		conn = JDBCUtil.connect();
		ArrayList<BoardVO> datas = new ArrayList<BoardVO>();
		try {
			if (bvo == null) {
				pstmt = conn.prepareStatement(SELECTALL);
			} else if (bvo.getSearchCondition().equals("제목")) {
				pstmt = conn.prepareStatement(SELECT_TITLE);
				pstmt.setString(1, bvo.getSearchContent());
			} else if (bvo.getSearchCondition().equals("내용")) {
				pstmt = conn.prepareStatement(SELECT_CONTENT);
				pstmt.setString(1, bvo.getSearchContent());
			} else if (bvo.getSearchCondition().equals("작성자")) {
				pstmt = conn.prepareStatement(SELECT_WRITER);
				pstmt.setString(1, bvo.getSearchContent());
			}
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO data = new BoardVO();
				data.setCnt(rs.getInt("CNT"));
				data.setContent(rs.getString("CONTENT"));
				data.setNum(rs.getInt("NUM"));
				data.setTitle(rs.getString("TITLE"));
				data.setWriter(rs.getString("WRITER"));
				datas.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return datas;
	}

	public boolean insert(BoardVO bvo) {
		try {
			conn = JDBCUtil.connect();

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
		try {
			conn = JDBCUtil.connect();

			if (bvo.getTitle() == null) {
				pstmt = conn.prepareStatement(UPDATE_CNT);
				pstmt.setInt(1, bvo.getNum());
			} else {
				pstmt = conn.prepareStatement(UPDATE_TITLE);
				pstmt.setString(1, bvo.getTitle());
				pstmt.setInt(2, bvo.getNum());
			}
			int res = pstmt.executeUpdate();
			// output: INT, row 개수
			if (res == 0) {
				System.out.println("   로그: UPDATE 수행대상이 없습니다.");
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
		try {
			conn = JDBCUtil.connect();

			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, bvo.getNum());
			int res = pstmt.executeUpdate();
			if (res == 0) {
				System.out.println("   로그: DELETE 수행대상이 없습니다.");
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
}
