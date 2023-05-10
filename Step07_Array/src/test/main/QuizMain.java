package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 1. run했을 떄
		 *   cherry, apple, banana, melon, 7
		 *   5개의 문자열 중에서 1개가 랜덤하게 출력되게 하시오
		 */
		String[] fruits = {"cherry", "apple", "banana", "melon", "7"};
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();
		//0~4 사이의 랜덤한 숫자를 하나 얻어내서
		int ranNum = ran.nextInt(5);
		//배열의 인덱스로 활용해서 문자열 출력하기 
		System.out.println(fruits[ranNum]);
	}
}
