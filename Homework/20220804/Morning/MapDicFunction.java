package Morning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDicFunction {
	Scanner scn = new Scanner(System.in);
	Map<String, String> dic = new HashMap<>();
	String menuN = "";

	public MapDicFunction() {
		run();
	}

	private void run() {
		while (!menuN.equals("q")) {
			menuinfo();
			String select = scn.nextLine();
			switch (select) {
			case "1":
				String word = "";
				while (true) {
					System.out.println("단어 등록을 시작합니다 (종료 : `)");
					System.out.print("단어 등록 >");
					word = scn.nextLine();
					if (word.equals("`")) {
						break;
					}
					System.out.print("\n단어 정의 >");
					String value = scn.nextLine();
					add(word, value);
				}
				break;

			case "2":
				list();
				break;
			case "3":
				search();
				break;
			case "4":
				modify();
				break;
			case "5":
				delete();
				break;
			case "q":
				System.out.println("프로 램을 종료합니다.");
				menuN = "q";
				break;

			}

		}

	}

	private void menuinfo() {
		System.out.println("1.단어입력 2.단어조회 3. 단어 검색 4. 단어 수정 5.단어 삭제 q. 종료");
		System.out.print("입력>");

	}

	// 추가
	private void add(String key, String value) {

		dic.put(key, value);
	}

	// 조회
	private void list() {
		if (dic.size() == 0) {
			System.out.println("입력값이 없습니다.");
		} else {
			System.out.println("단어장을 출력합니다.");

			for (String a : dic.keySet()) {
				String value = dic.get(a);
				System.out.println("단어 : " + a + "\n 뜻 : " + value);

			}
		}

	}

	// 검색
	private void search() {
		System.out.print("단어 입력 >");
		String key = scn.nextLine();
		if (dic.containsKey(key)) {
			String value = dic.get(key);
			System.out.println(key + "의 뜻은 " + value);
		} else {
			System.out.println("존재하지 않는 단어입니다.");
		}
	}

	// 단어 수정
	private void modify() {
		System.out.print("수정할 단어 입력 >");
		String key = scn.nextLine();
		if (dic.containsKey(key)) {
			System.out.println("수정할 내용을 입력해주세요");
			String value = scn.nextLine();
			dic.put(key, value);

		} else {
			System.out.println("존재하지 않는 단어입니다.");
		}
	}

	// 단어 삭제
	private void delete() {
		System.out.println("1.단어삭제 2.전부삭제 `.종료");
		String menu = scn.nextLine();
		if (menu.equals("1")) {
			System.out.println("삭제할 단어를 입력해주세요.");
			String key = scn.nextLine();
			if (!dic.containsKey(key)) {
				System.out.println("단어가 없습니다.");
			}
			dic.remove(key);
			System.out.println(key + "단어는 삭제되었습니다.");
		} else if (menu.equals("2")) {
			dic.clear();
			System.out.println("삭제완료");
		} else if (menu.equals("`")) {

		}

//		String key = scn.nextLine();	
//		String key = scn.nextLine();

	}

}
