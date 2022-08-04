package Morning;

import java.util.Scanner;

public class PaymentApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		InterfaceSale card = new InterCardPay(0.03);
		InterfaceSale simple = new InterSimplePay(0.05);
		int price = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.가격입력 2.가격비교 99.종료");
			int sel = Integer.parseInt(scn.nextLine());

			if (sel == 1) {
				System.out.println("온라인상품 가격 입력");
				price = Integer.parseInt(scn.nextLine());
				continue;
			} else if (sel == 2) {
				System.out.println("1.카드결제 가격 2.간편결제 가격 99.종료");
				int sel2 = Integer.parseInt(scn.nextLine());
				if(sel2==1) {
				System.out.println("가격 : "+card.online(price));
				card.showInfo();
				System.out.println();
				continue;
				}else if (sel2 ==2) {
				System.out.println("가격 : "+simple.online(price));
				simple.showInfo();
				System.out.println();
				continue;
				}else if (sel == 99) {
					System.out.println("메뉴로 돌아갑니다.");
					run = false;
					continue;
				
				
			} else if (sel == 99) {
				System.out.println("프로그렘을 종료합니다.");
				run = false;
				break;
			}
		}
	}
	}
}