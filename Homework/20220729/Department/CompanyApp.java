package Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//이름:이지나  연봉:3000  부서:교육부
//수퍼클래스
//서브클래스
public class CompanyApp {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		List<EmpDept> list = new ArrayList<EmpDept>();
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 | 2.출력 | 3.종료 ");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int insert = Integer.parseInt(scn.nextLine());

			switch (insert) {
			case 1:
				System.out.print("이름을 입력하세요 :");
				String name =scn.nextLine();
				System.out.print("월급을 입력하세요 :");
				int salary = Integer.parseInt(scn.nextLine());
				System.out.print("부서명을 입력하세요 : \n");
				String dep_id = scn.nextLine();
				list.add(new EmpDept(name, salary, dep_id));
				break;
			case 2:
				for(EmpDept a : list) {
					a.getInformation();
				}list.get(0).print();
				break;
			case 3:
				System.out.println("종료");
				run = false;

				break;

			}
		}

	}

}
