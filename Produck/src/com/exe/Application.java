package com.exe;

import java.util.Scanner;

import com.produck.ProduckService;

public class Application {
	Scanner scn = new Scanner(System.in);
	ProduckService ps = new ProduckService();

	public Application() {
		run();
	}

	private void run() {
		while (true) {
			
			System.out.println("1.상품조회 2.상품 상세 조회 3. 점포별 상품 조회 4.상품 등록 5.상품 삭제 6.매출 조회");
			int menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {
				ps.getProduck();
			} else if (menu == 2) {
				ps.getDetailPorduck();
			} else if (menu == 3) {
				ps.getStoreProduck();
			} else if (menu == 4) {
				ps.insertProduck();
			} else if (menu == 5) {
				ps.deleteProduck();
			} else if (menu == 6) {
				ps.calProduck();
			}

		}

	}

}
