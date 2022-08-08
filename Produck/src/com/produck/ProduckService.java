package com.produck;

import java.util.List;
import java.util.Scanner;

public class ProduckService {

	Scanner scn = new Scanner(System.in);

	// 조회//
	public void getProduck() {
		List<Produck> list = ProduckDAO.getInstanceo().getPorduck();
		System.out.println(ProduckDAO.getInstanceo().getPorduck());
		for (Produck pro : list) {
			System.out.println("상품명 : " + pro.getProduckName());
			System.out.println("상품가격 : " + pro.getProduckPrice());
		}
	}

	public void getDetailPorduck() {
		List<Produck> list = ProduckDAO.getInstanceo().getDetailPorduck();

		for (Produck pro : list) {
			System.out.println("상품명 : " + pro.getProduckName());
			System.out.println("상품 id : " + pro.getProduckId());
			System.out.println("삼품 가격 : " + pro.getProduckPrice());
			System.out.println("상품 설명 : " + pro.getProduckExplain());
			System.out.println("판매량 : " + pro.getProduckSales());
			System.out.println("전열점포 : " + pro.getStores());

		}
	}

	public void getStoreProduck() {
		System.out.println("점포입력");
		String stores = scn.nextLine();
		List<Produck> list = ProduckDAO.getInstanceo().getStoreProduck(stores);

		System.out.println(list.get(0).getStores() + "지점입니다.");

		for (Produck pro : list) {
			System.out.println("상품명 : " + pro.getProduckName());
			System.out.println("상품 id : " + pro.getProduckId());
			System.out.println("삼품 가격 : " + pro.getProduckPrice());
			System.out.println("상품 설명 : " + pro.getProduckExplain());
			System.out.println("판매량 : " + pro.getProduckSales());
			System.out.println("전열점포 : " + pro.getStores());

		}

	}

	public void insertProduck() {
		Produck produck = new Produck();

		System.out.println("상품명 : ");
		String porduckName = scn.nextLine();

		System.out.println("상품 id : ");
		String porduckId = scn.nextLine();

		System.out.println("상품 가격 : ");
		int produckPirce = Integer.parseInt(scn.nextLine());

		System.out.println("상품 설명 : ");
		String porduckExplain = scn.nextLine();

		System.out.println("판매량");
		int produckSales = Integer.parseInt(scn.nextLine());

		System.out.println("점포  : ");
		String stores = scn.nextLine();

		produck.setProduckName(porduckName);
		produck.setProduckId(porduckId);
		produck.setProduckPrice(produckPirce);
		produck.setProduckExplain(porduckExplain);
		produck.setProduckSales(produckSales);
		produck.setStores(stores);

		int reuslt = ProduckDAO.getInstanceo().insertProduck(produck);

		if (reuslt == 1) {
			System.out.println("입력완료");
		} else {
			System.out.println("입력실패");
		}

	}

	public void deleteProduck() {
		System.out.println("상품삭제");
		String porduckId = scn.nextLine();

		int result = ProduckDAO.getInstanceo().deleteProduck(porduckId);

		if (result == 1) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}

	}

	// 데이터 판매갯수 + 금액
	public void calProduck() {
		List<Produck> list = ProduckDAO.getInstanceo().getDetailPorduck();
		int sum = 0;
		for (Produck pro : list) {
			System.out.println("상품명 : " + pro.getProduckName());
			System.out.println("판매량 : " + pro.getProduckSales());
			System.out.println("판매금액 : " + pro.getProduckPrice() * pro.getProduckSales());
			sum += pro.getProduckPrice() * pro.getProduckSales();
//			System.out.println("상품 id : "+pro.getProduckId());
//			System.out.println("삼품 가격 : "+pro.getProduckPrice());
//			System.out.println("상품 설명 : "+pro.getProduckExplain());
//			System.out.println("전열점포 : "+pro.getStores());

		}
		System.out.println("총 판매 금액은 " + sum + "원 입니다.");

	}

}
