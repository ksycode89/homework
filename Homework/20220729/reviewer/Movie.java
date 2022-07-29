package reviewer;
//2) Movie 클래스를 정의한다.
//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능

public class Movie extends Culture {
	
	private String field;
	
	public Movie() {
		super();
	}
	public Movie(String name,  int actorN, int aduN,int svN, int score,String field) {
		super(name,actorN,aduN,svN,score);
		this.field = field;
	}

	public Movie(int svN, int score,String field) {
		super(svN,score);
		this.field=field;
	}
	@Override
	public void getInformation() {
		System.out.println(this.field+"제목:"+getName()+" \n감독 수 : "+getAduN()+
	            "\n배우 수 : "+getActorN()+"\n총점 : "+getScore()/*+"관객수 :"+getSvN()*/);

		
	}
	
	
	//추상메서드 구현

			
	
	

}
