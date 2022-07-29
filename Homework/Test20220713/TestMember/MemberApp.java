package TestMember;

// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
// 1)도서반=>기본정보+도서반장,강의실이름
// 축구반=>기본정보+코치이름,락커룸이름
// 수영반=>기본정보+강사이름,수영등급

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {

	List<Member> members = new ArrayList<Member>();
	boolean run = true;
	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (run) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("입력 >");

			int selc = Integer.parseInt(scn.nextLine());
			switch (selc) {
			case 1:

				addMember(null);

				break;
			case 2:
				try {
					modifyMember(null);
				} catch (NumberFormatException a) {
					System.out.println("입력값을 넣어주세요.");
				}
				break;
			case 3:
				if (memberList().isEmpty()) {
					{
						System.out.println("등록된 학생이 없습니다.");
					}
				}
				for (Member num : memberList()) {
					System.out.println(num);

				}

//				list();
				break;
			case 9:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("옳바른 수를 넣어주세요.");
			}
		}
	}

	@Override
	public void addMember(Member member) {
		System.out.println("등록시작합니다.");
		System.out.println("반을 선택해주세요");
		System.out.println("1)도서반 2)축구반 3)수영반");
		int sle = Integer.parseInt(scn.nextLine());
		// 기본정보

		System.out.print("학생아이디 >");
		int id = Integer.parseInt(scn.nextLine());
		System.out.print("학생 이름 >");
		String name = scn.nextLine();
		System.out.print("학생 전화번호 >");
		String tel = scn.nextLine();

		if (sle == 1) {
			System.out.print("도서부 반장이름 >");
			String nameBan = scn.nextLine();
			System.out.print("강의실 이름 > ");
			String nameClass = scn.nextLine();
			members.add(new BookMember(id, name, tel, nameBan, nameClass));

		} else if (sle == 2) {
			System.out.print("축구반 코치이름 > ");
			String nameTea = scn.nextLine();
			System.out.print("락커룸 > ");
			String nameLoc = scn.nextLine();

			members.add(new SoccerMember(id, name, tel, nameTea, nameLoc));
		} else if (sle == 3) {
			System.out.print("수영반 강사이름 > ");
			String nameTea2 = scn.nextLine();
			System.out.print("수영등급 > ");
			String nameGr = scn.nextLine();
			members.add(new SwimMember(id, name, tel, nameTea2, nameGr));

		}

	}

//	public void modifyMember2(Member member) {
//		System.out.println("수정할 학생의 번호를 입력하세요.");
//		int mod = Integer.parseInt(scn.nextLine());
//		for (int i = 0; i < members.size(); i++) {
//			if (mod == members.get(i).getMemberId()) {
//				
//				if(members.contains(members.get(i).get)) {}
//				
//				
//			} 
//		}
//		
//	}

	@Override
	public void modifyMember(Member member) {
		System.out.println("수정할 학생의 번호를 입력하세요.");
		int mod = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < members.size(); i++) {
			if (mod == members.get(i).getMemberId()) {
				System.out.println("재 등록시작합니다.");
				System.out.println("반을 선택해주세요");
				System.out.println("1)도서반 2)축구반 3)수영반");
				int sle = Integer.parseInt(scn.nextLine());

				System.out.print("학생아이디 >");
				int id = Integer.parseInt(scn.nextLine());
				System.out.print("학생 이름 >");
				String name = scn.nextLine();
				System.out.print("학생 전화번호 >");
				String tel = scn.nextLine();

				if (sle == 1) {
					System.out.print("반장이름 >");
					String nameBan = scn.nextLine();
					System.out.print("강의실 이름 > ");
					String nameClass = scn.nextLine();
					members.set(i, new BookMember(id, name, tel, nameBan, nameClass));
				} else if (sle == 2) {
					System.out.print("강사이름> ");
					String nameTea = scn.nextLine();
					System.out.print("락커룸 > ");
					String nameLoc = scn.nextLine();

					members.set(i, new SoccerMember(id, name, tel, nameTea, nameLoc));
				} else if (sle == 3) {
					System.out.print("강사이름> ");
					String nameTea2 = scn.nextLine();
					System.out.print("강사등급> ");
					String nameGr = scn.nextLine();
					members.set(i, new SwimMember(id, name, tel, nameTea2, nameGr));

				}
			} 
		}
	}

	public void list() {
		for (Member num : members) {
			System.out.println(num);
		}
	}

	@Override //
	public List<Member> memberList() {

		return members;
	}
}
