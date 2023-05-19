package test.dto;

public class EmpDto {
	private int empno;
	private String ename;
	private int deptno;
	private String job;
	
	public EmpDto() {}

	public EmpDto(int empno, String ename, int deptno, String job) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.deptno = deptno;
		this.job = job;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}
