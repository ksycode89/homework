package prac;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class newPalindrome {
	public static void main(String[] args) {
		int number = 21;
		int tmp = number;
		String tmp2 = "";
//		List<String> a = new ArrayList<>();//각자리 잘라 넣을 배열
		String strnum = Integer.toString(tmp);

//		System.out.println(number/10);//10씩 자르기
		int result = 0; // 변수 number 를 거꾸로 변환해서 담을 변수.

		int len = (int) (Math.log10(number) + 1);// 숫자길이
//		System.out.println("길이"+len);//길이출력

//		System.out.println(strnum+"aaaa");
//		System.out.println(strnum.charAt(3)+"캐릿엣01");

		for (int i = len - 1; i > -1; i--) {
			tmp2 = tmp2 + strnum.charAt(i);
			// 뒤집기
		}
//		System.out.println(tmp2); //뒤집은거 STring 출력
		result = Integer.parseInt(tmp2);
//		for(String b : a) {
//			System.out.println("앞"+b);
//		}//배열출력

		if (number == result) {
			System.out.println(number + "는 회수문입니다.");
		} else {
			System.out.println(number + "는 회수문이 아닙니다.");
		}
	}
}
