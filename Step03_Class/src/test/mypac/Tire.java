package test.mypac;

public class Tire {
	
	public String tireBrand;
	public String color;
	
	public void check() {
		System.out.println(tireBrand +" " +color + " 타이어 점검");
	}
	
	public void tireInfo() {
		// 타이어브랜드 :
		// 타이어 색 :
		System.out.println("타이어 브랜드 : " + tireBrand +" \n타이어색 " + color);
		System.out.println("이 타이어는 최고에여 진짜 짱입니다. 다른 타이어랑 비교할 수 없습니다. 믿고 구매해보세요");
	}
}
