package model.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.common.JDBCUtil;

public class BoardDAO {
	Connection conn;
	PreparedStatement pstmt;
	
	public BoardDAO() {
	}
	
	final String INSERT = "INSERT INTO BOARD VALUES((SELECT NVL(MAX(NUM),0)+1 FROM BOARD),?,?)";
	final String SELECTALL = "SELECT * FROM BOARD ORDER BY NUM ASC";
	final String SELECT_TITLE = "SELECT * FROM BOARD WHERE TITLE LIKE '%'||?||'%' ORDER BY NUM ASC";
	final String SELECT_WRITER = "SELECT * FROM BOARD WHERE WRITER LIKE '%'||?||'%' ORDER BY NUM ASC";
	final String SELECT_CHECK = "SELECT TITLE, WRITER FROM BOARD ORDER BY NUM ASC";
	
	// C
	public boolean insert(BoardVO bvo) {
		try {
			conn = JDBCUtil.connect();
			pstmt = conn.prepareStatement(INSERT);
			
			pstmt.setString(1, bvo.getTitle());
			pstmt.setString(2, bvo.getWriter());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return true;
	}
	
	// R
	public ArrayList<BoardVO> selectAll(BoardVO bvo) {
		conn = JDBCUtil.connect();
		ArrayList<BoardVO> boardList = new ArrayList<BoardVO>();
		try {
			if (bvo == null) {
				pstmt = conn.prepareStatement(SELECTALL);
			} else if (bvo.getSearchCondition().equals("제목")) {
				pstmt = conn.prepareStatement(SELECT_TITLE);
				pstmt.setString(1, bvo.getSearchContent());
			} else if (bvo.getSearchCondition().equals("작가")) {
				pstmt = conn.prepareStatement(SELECT_WRITER);
				pstmt.setString(1, bvo.getSearchContent());
			}
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO data = new BoardVO();
				data.setNum(rs.getInt("NUM"));
				data.setTitle(rs.getString("TITLE"));
				data.setWriter(rs.getString("WRITER"));
				boardList.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return boardList;
	}
	
}
