package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.dto.MemberDto;
import test.util.DBConnect;

public class DeptDao {
	
	//getData() : 번호에 해당하는 부서의 정보를 반환하는 메소드 
	public DeptDto getData(int deptno) {
		
		DeptDto dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT dname, loc" + " FROM dept" + " WHERE deptno=?";
			pstmt = conn.prepareStatement(sql);
			//SELECT문이 미완성이라면 여기서 완성 
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 현재 커서가 존재하는 row 에 있는 정보를 추출해서 사용
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				// DeptDto 객체에 한 부서의 정보를 담음
				dto = new DeptDto();
				dto.setDeptno(deptno);
				dto.setDname(dname);
				dto.setLoc(loc);
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
	
	// getList() : 전체부서의 정보를 반환하는 메소드 
	public List<DeptDto> getList(){
		// 부서정보를 누적할 배열객체 
		List<DeptDto> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT deptno, dname, loc" + " FROM dept" + " ORDER BY deptno ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DeptDto dto = new DeptDto();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {}
		}
		return list;
	}
	
	// delete()
	public boolean delete(int deptno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "DELETE FROM dept" + " WHERE deptno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
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
	
	// update()
	public boolean update(DeptDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "UPDATE dept" + " SET dname=?, loc=?" + " WHERE deptno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDeptno());
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

	// insert()
	public boolean insert(DeptDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "INSERT INTO dept" + " (deptno, dname, loc)" + " VALUES( ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
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
