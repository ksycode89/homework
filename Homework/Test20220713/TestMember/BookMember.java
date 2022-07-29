package TestMember;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실
	private String bookBan;
	private String bookRoom;

	public BookMember() {

	}

	public BookMember(int id, String name, String tel, String nameBan, String nameClass) {
		super(id, name, tel);
		bookBan = nameBan;
		bookRoom = nameClass;

	}

	public String getBookBan() {
		return bookBan;
	}

	public void setBookBan(String bookBan) {
		this.bookBan = bookBan;
	}

	public String getBookRoom() {
		return bookRoom;
	}

	public void setBookRoom(String bookRoom) {
		this.bookRoom = bookRoom;
	}

	@Override
	public String toString() {
		return "학생아이디 : " + getMemberId() + " || 학생이름 : " + getMemberName() + " || 학생 전화번호 : "
				+ getPhone() + " || 도서부 반장이름 : " + bookBan + " || 강의실이름 : " + bookRoom;
	}

	
	
	
}
