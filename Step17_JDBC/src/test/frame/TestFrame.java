package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame implements ActionListener{
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;
	
	//생성자
	public TestFrame(String title) {
		super(title);
		
		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);
		
		JLabel label2 = new JLabel("주소");
		inputAddr = new JTextField(10);
		
		JButton addBtn = new JButton("추가");
		addBtn.setActionCommand("add");
		addBtn.addActionListener(this);
		
		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		deleteBtn.addActionListener(this);
		
		//패널에 UI를 배치하고
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		
		//패널째로 프레임의 목록에 배치
		add(panel, BorderLayout.NORTH);
		
		panel.setBackground(Color.yellow);
		
		table = new JTable();
		
		
		String[] colNames = {"번호", "이름", "주소"};
		
		//테이블에 연결할 모델객체 생성 (테이블에 출력할 데이터를 여기에 추가하면 테이블에 출력됨)
		model = new DefaultTableModel(colNames, 0);
		//모델을 테이블에 연결
		table.setModel(model);
		//스크롤이 가능하도록 테이블을 JScrollPane에 감쌈
		JScrollPane scroll = new JScrollPane(table);
		//테이블을 프레임의 중앙에 배치
		add(scroll, BorderLayout.CENTER);
		
		//회원정보 출력하기
		displayMember();
		
//		MemberDto dto = new MemberDto();
//		dto.setName(dto.getName());
//		dto.setAddr(dto.getAddr());
		
		//부모 객체의 메소드를 마음대로 호출할 수 있음 (this 생략가능)
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		this.setBounds(100, 100, 800, 500);
//		this.setVisible(true);
		
		
	}//TestFrame()
	
	//run했을때 실행의 흐름이 시작되는 main 메소드
	public static void main(String[] args) {
		TestFrame f = new TestFrame("테스트 프레임");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
		//얻어와서 할수있는 것 : 콘솔창에 출력	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("add")) {
			//1. 입력한 이름과 주소를 읽어와서
			String name = inputName.getText();
			String addr = inputAddr.getText();
			//2. MemberDto 객체에 담고
			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			//3. MemberDto 객체의 insert() 메소드를 이용해서 DB에 실제 저장하고
			boolean isSuccess = new MemberDao().insert(dto);
			//4. 저장성공이면 "저장했습니다"를 알림에 띄우고 
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "저장했습니다");
				//5. JTable에 회원목록이 다시 출력되도록 한다 
				displayMember();
			}
		}else if(cmd.equals("delete")) {
			//table로부터 선택된 row의 인덱스를 얻어오기 
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {//만일 선택된 row가 없다면
				JOptionPane.showMessageDialog(this, "삭제할 행을 선택하세요");
				return; //메소드를 여기서 끝낼 것(리턴)
			}
			
			int result = JOptionPane.showConfirmDialog(this, "삭제 하시겠습니까?");
			if(result == JOptionPane.YES_OPTION) {
				//선택된 row에 해당하는 회원번호(PK)를 얻어낸다
				int num = (int)model.getValueAt(selectedRow, 0);
				//MemberDao 객체를 이용해서 회원정보를 삭제한다 
				new MemberDao().delete(num);
				//JTable을 refresh한다
				displayMember();
			}
			
			
			//선택된 row에 해당하는 회원번호(PK)를 얻어낸다
			int num = (int)model.getValueAt(selectedRow, 0);
			//MemberDao 객체를 이용해서 회원정보를 삭제한다
			new MemberDao().delete(num);
			//JTable을 refresh한다
			displayMember();
		}
	}
	//TestFrame에 메소드 추가
	public void displayMember() {
		//기존에 출력된 내용을 모두 삭제후 다시 출력
		model.setRowCount(0);
		List<MemberDto> list = new MemberDao().getList();
		//반복문을 돌며 얻어온 정보를 UI에 출력
		for(MemberDto tmp:list) { 
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		}
	}
}
