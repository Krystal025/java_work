package test.main;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 * 3. 우연히 3개가 모두 같게 나왔을 때에는 "당첨되었습니다!"를 출력하고 
		 * 	  하나라도 다르면 "꽝"을 출력하도록 프로그래밍 해보세요
		 */
		String[]items = {"cherry", "apple", "banana", "melon", "7"};
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran = new Random();
		//정수 3개를 저장할 배열을 미리 준비하기
		
		int[] nums = new int[3];
		//3회 반복하면서 
		for(int i=0; i<3; i++) {
			//0~4 사이의 랜덤한 숫자를 하나 얻어내서 
			int ranNum = ran.nextInt(5);
			//알아낸 숫자를 배열의 i번째 방에 저장하기
			nums[i]=ranNum;
			System.out.print(items[ranNum]);
			if(i<2) {
				System.out.print(" | ");
			}
		}
		System.out.println(); //개행기호만 출력 
		
		if(nums[0]==nums[1]&&nums[1]==nums[2]) {
			System.out.println("당첨되었습니다!");
		}else {
			System.out.println("꽝");
		}
	
	}
}
