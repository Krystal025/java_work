package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//아래의 useRemocon()메소드를 호출하기 위해서는 Remocon 인터페이스 type의 참조값이 필요하다
		//익명의 Local Inner Class를 이용해서 Remocon type의 참조값을 만들어내서 호출해보자
		Remocon r1 = new Remocon() {
			@Override
			public void up() {
				System.out.println("크기를 키워요");
			}

			@Override
			public void down() {
				System.out.println("크기를 줄여요");
			}
		};
		useRemocon(r1);
		
		//즉석에서 만들고 호출할 때 
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("온도를 올려요");
			}
			@Override
			public void down() {
				System.out.println("온도를 내려요");
			}
		});
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}