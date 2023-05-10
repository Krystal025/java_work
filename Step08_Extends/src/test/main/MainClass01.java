package test.main;

import test.mypac.CellPhone;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * Phone 클래스를 상속받을 CellPhone 클래스로 객체를 생성해서 
		 * 그 참조값을 p1이라는 이름의 지역변수에 담기
		 */
		CellPhone p1 = new CellPhone();
		/*
		 * CellPhone 클래스의 생성자를 호출해서 객체를 생성했더니
		 * Phone클래스의 생성자도 호출되는 것을 알 수 있다
		 * 
		 * 따라서 cellPhone 객체도 생성되고 Phone객체도 같이 생성되었다는 것을 유추할 수 있따
		 * 
		 * Phone객체의 CellPhone 객체가 생성되어서 같은 사물함에 들어간다
		 * 
		 * 즉, 하나의 참조값으로 Phone의 기능, CellPhone의 기능을 모두 사용할 수 있다 
		 */
		p1.call();
		p1.mobileCall();
		p1.takePicture();
	}
	
}
