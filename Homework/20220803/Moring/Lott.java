package Moring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lott {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		List<int[]> lotto = new ArrayList<>();
		int[] lotto2 = new int[6];

		for (int i = 0; i < 6; i++) {
			int a = (int) ((Math.random() * 45) + 1);

			if (i > 0) {
				for (int j = 0; j < 6; j++) {
					if (lotto2[i] == a) {
						i += -1;
						break;
					}

				} // 중복확인 구문
				lotto2[i] = a;
			}
			lotto.add(lotto2);
		}
		
		for(int i=0; i<6;i++) {
		System.out.print(lotto.get(0)[i]+",");
		}//리스트의 배열번호
		
	}
}// end of main

//		int [] save ;
//		for (int i = 0; i < 5; i++) {
//			save = new int [6];
//			 save [i] = (int) ((Math.random() * 45) + 1);
//			lotto.add(save[i]);
//			}
//		for(int at :lotto) {
//			System.out.println(at+"구문");
//		}

//		for(int[] i : lotto) {
//			System.out.println(i);
//		}