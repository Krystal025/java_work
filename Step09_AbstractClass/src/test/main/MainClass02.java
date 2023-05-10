package test.main;

import test.mypac.MyWeapon2;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		
		Weapon w1 = new MyWeapon2();
		w1.preapre();
		w1.attack();  //이 메소드가 공중 공격하도록 프로그래밍해보세요
	}
}
