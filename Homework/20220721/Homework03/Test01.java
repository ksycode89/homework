package Homework03;

import java.util.Scanner;

public class Test01 {
	
		public void test01() {
		int a ;
		int b ;
		System.out.println("1번");
		Scanner scn = new Scanner(System.in);
		System.out.println("분면을 입력하세요 ↓ ");
		System.out.print("x축 : ");
		int x = Integer.parseInt(scn.nextLine()); 
		System.out.print("Y축 : ");
		int y = Integer.parseInt(scn.nextLine());
		System.out.printf("입력받은 값은 (%d,%d) \n",x,y);
		
		if(x>=0 && y>=0) {
			System.out.println("1사분면입니다.");
		}else if(x<=0 && y>=0) {
			System.out.println("2사분면입니다.");
		}else if(x<=0 && y<=0) {
			System.out.println("3사분면입니다.");
		}	else if(x>=0 && y<=0) {
			System.out.println("4사분면입니다.");
		}else {System.out.println("(0,0)입니다.");}
	
		}
}
