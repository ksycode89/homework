package prac;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
public static void main(String[] args) {
	int number = 12321;
	int tmp = number;
	
	System.out.println(number/10);//10씩 자르기
	int result = 0 ; //변수 number 를 거꾸로 변환해서 담을 변수.
	
	int len = (int)(Math.log10(number)+1);//숫자길이
	System.out.println("길이"+len);//길이출력
	
	List<Integer> a = new ArrayList<>();//각자리 잘라 넣을 배열
	while(tmp !=0) {
		
		a.add(number%10) ;
		number=number/10;
		tmp = number;
		
//	tmp=number/10;
		System.out.println(number);
	}
	for(int b : a) {
		System.out.println("앞"+b);
	}//배열출력
	
	
	if(number == result ) {
		System.out.println(number+ "는 회수문입니다.");
	}else {
		System.out.println(number+"는 회수문이 아닙니다.");
	}
}
}
