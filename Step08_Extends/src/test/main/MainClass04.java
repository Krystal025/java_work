package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//CellPhone 객체를 생성해서 나온 참조값을 Object type p3라는 지역변수에 담아보세요
		Object p3 = new CellPhone();
		//Object type p3 변수에 담긴값을 Phone type p2라는 변수에 담기
		Phone p2 = (Phone)p3; //casting
		//Object type p3 변수에 담긴값을 CellPhone type p1이라는 변수에 담기
		CellPhone p1 = (CellPhone)p3;
	}
}
