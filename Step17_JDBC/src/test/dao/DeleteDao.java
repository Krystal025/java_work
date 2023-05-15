package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;
/*
 * Data Access Object 만들어보기
 * 
 * - DB에 INSERT, UPDATE, DELETE, SELECT 작업을 대신해주는 객체를 생성할 클래스 설계하기
 */
public class DeleteDao {

	//회원 한명의 정보를 저장하고 해당 작업의 성공여부를 리턴해주는 메소드
	public boolean delete(MemberDto dto) {
		
		//필요한 객체를 담을 지역변수 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		//insert, update, delete 작업을 통해서 변화된 row의 갯수를 담을 변수
		int rowCount = 0;
		try {
			//Connection객체의 참조값 얻어오기
			conn = new DBConnect().getConn();
			//실행할 sql문
			String sql="DELETE FROM member"
					+" WHERE num=?";
			//sql문을 대신 실행해줄 PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			//sql문이 ?가 존재하는 미완성이라면 여기서 완성 
			pstmt.setInt(1, dto.getNum());
			//insert or update or delete문을 실제 수행 => 변화된 row의 갯수가 리턴됨
			rowCount = pstmt.executeUpdate();  //수팽하고 리턴되는 값을 변수에 담음 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {//예외가 발생하던 안하던 실행이 보장되는 블럭에서 마무리 작업
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		if(rowCount > 0) { //변화된 row의 갯수가 0보다 크면 작업성공 
			return true;
		}else { //그렇지 않으면 작업실패
			return false;
		}
	}
}
