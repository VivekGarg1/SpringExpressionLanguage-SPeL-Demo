package com.home.model;

import java.util.List;

public class StudentListAccessor {
	
	private StudentInfo thirdStudentInList;
	private List<StudentInfo> failedStudent;
	private List<String> studentNames;
	public StudentInfo getThirdStudentInList() {
		return thirdStudentInList;
	}
	public void setThirdStudentInList(StudentInfo thirdStudentInList) {
		this.thirdStudentInList = thirdStudentInList;
	}
	public List<StudentInfo> getFailedStudent() {
		return failedStudent;
	}
	public void setFailedStudent(List<StudentInfo> failedStudent) {
		this.failedStudent = failedStudent;
	}
	public List<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}

}
