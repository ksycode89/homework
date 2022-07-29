package Health;
//1) Human 클래스를 정의한다.
//- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
public class Human {
	private String name;
	private int height;
	private int Weight;
	
	public Human() {
		super();
	}
	public Human(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		Weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return Weight;
	}
	
	public void getInformation() {
		System.out.print("이름 : "+name+" 키 : "+height+" 몸무게 : "+Weight );
	}
}
