package frame01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//필드
	JTextField num, name, addr;
	JButton sendBtn;
	private static Connection conn;
	
	//생성자
	public MyFrame(String title) {
		super(title);
		
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		num = new JTextField(10);
		name = new JTextField(10);
		addr = new JTextField(10);
		sendBtn = new JButton("저장");
		
		add(num);
		add(name);
		add(addr);
		add(sendBtn);
		
		sendBtn.addActionListener(this);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		conn = null;
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
		new MyFrame("회원정보 입력");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PreparedStatement pstmt = null;
		try {
			String val1 = num.getText();
			String val2 = name.getText();
			String val3 = addr.getText();
			int num1 = Integer.parseInt(val1);
			
			String sql = "UPDATE member" 
					+ " SET name= ?, addr= ?"
					+ " WHERE num= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, val2);
			pstmt.setString(2, val3);
			pstmt.setInt(3, num1);
			pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다");
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}
}
