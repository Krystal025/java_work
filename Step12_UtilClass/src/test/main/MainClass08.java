package test.main;

import java.util.HashSet;
import java.util.Set;

public class MainClass08 {
	public static void main(String[] args) {
	/*
	* HashSet은 Set 인터페이스를 구현한 클래스이다
	* 
	* - 순서가 없다
	* - key값도 없다
	* - 중복을 허용하지 않는다
	* - 어떤 data를 묶음(집합)으로 관리하고자 할 떄 사용한다
	*/
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(10);
		set1.add(20);
		
		//문자열을 저장할 수 있는 HashSet객체
		Set<String> set2 = new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("kim");
		set2.add("lee");
		
		System.out.println(set1);
		System.out.println(set2);
	}
}