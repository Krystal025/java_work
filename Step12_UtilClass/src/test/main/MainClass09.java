package test.main;
/*
 * while문을 활용해서 원하는 횟수만큼 반복하기
 * 
 * 반복횟수가 명확히 정해져있으면 for문으로 반복문을 도는게 좋음
 * 반복횟수가 명확하지 않고 반복을 돌아봐야 횟수를 아는 경우 while문으로 도는게 좋음 
 */
public class MainClass09 {
	public static void main(String[] args) {
		//카운트를 셀 변수를 미리 만들어서 0으로 초기화
		int count = 0;
		//무한루프로 돌다가
		while(true) {
			System.out.println("안녕!");
			count++;
			//특정 조건 내에서 무한루프 빠져나오기
			if(count==5) {
				break;
			}
		}
		System.out.println("-----------");
		
		//카운트를 다시 0으로 만들고 
		int i=0;
		//카툰트가 5보다 작은 동안 반복문 수행하기
		while(i<5) {
			//원하는 작업하고
			System.out.println("안녕!");
			//i를 1증가시킨다
			i++;
		}
	}
}
