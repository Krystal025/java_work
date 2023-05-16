package test.dept;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class Insert {
	public static void main(String[] args) {
		String dname = "PROGRAMMING";
		String loc = "CLORADO";
		int deptno = 50; 
		
		DeptDto dto = new DeptDto();
		dto.setDname(dname);
		dto.setLoc(loc);
		dto.setDeptno(deptno);
		
		DeptDao dao = new DeptDao();
		boolean isSuccess = dao.insert(dto);
		if(isSuccess) {
			System.out.println("추가했습니다");
		}
	}
}
