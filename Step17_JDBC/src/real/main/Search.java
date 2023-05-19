package real.main;

import java.util.Scanner;

import real.dao.FriendsDao;
import real.dto.FriendsDto;

public class Search {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = scan.nextLine();
		FriendsDto dto = new FriendsDao().getData(name);
		if(dto != null) {
			System.out.println(name+"의 키는 "+dto.getHeight()+"cm이고, 전공은 "+dto.getMajor()+"입니다");
		}else {
			System.out.println(name+"은 친구가 아닙니다");
		}
	}
}
