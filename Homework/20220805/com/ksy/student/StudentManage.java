package com.ksy.student;



public class StudentManage extends com.ksy.common.DAO {
	// 싱글톤
	private static StudentManage sm = null;

	private StudentManage() {
	}

	public static StudentManage getInstanceof() {
		if (sm == null) {
			sm = new StudentManage();
		}
		return sm;
	}

	// 등록
	public int insertStudent(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "insert into students (Student_id,Student_name,Student_class,Student_addr,"
					+ "Student_tel)"
					+ "values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, std.getStudentId());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getStudentClass());
			pstmt.setString(4, std.getStudentAddr());
			pstmt.setString(5, std.getStudentTel());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 국어입력
	public int insertKor(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "update students set student_kor =? where student_id = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, std.getStudentKor());
			pstmt.setInt(2, std.getStudentId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;

	}
	//영어입력
	public int insertEng(StudentDTO std) {
		int result = 0 ;
		try {
			conn();
			String sql = "update students set student_eng =? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, std.getStudentEng());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {disconnect();}
		
		return result;
		
	
		
	}
	//수학입력
	public int insertMath(StudentDTO std) {
		int result = 0 ;
		try {
			conn();
			String sql = "update students set student_Math =? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, std.getStudentMath());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {disconnect();}
		
		return result;
		
	
		
	}
	//전번번경
	public int insertTel(StudentDTO std) {
		int result = 0 ;
		try {
			conn();
			String sql = "update students set student_tel= ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, std.getStudentTel());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {disconnect();}
		
		return result;
		
	
		
	}
	public int insertAdrr(StudentDTO std) {
		int result = 0 ;
		try {
			conn();
			String sql = "update students set student_addr= ? where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, std.getStudentAddr());
			pstmt.setInt(2, std.getStudentId());
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {disconnect();}
		
		return result;
		
	
		
	}
	
	public StudentDTO getStudent (int id) {
		StudentDTO std = null;
		try {
			conn();
			String sql ="select * from students where student_id = ?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				std = new StudentDTO();
				std.setStudentId(rs.getInt("student_id"));
				std.setStudentName(rs.getString("student_Name"));
				std.setStudentTel(rs.getString("student_tel"));
				std.setStudentAddr(rs.getString("student_addr"));
				std.setStudentClass(rs.getString("student_class"));
	
				
			}
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return std;
	}

}
