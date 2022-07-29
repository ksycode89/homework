package Homework03;

import java.util.Scanner;

public class Test03 {
	public void test03() {
		System.out.println("\n3번");
		Scanner scn = new Scanner(System.in);
		boolean a = true;
		while (a) {
			System.out.println("승리조건을 확인하고 싶은 것을 쓰시오 (가위,바위,보)\n'종료'를 원하시면 1를 입력하세요");
			String insert = scn.nextLine();
			switch (insert) {
			case "가위":
				System.out.println("[바위를 내시오]");
				break;
			case "바위":
				System.out.println("[보를 내시오]");
				break;
			case "보":
				System.out.println("[가위를 내시오]");
				break;
			case "1":
				a =false; break;
			default:
				System.out.println("[가위 바위 보중 하나를 내시오]");
			}
		}System.out.println("프로그램을 종료합니다.");
	}
}
