package test.main;

import test.mypac.Cpu;
import test.mypac.Memory;
import test.mypac.HardDisk;
import test.mypac.MacBook;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담아보세요
		 * 
		 * 주의! - MacBook클래스를 수정하지 마시오 - MainClass03은 test.main 패키지에 있고 Cpu, Memory,
		 * HardDisk, MackBook 클래스는 test.mypac패키지에 있기 때문에 4개의 클래스 모두 import되어야 한다
		 */
		MacBook mac1 = new MacBook(new Cpu(), new Memory(), new HardDisk());
		// mac1. 점을 찍고 확인해도 private으로 설정되어 확인할 수 없음
		MacBook mac2 = new MacBook(null, null, null);

		mac1.doGame();
		mac2.doGame();
		
		Cpu c = new Cpu();
		Memory m = new Memory();
		HardDisk h = new HardDisk();
		//생성자의 인자로 전달할 값이 지역변수에 있는 경우 지역변수를 참조해서 전달할수도 있다
		MacBook mac3 = new MacBook(c,m,h);
	}
}
