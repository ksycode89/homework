package com.ksy.App;

import java.util.Scanner;

import com.ksy.member.MemberDTO;
import com.ksy.member.MemberService;
import com.ksy.student.StudentDTO;
import com.ksy.student.StudentService;

public class LMSApp {

	MemberService ms = new MemberService();
	StudentService ss = new StudentService();
	Scanner scn = new Scanner(System.in);
	int menu = 0;

	MemberDTO MD = null;

//	String aa = scn.nextLine();
//	int aa = Integer.parseInt(scn.nextLine());

	public LMSApp() {
		run();
	}

	private void run() {
		while (true) {
			menuNo();
			if (MD == null) {
				if (menu == 1) {
					// 등록
					MemberDTO member = new MemberDTO();

					System.out.println("아이디 입력");
					String id = scn.nextLine();
					System.out.println("비밀번호 입력");
					String pw = scn.nextLine();

					member.setMemberId(id);
					member.setMemberPw(pw);

					MD = ms.doLoing(member);// 이해하고 지나가기
				} else if (menu == 2) {
					System.out.println("프로그램종료");
					break;
				}

			} else {
				//풀로입력
				if (menu == 1) {
					StudentDTO std = new StudentDTO();
					System.out.println("id 입력");
					int id = Integer.parseInt(scn.nextLine());
					System.out.println("이름입력");
					String name = scn.nextLine();

					System.out.println("강의실 입력");
					String classs = scn.nextLine();

					System.out.println("주소입력");
					String addr = scn.nextLine();

					System.out.println("전화번호입력");
					String tel = scn.nextLine();

					std.setStudentName(name);
					std.setStudentName(name);
					std.setStudentClass(classs);
					std.setStudentAddr(addr);
					std.setStudentTel(tel);

					ss.insertStudent(std);
				//성적입력
				}else if (menu ==2) {
					StudentDTO std = new StudentDTO();
					System.out.println("id 입력");
					int id = Integer.parseInt(scn.nextLine());
					
					std.setStudentId(id);
					
					//값 유무 확인 : 조회시 존재시 입력된거
					std = ss.StudentList(std);
					if(std!=null) {
						ss.insertSubject(std);
					}else {System.out.println("정보가                                                                                                                            없습니다.");}
					
					//전번입력
				}else if (menu ==3) {
					
					ss.updateTel();
					
				}else if (menu ==4) {
					StudentDTO std = new StudentDTO();
					System.out.println("id 입력");
					int id = Integer.parseInt(scn.nextLine());
					std.setStudentId(id);
					std = ss.StudentList(std);
					System.out.println(std.toString());
					
				}

			}
		} // login if
	}// run

	//로그인 구문 
	private void menuNo() {
		if (MD == null) {

			System.out.println("1.로그인 | 2.종료");
			System.out.println("입력 >");
			menu = Integer.parseInt(scn.nextLine());

		} else {
			System.out.println("1.학생등록 | 2.성적 입력 | 3. 학생정보 수정 | 4. 학생정보 조회");
			menu = Integer.parseInt(scn.nextLine());
		}

	}
}
