package test.main;
/*
 * test.mypac 패키지에 클래스를 하나 만들어 보세요
 * 
 * - 사각형의 폭(width), 높이(height)를 필드에 저장할 수 있어야 합니다
 *   필드에 저장된 폭과 높이를 이용해서 사각형의 넓이를 콘솔창에 출력하는 기능을 가지고 있어야 합니다
 *   필드와 메서드는 모두 non static으로 만드세요 
 *   클래스명, 필드명, 메소드명은 자율입니다.
 */
import test.mypac.Square;
public class MainClass10 {
	public static void main(String[] args) {
	Square rl = new Square();
	rl.width=10;
	rl.height=20;
	rl.printArea();
		
	Square r2 = new Square();
	r2.width=30;
	r2.height=5;
	r2.printArea();
	}
}
