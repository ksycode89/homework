package com.ksy.student;

public class StudentDTO {

	private int StudentId;
	private String StudentName;
	private String StudentClass;
	private String StudentAddr;
	private String StudentTel;
	private int StudentKor;
	private int StudentEng;
	private int StudentMath;

	public StudentDTO() {
		super();
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentClass() {
		return StudentClass;
	}

	public void setStudentClass(String studentClass) {
		StudentClass = studentClass;
	}

	public String getStudentAddr() {
		return StudentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		StudentAddr = studentAddr;
	}

	public String getStudentTel() {
		return StudentTel;
	}

	public void setStudentTel(String studentTel) {
		StudentTel = studentTel;
	}

	public int getStudentKor() {
		return StudentKor;
	}

	public void setStudentKor(int studentKor) {
		StudentKor = studentKor;
	}

	public int getStudentEng() {
		return StudentEng;
	}

	public void setStudentEng(int studentEng) {
		StudentEng = studentEng;
	}

	public int getStudentMath() {
		return StudentMath;
	}

	public void setStudentMath(int studentMath) {
		StudentMath = studentMath;
	}

	@Override
	public String toString() {
		return "StudentDTO [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentClass=" + StudentClass
				+ ", StudentAddr=" + StudentAddr + ", StudentTel=" + StudentTel + ", StudentKor=" + StudentKor
				+ ", StudentEng=" + StudentEng + ", StudentMath=" + StudentMath + "]";
	}

}
