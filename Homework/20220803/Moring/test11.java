package Moring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test11 {

	public static void main(String[] args) {
		 
        // List 준비
        List<Integer> list = Arrays.asList(3,4,6,7,3);
 
        // Set으로 변환 (생성자)
        Set<Integer> set = new HashSet<>(list);
 
        // 결과 출력
        System.out.println(set);
       
        for (int i = 0; i <20; i++) {
			int ints = ((int) (Math.random() * 45) + 1);
			list.add(ints);

		}
	
}
}
