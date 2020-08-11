package com.home.model;

public class StudentInfo {
	
	private String stuName;
	private int marks;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentInfo [stuName=" + stuName + ", marks=" + marks + "]";
	}
	
	

}
