package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	static class MyWeapon3 extends Weapon{
		@Override
		public void attack() {
			System.out.println("해상 공격을 합니다");	
		}
	}
	
	public static void main(String[] args) {
		//바다를 공격하는 무기를 만들어서 사용하고 싶음 
		Weapon w1 = new MyWeapon3();
		w1.preapre();
		w1.attack();
		
		//우주를 공격하는 부기를 만들어서 이용하고 싶음
		class MyWeapon4 extends Weapon{
			@Override
			public void attack() {
				System.out.println("우주를 공격합니다");
			}
		}
		Weapon w2 = new MyWeapon4();
		w2.preapre();
		w2.attack();
	}
}
