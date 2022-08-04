package Member;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DBATEST.DAO;

public class Management extends DAO {
	Scanner scn = new Scanner(System.in);
	public Management() {
		
		showInfo();
		System.out.println("=========================");
		getMember();
		
//		insertInfo();
//		updateInfo();
		System.out.println("삭제할 id를 입력하세요");
		String insert =scn.nextLine();
		deleteInfo(insert);
	}
	private void deleteInfo(String insert) {
		int result=0;
		try {
			conn();
			String sql = "delete  from  member where id = ?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, insert);
	
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {disconnect();
		}
		if(result==1) {
			System.out.println("삭제완료");
		}else {System.out.println("삭제실패");}
		
	}
	private void updateInfo() {
		int result = 0;
		try {
			conn();
			String sql = "update member set pw=? where id = ?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, "asdf");
			pstmt.setString(2, "김고");
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {disconnect();}
		
		if(result==1) {
			System.out.println("수정완료");
		}else {System.out.println("수정실패");}
		
		
	}
	
	
	
	//입력
	private void insertInfo() {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values(?,?,?)";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, "김고");
			pstmt.setString(2, "123");
			pstmt.setString(3, "피자");
			//행의 수가 돌아옴
			//DML (insert,update delete =executeUpdate() )
			result = pstmt.executeUpdate();
			
			new Member();
			
//			if(rs.next()) {
//				mem2 = new Member();
//				mem2.setId(rs.getString("id"));
//				mem2.setName(rs.getString("name"));
//				mem2.setPw(rs.getString("pw"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {disconnect();}
		if(result==1) {
			System.out.println("입력완료");
		}else {System.out.println("입력실패");}
		
		
		
		
		
	}
	private void getMember() {
		Member mem2 = null;
		try {
			conn();
			
			String sql = "select * from member where id like ?";
			
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, "김%");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mem2 = new Member();
				mem2.setId(rs.getString("id"));
				mem2.setName(rs.getString("name"));
				mem2.setPw(rs.getString("pw"));
//				new Member(rs.getString("id"),rs.getString("name"),rs.getString("pw"));
						}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		System.out.println(mem2.toString());
		
	}
	
	
	
	private void showInfo() {
		
		List<Member> list = new ArrayList<>();
		Member mem = null;
		try {
			//DB연결
			conn();
			//query 작성
			String sql = "select * from member";
			
			//DB로 보낼 통로 생성
			stmt= conn.createStatement();
			
			//conn.createStatement();<통로로 인해 query 보냄.
			// resultSet = select문 에서 검색한 결과 집합(커리의 결과)
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setName(rs.getString("name"));
				mem.setPw(rs.getString("pw"));
//				new Member(rs.getString("id"),rs.getString("name"),rs.getString("pw"));
				list.add(mem);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		for(Member mem2 : list) {
			System.out.println(mem2);
		}
		
		
	}
}
