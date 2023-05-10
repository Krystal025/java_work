package test.main;

import test.mypac.AndroidPhone;
import test.mypac.CellPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//자식에게 사준 일반 휴대폰 (인터넷이 안됨)
		CellPhone p1 = new CellPhone();
		
		//Android 휴대폰이 가지고싶은 자식
		AndroidPhone p2 = (AndroidPhone) p1;
		
		p2.doInternet();
		
	}
}
