package Health;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//	- 출력결과
//	홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//	박둘이님의 신장 168, 몸무게 90, 비만입니다.
//- 조건
//	변수는 Human 클래스 타입으로 선언하여 하나만 사용한다.

public class HealthApp {

	public static void main(String[] args) {
		ObesityInfo oi = new ObesityInfo();
		StandardWeightInfo sw = new StandardWeightInfo();
		
		List<Human> list = new ArrayList<>();
		
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		int num = 0;

		while (run) {
			try {
			System.out.println("--------------------------------------------");
			System.out.println("1.값이력 | 2.리스트 | 3.표준체중 | 4.비만체크 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int insert = Integer.parseInt(scn.nextLine());

			switch (insert) {
			case 1:
				System.out.print("이름 : ");
				String name = scn.nextLine();
				System.out.print("키 : ");
				int height = Integer.parseInt(scn.nextLine());
				System.out.println("몸무게 : ");
				int weight = Integer.parseInt(scn.nextLine());

				list.add(new Human(name, height, weight));

				break;
			case 2:
				for (Human a : list) {
					a.getInformation();
					System.out.println();
				}
				break;
			case 3:
				System.out.println("찾으실 고객의 이름을 입력하세요");
				String search = scn.nextLine();
				for (Human a : list) {
					if (search.equals(a.getName())) {
						
						a.getInformation();
						System.out.print(" ");
						System.out.printf("표준체중 : %.1f \n", oi.getStandardWeight(a.getHeight()));
					}
				}

				break;
			case 4:
				System.out.println("찾으실 고객의 이름을 입력하세요");
//				System.out.println(oi.getObesity(168,));
				String search2 = scn.nextLine();
				
				for (Human a : list) {
					if (search2.equals(a.getName())) {
						System.out.printf("%s의 비만도는 %.2f %%  ",a.getName(),oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight())));
						if(oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))<-10){
							System.out.println("[체중미달]");
						}else if (oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))>=-10
								&&oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))<10) {
							System.out.println("[일반체중]");
						}else if (oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))>=10
								&&oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))<20) {
							System.out.println("[과체중]");
						}else if (oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))>=20
								&&oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))<30) {
							System.out.println("[경도비만]");
					}else if (oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))>=30
							&&oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))<50) {
						System.out.println("[중등도비만]");
				}else if (oi.getObesity(a.getWeight(), oi.getStandardWeight(a.getHeight()))<=50) {
					System.out.println("[고도비만]");
			}
					}
				}//비만&결과 출력구문
				break;
			case 5:
				System.out.println("종료");
				run = false;
				break;
			}
			}catch(Exception a) {System.out.println("값이 이상해요");}
		}// end of while
	}
}
