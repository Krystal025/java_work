package test.main;

import test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		// Member 객체를 생성히고
		Member mem1 = new Member();
		// 필드를 직접 참조해서 회원정보를 저장하기
		mem1.num = 1;
		mem1.name = "수정";
		mem1.addr = "서울";

		Member mem2 = new Member(2, "희진", "춘천");
	}
}
