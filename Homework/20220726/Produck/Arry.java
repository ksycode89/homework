package Produck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arry {
	public static void main(String[] args) {

		boolean run = true;
		int num = 0;
		Produck[] u = null;
		Scanner scn = new Scanner(System.in);
	
		

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.물건 | 2.물건이름 가격 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int insert = Integer.parseInt(scn.nextLine());

			switch (insert) {
			case 1:
				num = Integer.parseInt(scn.nextLine());
				u = new Produck[num];

				break;
			case 2:
				for(int i=0;i<u.length;i++) {
				System.out.println("이름");
				String name =scn.nextLine();
				System.out.println("가격");
				int price=Integer.parseInt(scn.nextLine());
				u[i]=new Produck(name,price);
				}


				break;
			case 3:
				for(Produck a : u) {
					System.out.println(a);
				}
				break;
			case 4:
			
				break;
			case 5:
				System.out.println("종료");
				run = false;
				break;
			}

		}
	}

}
