package reviewer;


import java.util.Scanner;

//4) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//- 출력결과
//	영화제목 : 추격자
//	감독 : 7
//	배우 : 5
//	영화총점 : 12(관객수 + 총점)
//	영화평점 : ☆☆☆☆
//	=====================
//	공연제목:지킬앤하이드
//	감독:9
//	배우:10
//	공연총점 : 46
//	공연평점 : ☆☆☆☆☆
//- 조건
//	관객수, 총점과 평점은 입력되는 값에 따라 변동될 수 있습니다.
public class ViewerApp {
	public static void main(String[] args) {
		Culture chu = new Movie("추격자", 7, 5, 0, 0, "영화");
		Culture jhi = new Performance("지킬앤하이드", 9, 10, 0, 0, "공");
		boolean run =true;
		Scanner scn = new Scanner(System.in);
		
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.평점주기 | 2.추격자 평가 | 3.지킬앤하이드 평가 | 4.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int in = Integer.parseInt(scn.nextLine());

			switch (in) {
			case 1:
			System.out.println("1.추격자 | 2.지킬앤하이");
			int a = Integer.parseInt(scn.nextLine());
				if(a==1) {
					int scvn=chu.getSvN()+1;
					System.out.println("점수를 주시오");
					int score = Integer.parseInt(scn.nextLine());
					int insert = chu.getScore()+score;
				
				chu=new Movie("추격자", 7, 5, scvn, insert, "영화");
			}else if (a==2) {

				int scvn2=jhi.getSvN()+1;
				System.out.println("점수를 주시오");
				int score = Integer.parseInt(scn.nextLine());
				int insert3 = jhi.getScore()+score;
				jhi=new Performance("지킬앤하이드", 9, 10, scvn2, insert3, "공연");
			}
				break;
			case 2:
				chu.getInformation();
			
				chu.getGrade();
				System.out.println();
				break;
			case 3:
				jhi.getInformation();
				
				jhi.getGrade();
				System.out.println();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run=false; break;
		
	}

}//end of while
	}
}