package test.dept;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class Delete {
	public static void main(String[] args) {
		int deptno = 50;
		
		DeptDto dto = new DeptDto();
		dto.setDeptno(deptno);
		
		DeptDao dao = new DeptDao();
		boolean isSuccess = dao.delete(deptno);
		if(isSuccess) {
			System.out.println("삭제했습니다");
		}
	}
}
