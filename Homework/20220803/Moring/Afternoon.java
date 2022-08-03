package Moring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Afternoon {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int[] aa = new int[10];
		for (int i = 0; i < 10; i++) {
			int ints = ((int) (Math.random() * 45) + 1);
			aa[i] = ints;

		}

		List<int[]> save = Arrays.asList(aa);
		Set<int[]> lott = new HashSet<>(save);
		List<int[]> newSave = new ArrayList<>(lott);
		System.out.println(aa);
		System.out.println(save + " : list");
		System.out.println(lott + " : hashset");
		System.out.println(newSave.get(0)[0] + " : Arr");

		for (int i=0; i<10;i++) {
			System.out.println("결론"+newSave.get(0)[i]);
		}

	}

}
