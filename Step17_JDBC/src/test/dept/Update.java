package test.dept;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class Update {
	public static void main(String[] args) {
		int deptno = 40;
		String dname = "FINANCE";
		String loc = "TEXAS";
		
		DeptDto dto = new DeptDto();
		dto.setDeptno(deptno);
		dto.setDname(dname);
		dto.setLoc(loc);
		
		DeptDao dao = new DeptDao();
		boolean isSuccess = dao.update(dto);
		if(isSuccess) {
			System.out.println("수정했습니다");
		}
	}
}
