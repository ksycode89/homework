package com.ksy.student;

import java.util.Scanner;

public class StudentService {
	Scanner s = new Scanner(System.in);

	public void insertStudent(StudentDTO std) {
		int result = StudentManage.getInstanceof().insertStudent(std);

		check(result);

	}

	public void insertSubject(StudentDTO std) {
//		if(std.getStudentKor() !=0) {}
		System.out.println("성적입력 : 1.국어 | 2.수학 | 3.영어");
		int menu = Integer.parseInt(s.nextLine());
		System.out.println("입력");

		if (menu == 1) {
			int kor = Integer.parseInt(s.nextLine());
			std.setStudentKor(kor);
			int resultKor = StudentManage.getInstanceof().insertKor(std);
			check(resultKor);
		} else if (menu == 2) {
			int math = Integer.parseInt(s.nextLine());
			std.setStudentMath(math);
			int resultMath = StudentManage.getInstanceof().insertMath(std);
			check(resultMath);
		} else if (menu == 3) {
			int eng = Integer.parseInt(s.nextLine());
			std.setStudentEng(eng);
			int resultEng = StudentManage.getInstanceof().insertMath(std);
			check(resultEng);

		}

	}

	public void updateTel() {
		StudentDTO std = new StudentDTO();
		System.out.println("전화번호의 변경을 시작합니다.");
		System.out.println("id 입력");
		int id = Integer.parseInt(s.nextLine());
		std.setStudentId(id);
		System.out.println("변경할 전화번호 입력");
		String tel = s.nextLine();
		std.setStudentTel(tel);

		int result = StudentManage.getInstanceof().insertTel(std);

		check(result);

	}

	// g학생조회
	public StudentDTO StudentList(StudentDTO std) {
		
//		System.out.println("id 입력");
//		int id = Integer.parseInt(s.nextLine());
		
		return StudentManage.getInstanceof().getStudent(std.getStudentId());
		
		
	}

	// 체크 메서드
	public void check(int v) {
		if (v == 1) {
			System.out.println("입력 완료");
		}else{
		
			System.out.println("입력 실패");
		}
	}
}
