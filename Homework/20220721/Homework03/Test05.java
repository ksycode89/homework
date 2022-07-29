package Homework03;

import java.util.Scanner;

public class Test05 {
	public void test05() {
		System.out.println("\n5번");
		Scanner scn = new Scanner(System.in);
		System.out.println("출력할 단수를 입력하세요");
		int a = Integer.parseInt(scn.nextLine());
		System.out.println("출력한 범위를 입력하세요.");
		int b = Integer.parseInt(scn.nextLine());

		for (int i = 1; i <= b; i++) {
			System.out.println(a + "X" + i + " = " + a * i);
		}

	}
}
