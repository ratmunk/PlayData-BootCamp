package com.dto;

public class EmpDTO {

	private int no;
	private String ename;
	private int salary;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmpDTO [no=" + no + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
}
