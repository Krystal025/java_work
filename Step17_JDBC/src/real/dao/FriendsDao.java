package real.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import real.dto.FriendsDto;
import test.dto.MemberDto;
import test.util.DBConnect;

public class FriendsDao {
	
	public FriendsDto getData(String name) {
		FriendsDto dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT num, height, major" 
					+ " FROM table명" 
					+ " WHERE name=?";
			pstmt = conn.prepareStatement(sql);
			//SELECT문이 미완성이라면 여기서 완성 
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				int height = rs.getInt("height");
				String major = rs.getString("major");
				
				dto = new FriendsDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setHeight(rs.getInt("height"));
				dto.setMajor(rs.getString("height"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;

	}
	
	public List<FriendsDto> getList(){
		List<FriendsDto> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT num, name, height, major" 
					+ " FROM friends" 
					+ " ORDER BY num ASC";
			pstmt = conn.prepareStatement(sql);
			//SELECT문이 미완성이라면 여기서 완성 
			rs = pstmt.executeQuery();
			while (rs.next()) {
				FriendsDto dto = new FriendsDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setHeight(rs.getInt("height"));
				dto.setMajor(rs.getString("major"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
	
	public boolean delete(int num) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "DELETE FROM friends"
						+" WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean update(FriendsDto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "UPDATE friends"
						+" SET name=?, height=?, major=?"
						+" WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getHeight());
			pstmt.setString(3, dto.getMajor());
			pstmt.setInt(4, dto.getNum());
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean insert(FriendsDto dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "INSERT INTO friends"
						+" (num, name, height, major)"
						+" VALUES (member_seq.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getHeight());
			pstmt.setString(3, dto.getMajor());
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
