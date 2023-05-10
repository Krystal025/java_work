package test.main;
import java.io.File;

import test.mypac.Airplane;
import test.mypac.Test;
public class MainClass01 {
	public static void main(String[] args) {
		Test t=new Test();
		//return type의 void인 메소드 호출
		t.walk();
		//return type이 int인 메소드 호출하고 리턴되는 값을 a라는 int type 지역변수에 담기
		int a = t.getNumber();
		//return type이 String인 메소드 호출하고 리턴되는 값을 b라는 String type지역변수에 담기
		String b = t.getGreeting();
		//return type이 Airplane인 메소드를 호출하고 리턴되는 값을 c라는 Airplane type지역변수에 담기
		Airplane c =t.getPlane();
		
		//위에서 생성한 객체의 setNum() 메서드를 호출해 보세요
		t.setNum(999);
		//위에서 생성한 객체의 setName() 메서드를 호출해 보세요
		t.setName("a");
		//위에서 생성한 객체의 setPlane() 메서드를 호출해 보세요
		t.setPlane(new Airplane());
		
		t.send();
		t.send(20);
		t.send("SuJeong");
		t.send(new Airplane());
		System.out.println("main 메소드가 종료됩니다");
	}
}
