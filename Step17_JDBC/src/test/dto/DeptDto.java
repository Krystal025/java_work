package test.dto;

public class DeptDto {
	//필드에 private로 
	private int deptno;
	private String dname;
	private String loc;
	
	//기본생성자
	public DeptDto() {}
	
	//모든 값을 인자로 전달받는 생성자
	public DeptDto(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	//getter & setter 메소드
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
