package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 3;  //삭제할 회원의 번호
		
		//아래의 delete()메소드를 이용해서 회원정보를 삭제하시오 
		delete(num);
		
	}
	public static void delete(int num) {
		//인자로 전달된 num에 해당하는 회원정보를 삭제하는 기능을 완성하시오
		//DBConnect 클래스를 활용할 것
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "DELETE FROM member"
					+ " WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("회원정보를 삭제했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
