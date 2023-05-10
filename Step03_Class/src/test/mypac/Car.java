package test.mypac;

/*
 * class의 역할
 * 
 * 1. 객체의 설계도 역할
 * - 객체는 heap 영역(사물함)에 들어있는 '물건', 참조값이 아님!!
 * - class를 이용해서 객체를 원하는 시점에 원하는 개수만큼 만들어 낼수있다
 * - 만들어진 객체가 어떤 저장소(field)와 어떤 기능(method)을 가지게 할지 class로 설계할 수 있다
 * 
 * 2. data type 역할
 * 
 * 3. static 필드와 메소드를 포함하는 역할 
 */
public class Car {
	/*
	 * [필드 정의하기] 클래스명 {}중괄호 안에 아래와 같은 형식으로 필드를 정의할수 있다 초깃값을 부여하지 않으면 기본값이 들어간다 int의
	 * 기본값은 0, boolean의 기본값은 false, 참조 데이터타입의 기본값은 null
	 * 
	 * 접근지정자 data type 필드명 = 초깃값
	 */
	public String name; // null이 들어감
	public int price; // 0이 들어감

	/*
	 * [메소드 정의하기]
	 * 
	 * 접근지정자 return type 메소드명(){ }
	 */
	public void drive() {
		// drive()메소드가 call되었을 떄 실행할 java code를 모아 놓음
		System.out.println("달려요!");
	}
	public void showInfo() {
		System.out.println("차의 이름은 "+ this.name +"이고 가격은"+ this.price+"만원입니다");		
	}
}
