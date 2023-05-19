package test.main;

import java.util.List;

import test.dao.EmpDao;
import test.dto.EmpDto;


public class MainClass20 {
	public static void main(String[] args) {
		
		List<EmpDto> list = new EmpDao().getList();
		for(EmpDto tmp:list) {
			System.out.println(tmp.getEmpno()+" | "+tmp.getEname()+" | "+tmp.getDeptno()+" | "+tmp.getJob());
		}
	}
}
