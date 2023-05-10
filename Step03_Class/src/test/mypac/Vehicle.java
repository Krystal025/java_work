package test.mypac;
import test.mypac.Bus;
import test.mypac.Taxi;
import test.mypac.Subway;
import test.mypac.Tire;

public class Vehicle {
	public static void main(String[] args) {
		
		//설계된 Car 클래스로 객체를 생성해서 참조값을 myTaxi 이라는 지역변수에 담아보세요
		// 택시 요금 4800원, 색깔 "yellow"
		Taxi myTaxi = new Taxi();
		myTaxi.charge = 4800;
		myTaxi.Color = "yellow";
		
		//설계된 Car 클래스로 객체를 생성해서 참조값을 myBus 이라는 지역변수에 담아보세요 
		// 버스 요금 : 1200원
		Bus myBus = new Bus();
		myBus.charge = 1200;
		
		// Subway 클래스 만들기 > charge
		Subway mySubway = new Subway();
		mySubway.charge = 1000;
		
		
		
		// Tire 클래스로 객체를 생성해서 참조값이 각각 tire1, tire2 이라는 지역변수에 담아보세요
		Tire tire1 = new Tire();
		Tire tire2 = new Tire();
		// tire1 브랜드 kumho, tire2 브랜드 hankook
		tire1.tireBrand = "kumho";
		tire2.tireBrand = "hankook";
		// 금호타이어 색깔 : black , 한국타이어 색깔 : blue
		tire1.color = "black";
		tire2.color = "blue";
		// 타이어 점검 호출
		tire1.check();
		
		// "택시 요금 : " , 
		// "금호 타이어 색깔 : " 
		System.out.println("택시요금 : "+myTaxi.charge);
		System.out.println(tire1.tireBrand+"타이어 색깔 : "+tire1.color);
		System.out.println("대중교통 요금 총합 : "+ (myTaxi.charge+myBus.charge+mySubway.charge));
		
		tire1.tireInfo();
		
		tire2.tireInfo();
	}
}
