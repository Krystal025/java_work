package real.main;

import real.dao.FriendsDao;
import real.dto.FriendsDto;

public class List {
	public static void main(String[] args) {
		java.util.List<FriendsDto> list = new FriendsDao().getList();
		for(FriendsDto tmp:list) {
			System.out.println(tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getHeight()+" | "+tmp.getMajor());
		}
	}
}
