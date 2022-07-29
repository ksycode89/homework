package reviewer;
//3) Performance 클래스를 정의한다.
//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
public class Performance extends Culture{

	private  String filed ;

	
	
	public Performance() {
		super();
	}
	
	public Performance(String name,   int aduN,int actorN,int svN, int score,String filed) {
		super(name,aduN,actorN,svN,score);
		this.filed = filed;
	}
	@Override
	public  void getInformation() {
		System.out.println(this.filed+"제목:"+getName()+" \n감독 수 : "+getAduN()+
	            "\n배우 수 : "+getActorN()+"\n총점 : "+getScore()/*+"관객수 :"+getSvN()*/);
	
//		System.out.println(" 총점 : "+getScore());
		
	}


	
	
	

}
