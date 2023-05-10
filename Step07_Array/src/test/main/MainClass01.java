package test.main;
/*
 * JAVA에서 배열도 객체이다
 * 즉 배열은 참조데이터 type이다 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//int type 5개를 저장하고 있는 배열객체를 생성해서 참조값을 nums라는 지역변수에 담기
		int[] nums = {10, 20, 30, 40, 50};
		//double type 5개를 져장하고 있는 배열
		double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5};
		//boolean type 5개를 저장하고 있는 배열
		boolean[] truth = {true, false, false, true, true};
		//String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] names = {"김구라", " 해골", "원숭이", "주뎅이", "덩어리"};
		
		//배열객체에는 clone()이라는 메소드와 length라는 필드가 있다
		int[] result=nums.clone();
		//배열의 크기 알아내기
		int size=nums.length;
		//배열은 순서가 있는 데이터다. 특정 index의 item을 참조하는 방법
		int first = nums[0];
		int second = nums[1];
		int third = nums[2];
	}
}
