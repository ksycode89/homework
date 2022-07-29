package Department;

//Employee 클래스를 정의한다.
//- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 각 필드의 getter만 존재한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름과 연봉을 출력하는 기능
//(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
public class Employe {
	private String name;
	private int salary;

	public Employe() {
		super();}
	
	public Employe(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void getInformation() {
		System.out.println(name+"의 연봉은 "+salary+"만원 입니다.");
	}
	
	public void print() {
		System.out.println("Super Class");
	}
}
