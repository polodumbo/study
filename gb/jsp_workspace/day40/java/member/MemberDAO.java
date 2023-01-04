package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCUtil;

public class MemberDAO {
	Connection conn;
	PreparedStatement pstmt;
	final String INSERT = "INSERT INTO MEMBER VALUES(?,?,?)";
	final String UPDATE = "UPDATE MEMBER SET PW=? WHERE ID=?";
	final String DELETE = "DELETE FROM MEMBER WHERE ID=?";
	final String SELECTONE = "SELECT * FROM MEMBER WHERE ID=?";
	final String SELECTALL = "SELECT * FROM MEMBER";

	public boolean insert(MemberVO mvo) {
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, mvo.getId());
			pstmt.setString(2, mvo.getPw());
			pstmt.setString(3, mvo.getName());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return true;
	}

	public boolean update(MemberVO mvo) {
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(1, mvo.getPw());
			pstmt.setString(2, mvo.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return true;
	}

	public boolean delete(MemberVO mvo) {
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, mvo.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return true;
	}

	public MemberVO selectOne(MemberVO mvo) {
		MemberVO data = null;
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(SELECTONE);
			pstmt.setString(1, mvo.getId());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				data = new MemberVO();
				data.setId(rs.getString("ID"));
				data.setName(rs.getString("NAME"));
				data.setPw(rs.getString("PW"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			JDBCUtil.disconnect(conn, pstmt);
		}
		return data;
	}

	public ArrayList<MemberVO> selectAll(MemberVO mvo) {
		ArrayList<MemberVO> datas = new ArrayList<MemberVO>();
		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(SELECTALL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberVO data = new MemberVO();
				data.setId(rs.getString("ID"));
				data.setName(rs.getString("NAME"));
				data.setPw(rs.getString("PW"));
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
