package TestMember;

// 강습반의 강사이름.
// 수영등급(A,B,C,D)
// 정보출력시 => 강사이름: 홍길동, 등급: A

public class SwimMember extends Member {
	private String SwimTea;
	private String grade;

	public SwimMember(int id, String name, String tel, String nameTea2, String nameGr) {
		super(id, name, tel);
		this.SwimTea = nameTea2;
		this.grade = nameGr;
	}

	public String getSwimTea() {
		return SwimTea;
	}

	public void setSwimTea(String swimTea) {
		SwimTea = swimTea;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "학생아이디 : " + getMemberId() + " || 학생이름 : " + getMemberName() + " || 학생 전화번호 : "
				+ getPhone() + " || 수영부 강사이름 : " + SwimTea + " || 수영등급 : " + grade;
	}

}
