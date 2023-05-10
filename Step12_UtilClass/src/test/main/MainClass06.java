package test.main;

import java.util.HashMap;

import test.mypac.Car;
/*
 * JAVA에서 어떤 데이터를 key : value의 쌍으로 관리하고 싶으면
 * HashMap 객체를 사용한다
 * key의 generic도 마음대로 지정할 수 있지만 보통 String type을 쓴다
 * value의 generic은 그때 그때 다르지만 value가 여러 type이면
 * Object로 지정한다 
 */
public class MainClass06 {
	public static void main (String[] args) {
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("num", 1); //Integer type 담기
		map1.put("name", "김수정"); //String type 담기
		map1.put("isMale", false); //Boolean type 담기
		map1.put("car", new Car("Lexus")); //Car type 담기
		/*
		 * value의 generic 클래스가 Object로 지정되어있기 떄문에
		 * 리턴되는 Object type을 원래 type으로 Casting 해야함 
		 */
		int num = (int)map1.get("num");
		String name = (String)map1.get("name");
		Boolean isMale = (Boolean)map1.get("isMale");
		Car car = (Car)map1.get("car");
		
		//동일한 key값으로 다시 담으면 수정
		map1.put("name", "에이콘");
		//특정 key값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false리턴
		map1.remove("isMale");
		//모두 삭제
		map1.clear();
	}
}
