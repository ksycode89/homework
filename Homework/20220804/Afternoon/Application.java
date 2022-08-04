package Afternoon;

import java.util.List;
import java.util.Scanner;
import Member.Member;

public class Application {
Scanner scn = new Scanner(System.in);
		
	public Application() {
		//실행
		run();
		}
	private void run() {	
		boolean run = true;
		while(run) {
		System.out.println("1.전체조회 2. 단건조회 3.회원 입력 4.회원 수정 5.회원삭제 99.종료");
		System.out.print("입력>");
		
		int menu = Integer.parseInt(scn.nextLine());
		switch(menu) {
		case 1:
			List<Member> list = MemberManagement.getInstance().getMemberList();
			if(list.size()==0) {
				System.out.println("입력된 데이터가 없습니다.");
			}else {
			for(Member m : list){
				System.out.println(m.toString());
				}
			}
			break;
			
		case 2:
			System.out.println("조회할 id 입력");
			String id = scn.nextLine();
		Member member = MemberManagement.getInstance().getMember(id);
		if(member== null) {
			System.out.println("등록되지 않은 id입니다.");
		}else {
			System.out.println(member.toString());
		}
			break;
		case 3:
			
			System.out.println("새로운 회원을 등록합니다.");
			System.out.println("id를 입력해주세요");
			String str = scn.nextLine();
			System.out.println("pw를 입력해주세요");
			String pw = scn.nextLine();
			System.out.println("이름을 입력해주세요");
			String name = scn.nextLine();
			Member member2 = new Member(str,pw,name);
			
			int result = MemberManagement.getInstance().setMember(member2);
			if(result ==1) {
				System.out.println("입력완료");
			}else {System.out.println("입력 실패");}
			break;
			
		case 4:
			
			Member member3=new Member();
			System.out.println("비밀번호 번경을 시작합니다.");
			
			   System.out.println("id를 변경합니다.");
			   String id2= scn.nextLine();
			   member3.setId(id2);
			 
			   System.out.println("pw를 변경합니다.");
			   String pw2= scn.nextLine();	
			   member3.setPw(pw2);
			   
			   
			   int result2 = MemberManagement.getInstance().updateMember(member3);
				if(result2 ==1) {
					System.out.println("입력완료");
				}else {System.out.println("입력 실패");}
			break;
		case 5:
			
			System.out.println("삭제할 id");
			String id3 =scn.nextLine();
			int result3 = MemberManagement.getInstance().deleteMember(id3);
					if(result3 ==1) {
						System.out.println("입력완료");
					}else {System.out.println("입력 실패");}
			break;
		case 99:
			run=false;
			break;
		}
		
	}
	}
	}


//List<Member> list = MemberManagement.getInstance().getMemberList();
//for(Member m : list){
//	System.out.println(m.toString());