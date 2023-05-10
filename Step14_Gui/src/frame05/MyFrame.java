package frame05;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	//생성자
	public MyFrame(String title) {
		super(title);
		
		//setBounds(x, y, width, height) 창의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		//프레임(MyFrame)의 x버튼(close버튼)을 눌렀을 떄 프로세스도 같이 종료되도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저는 아직 사용하지 않을 것(모든 UI를 절대 좌표에 배치하겠
		
		//FlowLayout 매니저 사용해보기
		setLayout(new FlowLayout());
		//프레임에 버튼 추가하기
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		
		
		Component a = this;
		
		//ActionListener 인터페이스 type의 참조값을 얻어내서
		ActionListener listener1 = new ActionListener() {
			//이 리스너를 등록한 UI에 어떤 액션이 발생하면 호출되는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("전송버튼을 누름");
				// JOptionPane.showMessageDialog(프레임의 참조값, 띄울 메세지);
				// 클래스명.this하면 바깥에 있는 클래스로 생성한 객체의 참조값을 가리킬 수 있음
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다!");
			}
		};
		//전송버튼에 등록하기
		sendBtn.addActionListener(listener1);
		
		JButton deleteBtn = new JButton("삭제");
		add(deleteBtn);
		
//		deleteBtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("삭제버튼을 누름");
//			}	
//		});
		//ActionListener 인터페이스 타입의 참조값을 함수 형태로 전달가능
		deleteBtn.addActionListener((e)->{
			System.out.println("삭제버튼을 누름");
			//함수형태의 메소드에서 this는 바깥 클래스로 생성한 객체의 참조값을 가리킬 수 있다 
			JOptionPane.showMessageDialog(this, "삭제합니다");
		});

		JButton updateBtn = new JButton("수정");
		add(updateBtn);
		//MyFrame을 ActionListener 인터페이스 타입으로 만들수 없을까? 
		updateBtn.addActionListener(this);
		
		//프레임을 화면상에 실제로 보이게 하기 (false하면 보이지 않음)
		this.setVisible(true);
	}
	public static void main(String[] args) {
		//MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료됩니다");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "수정합니다");
	}
}
