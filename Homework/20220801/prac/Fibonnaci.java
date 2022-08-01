package prac;

public class Fibonnaci {
	public static void main(String[] args) {
		int num0 = 1;
		int num1 = 1;
		int num2 = 0;
		System.out.print(num0+","+num1);

		for (int i = 0; i < 8; i++) {
//			if(i==0 ||i==3||i==6) {
				num2=num0+num1;
				System.out.print(","+num2);
//				}else if(i==1||i==4||i==7) {
					num1=num0;
//					System.out.print(","+num0);
//				}else if (i==2||i==5||i==8) {
					num0=num2;
//					System.out.print(","+num1);
//				}
			
//			System.out.print(","+num2+","+num0+","+num1);
		}
	}
}
