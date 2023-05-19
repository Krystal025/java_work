package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.dto.EmpDto;
import test.util.DBConnect;

public class EmpDao {

	
	// getList() : 전체부서의 정보를 반환하는 메소드 
		public List<EmpDto> getList(){
			// 부서정보를 누적할 배열객체 
			List<EmpDto> list = new ArrayList<>();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = new DBConnect().getConn();
				String sql = "SELECT empno, ename, deptno, job" + " FROM emp" + " ORDER BY empno ASC";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					EmpDto dto = new EmpDto();
					dto.setEmpno(rs.getInt("empno"));
					dto.setEname(rs.getString("ename"));
					dto.setDeptno(rs.getInt("deptno"));
					dto.setJob(rs.getString("job"));
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

}
