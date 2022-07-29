package Department;
//EmpDept 클래스를 정의한다.
//- Employee 클래스를 상속한다.
//- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 추가된 필드의 getter를 정의한다.
//- Employee 클래스의 메소드를 오버라이딩한다.
//(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
//(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능
public class EmpDept extends Employe{

	private String dep_id;
	
	public EmpDept() {
		super();}
	
	public EmpDept(String name, int salary, String dep_id) {
		super(name, salary);
		this.dep_id=dep_id;
	}

	public String getDep_id() {
		return dep_id;
	}

	@Override
	public void getInformation() {
		
		System.out.println(getName()+"의 연봉은 "+getSalary()+"만원 이고 "+"부서명은 "+dep_id+ "입니다.");
	}

	@Override
	public void print() {
		
		System.out.println("수퍼클래스\n서브클래스");
	}
	
	

	
	
	
}
