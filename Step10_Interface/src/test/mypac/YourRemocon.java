package test.mypac;

public class YourRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("볼륨을 올려요");
	}

	@Override
	public void down() {
		System.out.println("볼륨을 내려요");
	}
	//추가로 사용할 메소드를 만들고 싶다면 
	public void reserve() {
		System.out.println("취침 예약을 합니다");
	}
}
