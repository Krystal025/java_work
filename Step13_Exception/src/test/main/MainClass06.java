package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass06 {
	public static void main(String[] args) {
		Random ran = new Random();
		//0~4사이의 랜덤한 정수 얻어내기
		int ranNum = ran.nextInt(5);
		//우연히 가장 큰 수가 나오면 WowException을 발생시키기
		if(ranNum==4) {
			//throw예약어와 함께 예외 객체를 생성하면 예외가 발생한다
			throw new WowException("놀랍네");
		}
		System.out.println("main 메소드가 종료합니다");
	}
}
