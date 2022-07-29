package TestMember;


// 축구반의 코치이름.
// 락커룸의 이름.(A, B, C, D)

// 정보출력시 => 코치이름: 홍길동, 락커룸: A 

public class SoccerMember extends Member {
	private String nameTea;
	private String nameLoc;
	
	public SoccerMember(int id, String name, String tel, String nameTea, String nameLoc) {
		super(id,name,tel);
		this.nameTea=nameTea;
		this.nameLoc=nameLoc;
	}

	public String getNameTea() {
		return nameTea;
	}

	public void setNameTea(String nameTea) {
		this.nameTea = nameTea;
	}

	public String getNameLoc() {
		return nameLoc;
	}

	public void setNameLoc(String nameLoc) {
		this.nameLoc = nameLoc;
	}

	@Override
	public String toString() {
		return "학생아이디 : " + getMemberId() + " || 학생이름 : " + getMemberName() + " || 학생 전화번호 : "
				+ getPhone() + " || 축구반 코치이름 : " + nameTea + " || 락커룸 : " + nameLoc;
	}
	
	
	
}
