package com.spring;

public class Student {
	private int StudentID;
	private String StudentName;
	private String StudentAdderess;
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAdderess() {
		return StudentAdderess;
	}
	public void setStudentAdderess(String studentAdderess) {
		StudentAdderess = studentAdderess;
	}
	public Student(int studentID, String studentName, String studentAdderess) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentAdderess = studentAdderess;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentAdderess="
				+ StudentAdderess + "]";
	}
	
	
	

	
}
