package Moring;

import java.util.Scanner;

public class A01 {
	int[] a;
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
    //요안에 다있어요 저 모든 것들이 그래서 위에 for문에서 i쓴게 아래에도 쓰이는거엿네요
		for(int i =0; i<5; i++) {
			System.out.println("bb"+i);
		}
//		int i =3;
		//이렇게 되어야 오류나는데
		for ( int i =0; i<3;i++) {
			System.out.println("aa"+i);
		}	
//		앵 왜오류안나지
//			i =3;
	}// end of main

	public void test() {
		for (int i = 0; i < a.length; i++) {

		}

	}// end of test

	public void test2() {
		while (true) {
			for (int i = 0; i < a.length; i++) {

			}
		}

	}// end of test2

}
