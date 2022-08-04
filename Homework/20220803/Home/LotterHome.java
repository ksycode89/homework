package Home;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LotterHome {
	public static void main(String[] args) {
		List<int[]> arr = new ArrayList<>();
		int[] lottor = new int[6];
		
		for (int j = 0; j < 10; j++) {//구문 반복 횟수
			
			for (int i = 0; i < 6; i++) {
				lottor[i] = (int) ((Math.random() * 45) + 1);

				for (int x = 0; x < i; x++) {
					if (lottor[i] == lottor[x]) {
						i--;
						break;
					}
				} // 중복제거

			} // 값넣기

//		System.out.println(Arrays.toString(arr.get(2))); 
//	System.out.println(Arrays.toString(lottor));
			System.out.print("\n 구분 : ");
			for (int k = 0; k < 6; k++) {
				System.out.print(" " + lottor[k]);
			}

		}
	}
}
