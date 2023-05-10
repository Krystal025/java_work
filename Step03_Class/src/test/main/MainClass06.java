package test.main;

import test.mypac.myUtil;

public class MainClass06 {
	public static void main(String[] args) {
		//MyUtil 클래스의 send()메소드 호출해보기
		myUtil.send();
		//MyUtil 클래스의 version필드 참조해보기
		String v=myUtil.version;
		
		System.out.println("안녕");
	}
}
