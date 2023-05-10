package frame04;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		
		//setBounds(x, y, width, height) 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		//프레임(MyFrame)의 x버튼(close버튼)을 눌렀을 떄 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저는 아직 사용하지 않을 것(모든 UI를 절대 좌표에 배치하겠
		
		//FlowLayout 매니저 사용해보기
		setLayout(new BorderLayout());
		//프레임에 버튼 추가하기
		
		JButton btn1 = new JButton("버튼1");
		add(btn1, BorderLayout.NORTH);
		
		JButton btn2 = new JButton("버튼2");
		add(btn2, BorderLayout.EAST); //프레임에 버튼추가 
		
		JButton btn3 = new JButton("버튼3");
		add(btn3, BorderLayout.SOUTH); //프레임에 버튼추가 
		
		JButton btn4 = new JButton("버튼4");
		add(btn4, BorderLayout.WEST); //프레임에 버튼추가
		
		//프레임을 화면상에 실제로 보이게 하기 (false하면 보이지 않음)
		this.setVisible(true);
	}
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료됩니다");
	}
}
