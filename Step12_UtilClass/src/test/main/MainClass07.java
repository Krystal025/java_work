package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 세명의 회원정보(번호, 이름, 주소)를 HashMap객체에 각각 담아서
		 * 
		 * ArrayList 객체에 누적시켜보세요
		 * 
		 * 반복문 돌면서 ArrayList 객체에 누적된 회원정보를 콘솔창에 순서대로 출력해보세요
		 * 
		 * (HashMap 객체 3개, ArrayList 객체 1개가 생성되어야함)
		 * 
		 * ArrayList 객체 안에 HashMap을 담을 예정이니
		 * 
		 * List<HashMap<String, Object>> type이 필요합니다 
		 */
		List<HashMap<String, Object>> list = new ArrayList<>();
		
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김희진");
		map1.put("addr", "춘천");
		
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "김수정");
		map2.put("addr", "서울");
		
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "김영현");
		map3.put("addr", "부여");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		//확장 for문
		for(HashMap<String, Object> tmp:list) {
			int num = (int)tmp.get("num");
			String name = (String)tmp.get("name");
			String addr = (String)tmp.get("addr");
			System.out.println("num:"+num+", name:"+name+", addr:"+addr);
		}

	}
}
