package Produck;

import java.util.HashMap;
import java.util.Scanner;

public class HashProduck {
	public static void main(String[] args) {
		
	boolean run = true;
	int num = 0 ;
	HashMap <String,Integer> map = new HashMap<>();
	Scanner scn = new Scanner(System.in);
	
	while(run) {
		System.out.println("--------------------------------------------");
		System.out.println("1.물건수 | 2.상품이름 & 가격 | 3.상품출력 | 4.분석 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택> ");
		int insert = Integer.parseInt(scn.nextLine());
		
		switch(insert) {
		case 1:
			System.out.println("등록된 상품수는 " +map.size());
			num = map.size();
			break;
		case 2:
			//작성위치
			System.out.println("상품명");
			String name = scn.nextLine();
			System.out.println("상품 가격");
			int price = Integer.parseInt(scn.nextLine());
			map.put(name, price);
			
			break;
		case 3:
			for(String a : map.keySet()) {
				System.out.println("상품명 : ["+a+"] 상품가격 : ["+map.get(a)+"원]");
			}
			
			break;
		case 4:
			int max=0;
			int sum=0;
			for(String a : map.keySet()) {
				if(max<map.get(a)) {					max=map.get(a);
				}
			}System.out.println("가장 비싼 물건은 "+max+"입니다.");
			for(String a : map.keySet()) {
				if(max>map.get(a)) {
					sum+=map.get(a);
				}
			}System.out.println("가장 비싼 물건을 제외한 상품의 총합은 "+sum+ "입니다.");
			break;
		case 5:
			System.out.println("종료합니다.");
			run=false;
			break;
		
		
	}
}
}
}
