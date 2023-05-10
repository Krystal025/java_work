package test.main;

import test.mypac.Car;

public class MainClass01 {
	// run했을 때 실행의 흐름이 시작되는 특별한 main 메소드
	public static void main(String[] args) {

		// Car 클래스로 객체를 생성하고 생성된 개게의 참조값을 car1이라는 지역변수에 담기
		Car car1 = new Car();
		// Car 객체의 참조값에 .찍어서 메소드 호출하기
		car1.drive();
		//Car 객체의 참조값에 .찍어서 필드 참조하기 (참조해서 값 대입하기)
		car1.name="소나타";
		car1.price=1000;
		//같은 데이터 타입으로 만들어 냈지만 갖고있는 데이터는 다름 
		Car car2 = new Car();
		car2.drive();
		car2.name="그랜저";
		car2.price=2000;
		
		boolean result = car1 == car2;   //false
		boolean result2 = car1.name == car2.name;  //false
	}
}
