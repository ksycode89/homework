 package After;

//123456-1234567
import java.util.Scanner;

//나이 성별 구하기 
public class StringApi {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("나이입력");
		String num = scn.nextLine();
//	System.out.println(Integer.parseInt(num.substring(7, 8)));
		if (Integer.parseInt(num.substring(7, 8)) == 1 || 
			Integer.parseInt(num.substring(7, 8)) == 2) {
			System.out.println("남자");
		} else if (Integer.parseInt(num.substring(7, 8)) == 3 || 
				   Integer.parseInt(num.substring(7, 8)) == 4) {
			System.out.println("여자");
		}

//	  LocalDate now = LocalDate.now();
		int age = (Integer.parseInt(num.substring(0, 2)));
		if (age >=00 && age <=22 ) {
		
			int result2 = 122 - (age + 100);
			System.out.println(result2);
		} else if(age>22 && age<99){
			int result = 122 - age;
			System.out.println(result + "살");

		}

	}
}
