package test.mypac;

/*
 * 새로운 스레드를 만드는 방법
 * 
 * 1. Thread 클래스를 상속받은 클래스를 정의한다
 * 2. run() 메소드를 오버라이드 한다
 * 3. run() 메소드 안에서 새로운 스레드에서 해야할 작업을 코딩한다
 * 4. 만든 클래스로 객체를 생성하고 해당 객체의 start()메소드를 호출하면 
 * 	  새로운 스레드가 시작된다 
 */
public class AnotherThread extends Thread {
	
	//2. 독립적으로 작업하고 싶은 내용을 내부에 작성 
	@Override
	public void run() {
		System.out.println("작업을 시작합니다");
		//10초가 걸리는 작업이라고 가정
		try {
			Thread.sleep(10000);
		}catch(InterruptedException el) {
			el.printStackTrace();
		}
		System.out.println("작업이 끝났습니다");
	}
}
