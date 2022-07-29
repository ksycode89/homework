package reviewer;
//1) Culture 클래스를 정의한다.
//- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//(2) public String getGrade() : 평점을 구하는 기능
//(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
public abstract class Culture {
	private String name;
	private int actorN;
	private int aduN;
	private int svN;
	private int score;
	
	public Culture() {super();}
	
	public Culture(String name,   int aduN,int actorN,int svN, int score) {
		super();
		this.name = name;
		this.actorN = actorN;
		this.aduN = aduN;
		this.svN = svN;
		this.score = score;
	}
	
	public Culture(int svN, int score) {
		super();
		this.svN=svN;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}

	public int getActorN() {
		return actorN;
	}

	public int getAduN() {
		return aduN;
	}

	public int getSvN() {
		return svN;
	}

	public int getScore() {
		return score;
	}

	public void setTotalScore(int score) {
		this.score=this.svN+score;
		System.out.println(this.score);
		
	}
	
	//
	public String getGrade() {
		int avg=getScore()/getSvN();
		String a ="";
		System.out.print("공연평점 : ");
		for(int i=0; i<avg;i++) {
			System.out.print("☆");
			a=a+"☆";
		}
		return a;
	}
		
//	}
	
	public abstract void getInformation();
	
}
