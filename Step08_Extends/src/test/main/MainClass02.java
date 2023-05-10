package test.main;

import test.mypac.CellPhone;
import test.mypac.Phone;

/*
 * 지역변수나 필드앞에 선언하는 data type은 참조 데이터타입
 * 그 앞에 들어있는 참조값이 사용설명서라고 생각하면 된다
 * 그렇기 때문에 그 지역변수나 필드에 .점을 찍으면 사용설명서에 명시된 기능만 사용할 수 있다
 * JAVA의 모든 객체는 다형성을 가질수 있다
 * 다형성은 type이 여러개라는 의미다
 */

public class MainClass02 {
	public static void main(String[] args) {
		//CellPhone 객체를 생성해서 나온 참조값을 CellPhone type 지역변수 p1에 담기
		CellPhone p1 = new CellPhone();
		//CellPhone 객체를 생성해서 나온 참조값을 Phone type 지역변수 p2에 담기
		Phone p2 = new CellPhone();
		//CellPhone 객체를 생성해서 나온 참조값을 Object type 지역변수 p3에 담기
		Object p3 = new CellPhone();
	}	
}
