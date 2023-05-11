package frame07;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
	// 생성자
	public MyFrame(String title) {
		super(title);

		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// 전송버튼의 참조값을 필드에 저장 (this.은 생략가능)
		JButton sendBtn = new JButton("전송");
		add(sendBtn);

		JButton deleteBtn = new JButton("삭제");
		add(deleteBtn);

		JButton updateBtn = new JButton("수정");
		add(updateBtn);

		// 전송, 삭제, 수정 버튼 모두 다 하나의 리스너 등록하기
		sendBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);

		// 각각의 버튼에 action 명령을 설정할 수 있다
		sendBtn.setActionCommand("send");
		deleteBtn.setActionCommand("delete");
		updateBtn.setActionCommand("update");
		// 프레임을 화면상에 실제로 보이게 하기 (false하면 보이지 않음)
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// MyFrame 객체 생성
		new MyFrame("나의 프레임");
		System.out.println("main 메소드가 종료됩니다");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 메소드의 매개변수로 전달되는 ActionEvent 객체에 이벤트에 대한 정보가 들어있따
		// 이 객체를 활용하면 어떤 버튼이 눌러졌는지 구별할 수 있다
		
		String cmd = e.getActionCommand();
		/*
		 * JAVA에선 문자열의 참조값이 같은지 비교할 때에는 비교연산자 ==를 이용해서 비교하지만 문자열의 참조값이 아닌 내용이 같은지 비교할 때는
		 * String의 .equals()메소드를 이용해서 비교한다 왜냐하면 JAVA에서는 문자열을 만드는 방법에 따라서 내용은 같지만 참조값이
		 * 다르게 나오는 경우도 있기 때문이다 따라서 문자열의 내용이 같은지 정확히 비교할 때는 반드시 .equals()메소드를 이용해야한다
		 */
		if (cmd.equals("send")) {
			JOptionPane.showMessageDialog(this, "전송합니다");
		} else if (cmd.equals("delete")) {
			JOptionPane.showMessageDialog(this, "삭제합니다");
		} else if (cmd.equals("update")) {
			JOptionPane.showMessageDialog(this, "수정합니다");
		}
	}
}
