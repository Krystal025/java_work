package test.main;

import test.dao.DeleteDao;
import test.dao.MemberDao;
import test.dao.UpdateDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		//추가할 회원의 정보
		String name1 = "김희진";
		String addr1 = "춘천";
		//추가할 회원의 정보를 MemberDto 객체에 담는다
		MemberDto dto = new MemberDto();
		dto.setName(name1);
		dto.setAddr(addr1);
		//DB에 저장하기
		new MemberDao().insert(dto);
		
		String name2 = "김영현";
		String addr2 = "부여";
		int num2 = 2;
		dto.setName(name2);
		dto.setAddr(addr2);
		dto.setNum(num2);
		new UpdateDao().update(dto);
		
		int num3 = 5;
		dto.setNum(num3);
		new DeleteDao().delete(dto);
	}
}
