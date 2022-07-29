package Produck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
// 1) 메뉴는 다음과 같이 구성하세요.
// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
// 3) 제품별 가격을 출력하세요.
//	출력예시, "상품명 : 가격"
// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

import java.util.ArrayList;

public class ListProduck {
	public static void main(String[] args) {

		boolean run = true;
		int num = 0;
		Produck [] u = null;
		Scanner scn = new Scanner(System.in);
		int[] ProduckN;
		List<Produck> list = new ArrayList<>();

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.물건 | 2.물건이름 가격 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int insert = Integer.parseInt(scn.nextLine());

			switch (insert) {
			case 1:
				System.out.println("입력받으실 물건수");
				num = Integer.parseInt(scn.nextLine());
				list = new ArrayList(num);

				break;
			case 2:
				for(int i=0;i<num;i++) {
				System.out.println("상품명");
				String name = scn.nextLine();
				System.out.println("상품 가격");
				int price = Integer.parseInt(scn.nextLine());
				list.add(new Produck(name, price));
				}
//			System.out.println(list.get(0));

				break;
			case 3:
				for (Produck a : list) {
					System.out.println(a);
				}

				break;
			case 4:
				int max = 0;
				String maxName = null;
				int etcPrice =0;
				for (int i = 0; i < list.size(); i++) {
					if (max < list.get(i).getPrice()) {
						maxName = list.get(i).getName();
					}

				}
				for(Produck a : list) {
					if(maxName!=a.getName()) {
						etcPrice+=a.getPrice();
//						System.out.println(a.getName());
					}
				}
				System.out.println("최고가격의 상품은 " + maxName + "입니다.");
				System.out.println("나머지 제품의 가격의 총합은 "+etcPrice+"입니다");
				break;
			case 5:
				System.out.println("종료");
				run = false;
				break;
			}

		}
	}
}
