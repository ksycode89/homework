package Produck;

//1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다.
//Lee학생은 2과목을 수강합니다. 국어 점수가 100점, 수학 점수가 50점입니다.
//Kim학생은 3과목을 수강합니다. 국어 점수가 70점, 수학 점수가 85점, 영어 점수가 100점입니다.
//Student 클래스와 Subject클래스를 생성한 후 두 학생의 과목 성적과 총점을 각각 출력해보세요 (어레이 리스트 이용)
public class Subject {
	private String sub;
	private int score;

	public Subject(String sub, int score) {
		super();
		this.sub = sub;
		this.score = score;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Subject [sub=" + sub + ", score=" + score + "]";
	}

}
