package Health;
//2) StandardWeightInfo 클래스를 정의한다.
//- Human 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//(2) public double getStandardWeight() : 표준체중을 구하는 기능
//( * 표준 체중 : (Height - 100) * 0.9 )

public class StandardWeightInfo extends Human{
	
		
	
	
	public StandardWeightInfo() {
		super();
	}
	public StandardWeightInfo(String name, int height, int weight) {
		super(name,height,weight);
	}
	
	public float getStandardWeight(int height) {
		float a = (float)(( height- 100) * 0.9);
		return a;
		 
	}
	
	
	@Override
	public void getInformation() {
		
		System.out.print("이름 : "+getName()+"키 : "+getHeight()
							+"몸무게 : "+getWeight()+"표준체중 : "+getStandardWeight(super.getHeight()) );
	}
	
	
	
}
