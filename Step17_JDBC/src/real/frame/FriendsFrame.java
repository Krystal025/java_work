package real.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import real.dao.FriendsDao;
import real.dto.FriendsDto;
import test.dao.MemberDao;
import test.dto.MemberDto;
import test.frame.TestFrame;

public class FriendsFrame extends JFrame implements ActionListener{
	
	JTextField inputName, inputHeight, inputMajor;
	DefaultTableModel model;
	JTable table;
	
	public FriendsFrame(String title) {
		super(title);
		
		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);
		
		JLabel label2 = new JLabel("키");
		inputHeight = new JTextField(10);
		
		JLabel label3 = new JLabel("전공");
		inputMajor = new JTextField(10);
		
		JButton addBtn = new JButton("추가");
		addBtn.setActionCommand("add");
		addBtn.addActionListener(this);
		
		JButton updateBtn = new JButton("수정");
		updateBtn.setActionCommand("update");
		updateBtn.addActionListener(this);
		
		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		deleteBtn.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputHeight);
		panel.add(label3);
		panel.add(inputMajor);
		panel.add(addBtn);
		panel.add(updateBtn);
		panel.add(deleteBtn);
		
		add(panel, BorderLayout.NORTH);
		
		panel.setBackground(Color.pink);
		
		table = new JTable();
		
		String[] colNames = {"번호", "이름", "키", "전공"};
		
		
		model = new DefaultTableModel(colNames, 0);

		table.setModel(model);

		JScrollPane scroll = new JScrollPane(table);

		add(scroll, BorderLayout.CENTER);

		displayFriends();
	}
	
	public static void main(String[] args) {
		FriendsFrame f = new FriendsFrame("친구 목록");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		if(cmd.equals("add")) {
			//1. 입력한 이름과 주소를 읽어와서
			String name = inputName.getText();
			int height = Integer.parseInt(inputHeight.getText());
			String major = inputMajor.getText();
			//2. MemberDto 객체에 담고
			FriendsDto dto = new FriendsDto();
			dto.setName(name);
			dto.setHeight(height);
			dto.setMajor(major);
			//3. MemberDto 객체의 insert() 메소드를 이용해서 DB에 실제 저장하고
			boolean isSuccess = new FriendsDao().insert(dto);
			//4. 저장성공이면 "저장했습니다"를 알림에 띄우고 
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "저장했습니다");
				//5. JTable에 회원목록이 다시 출력되도록 한다 
				displayFriends();
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
				new FriendsDao().delete(num);
				//JTable을 refresh한다
				displayFriends();
			}
			//선택된 row에 해당하는 회원번호(PK)를 얻어낸다
			int num = (int)model.getValueAt(selectedRow, 0);
			//MemberDao 객체를 이용해서 회원정보를 삭제한다
			new FriendsDao().delete(num);
			//JTable을 refresh한다
			displayFriends();
		}
	}
	public void displayFriends() {
		//기존에 출력된 내용을 모두 삭제후 다시 출력
		model.setRowCount(0);
		List<FriendsDto> list = new FriendsDao().getList();
		//반복문을 돌며 얻어온 정보를 UI에 출력
		for(FriendsDto tmp:list) { 
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getHeight(), tmp.getMajor()};
			model.addRow(row);
		}
	}
	
}
