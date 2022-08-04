package DBATEST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
//	//싱글톤
//	//본인 인스턴스
//	private static DAO dao = null;
//	//본인생성자
//	private DAO() {
//		super();
//	}
//	
//	public static DAO getInstance() {
//		if(dao == null) {
//			return new DAO();
//		}else {
//			return new DAO();
//		}
//	}
	
	
	
	// DAO

	// Jave와 DB의 연결할때 쓰임
	protected Connection conn = null;
	// Query 문을 담기/실행하는 객체 조건이있을때
	protected PreparedStatement pstmt = null;
	// PreparedStatement유사 조건이있을때 없을때
	protected Statement stmt = null;
	// select문 에서 검색한 결과 집합(커리의 결과)▼
	protected ResultSet rs = null;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "test";
	String pw = "1234";

	public void conn() {
		try {
			// 드라이버 로딩
			Class.forName(driver);
			// DB연결
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}// end of conn

	public void disconnect() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} // end of catch
	}

}
