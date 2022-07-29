package Homework03;

import java.util.Scanner;

public class Test02 {
	public void test02() {
		System.out.println("\n2번");
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("확인하실 년도를 입력하세요 (종료시 1) >");
			int years = Integer.parseInt(scn.nextLine());
			if(years%4==0 && years%100!=0) {
				System.out.println("윤년입니다.");
			}else if (years%400 ==0){
				System.out.println("윤년입니다.");
			}else if (years==1){
			break;
			}else {System.out.println("평년입니다.");}
		}System.out.println("종료합니다.");	
	}
} 