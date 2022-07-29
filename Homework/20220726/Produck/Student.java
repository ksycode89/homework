package Produck;

//1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다.
//Lee학생은 2과목을 수강합니다. 국어 점수가 100점, 수학 점수가 50점입니다.
//Kim학생은 3과목을 수강합니다. 국어 점수가 70점, 수학 점수가 85점, 영어 점수가 100점입니다.
//Student 클래스와 Subject클래스를 생성한 후 두 학생의 과목 성적과 총점을 각각 출력해보세요 (어레이 리스트 이용) 
public class Student {
	private int stuN;
	private String name;

	public Student() {
		super();
	}

	public Student(int stuN, String name) {
		super();
		this.stuN = stuN;
		this.name = name;
	}

	public int getStuN() {
		return stuN;
	}

	public void setStuN(int stuN) {
		this.stuN = stuN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [stuN=" + stuN + ", name=" + name + "]";
	}

}
