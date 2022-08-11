package com.dto;

public class DeptDTO {

	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDTO() {
		System.out.println("DeptDTO");
	}
	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptno() {
		System.out.println("getDeptno");
		return deptno;
	}
	public void setDeptno(int deptno) {
		System.out.println("setDeptno");
		this.deptno = deptno;
	}

	public String getDname() {
		System.out.println("getDname");
		return dname;
	}

	public void setDname(String dname) {
		System.out.println("setDname");
		this.dname = dname;
	}

	public String getLoc() {
		System.out.println("getLoc");
		return loc;
	}

	public void setLoc(String loc) {
		System.out.println("setLoc");
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}
