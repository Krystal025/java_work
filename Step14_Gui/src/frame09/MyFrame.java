package frame09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	//필드
	JTextField input1, input2;
	JLabel output;
	
	//생성자
	public MyFrame(String title) {
		super(title);
		
		setBounds(100, 100, 700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		input1 = new JTextField(10);
		input2 = new JTextField(10);
		JButton add = new JButton("+");
		JButton sub = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		JLabel equal = new JLabel("=");
		output = new JLabel("0");
		
		add(input1);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(input2);
		add(equal);
		add(output);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		//버튼에 action command 설정하기
		add.setActionCommand("add");
		sub.setActionCommand("sub");
		mul.setActionCommand("mul");
		div.setActionCommand("div");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame("계산기");
	}
	//AcrionListener를 구현했기 떄문에 강제 override 해야하는 부분 
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String val1 = input1.getText(); 
			String val2 = input2.getText();
			//입력한 문자열을 실수로 변경하기
			double num1 = Double.parseDouble(val1);
			double num2 = Double.parseDouble(val2);
			
			double result = 0;
			//command가 무엇이냐를 확인해서 분기하기 
			String cmd = e.getActionCommand();
			//연산의 결과값을 담을 변수를 미리 선언하고 초기값 대입하기
			//미리 선언하는 이유 : 그래야 if문 바깥에서 result 변수 사용가능 
			if(cmd.equals("add")) {
				result = num1+num2;
			}else if(cmd.equals("sub")) {
				result = num1-num2;
			}else if(cmd.equals("mul")) {
				result = num1*num2;
			}else if(cmd.equals("div")) {
				if(num2 == 0) {
					JOptionPane.showMessageDialog(this, "0으로 나눌수는 없습니다");
					//메소드를 여기서 종료시키기 
					return;
				}
				result = num1/num2;
			}
			//숫자(double)를 문자열(String)로 바꾸기
			String resultTxt = Double.toString(result);
			//결과값을 JLable에 출력하기 
			output.setText(resultTxt);
		}catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "숫자를 입력해주세요");
		}   
	}
}
