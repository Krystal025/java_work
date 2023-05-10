package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("김수정");
		names.add("고가현");
		names.add("이진영");
		names.add("최유진");
		
		//반복자(Iterator)객체 얻어내기 (저장된 item을 일렬로 세웠다고 생각)
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			// cursor를 다음칸으로 이동해서 커서가 위치한 곳의 item을 읽어오기
			String item = it.next();
			System.out.println(item);
		}
		System.out.println("------------");
		names.forEach((item)->{
			System.out.println(item);
		});
		
		//특정 item(데이터, 참조값) 존재 여부 알아내기
		boolean isContain = names.contains("김수정");
		//저장된 item의 갯수
		int size = names.size();
		//특정 item 삭제
		names.remove("김수정");
		//모든 item 삭제
		System.out.println(isContain);
		System.out.println(size);
		System.out.println(names);
		
		names.clear();
	}
}