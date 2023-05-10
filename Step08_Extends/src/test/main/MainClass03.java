package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		//CellPhone 객체를 생성해서 그 참조값을 p1이라는 이름의 CellPhone type 지역젼수에 대입하기
		CellPhone p1 = new CellPhone();
		
		//p1 안에 있는 참조값을 p2라는 Phone type 지역변수에 대입하기
		Phone p2 = p1;
		
		//p1 언애 있는 참조값을 p3라는 Object type 지역변수에 대입하기
		Object p3 = p1;

		//자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다
	}
}
