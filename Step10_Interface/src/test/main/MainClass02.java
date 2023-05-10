package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.YourRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		//직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon()메소드를 여기서 호출해보세요
		YourRemocon r4 = new YourRemocon();
		useRemocon(r4);
		//추가한 기능도 호출해보기
		r4.reserve();
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		//만일 여기서 reserve()메소드를 활용하고 싶다면 
		YourRemocon r2 = (YourRemocon)r;
		r2.reserve();
	}
}
