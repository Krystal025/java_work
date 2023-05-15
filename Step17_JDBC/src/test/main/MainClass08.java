package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.mypac.Member;

public class MainClass08 {
	public static void main(String[] args) {
		//수정할 회원의 정보라고 가정
		int num = 1;
		String name = "이정호";
		String addr = "아현동";
		
		//아래의 update()메소드를 이용해서 회원정보를 수정하시오 
		Member m = new Member();
		m.name = name;
		m.addr = addr;
		m.num = num;
		
		MainClass08.update(m);
	}
	
	public static void update(Member mem) {
		//Member객체에 담긴 정보를 이용해서 회원정보를 수정하시오
		Connection conn = null;
		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//mem에 담겨진 정보를 이용해서 회원 한명의 정보를 DB에 저장되도록 해보세요
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성의 sql문
			String sql = "UPDATE member" 
					+ " SET name=?, addr=?"
					+ " WHERE "
					+ "num=?"; 
			// 미완성의 sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체의 메소드를 이용해서 미완성인 sql문을 완성시키기 (?에 바인딩)
			pstmt.setString(1, mem.name); 
			pstmt.setString(2, mem.addr); 
			pstmt.setInt(3, mem.num);
			// sql문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
