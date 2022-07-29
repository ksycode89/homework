package Health;
//- StandardWeightInfo 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
//-10% 미만	저체중
//-10%이상~10%미만	정상범위
//10%이상∼ 20%미만
//과체중
//20%이상∼ 30%미만
//경도비만
//30%이상∼ 50%미만
//중등도비만
//50% 이상
//고도비만
public class ObesityInfo extends StandardWeightInfo {
	
	public ObesityInfo(){
		super();
	}
	
	public ObesityInfo(String name,int height,int weight ) {
		super(name,height,weight);
	}

	@Override
	public void getInformation() {
		System.out.print("이름 : "+getName()+"키 : "+getHeight()
		+"몸무게 : "+getWeight()+"표준체중 : " );
		
	}
	public double getObesity(int weight,float getStandardWeight) {
		float a = ((weight - getStandardWeight)/getStandardWeight * 100);
		String result ;
		
		
		return a;
	}
	
	
	
	
	
	
}
