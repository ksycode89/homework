package com.bank.member;

import com.bank.common.DAO;

public class BankMemberManage extends DAO {
	
	static private BankMemberManage bmm = new BankMemberManage();
	
	private BankMemberManage(){}
	
	public static  BankMemberManage getInstance() {
		return bmm;
	}
	
	//로그인 용 조회
	public MemberDTO loginInfo(String id ) {
		MemberDTO member = null;
		
		try {
			conn();
			String sql = "select * from bank_member where member_id= ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				member = new MemberDTO();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberName(rs.getString("member_name"));
//				member.setMemberId(rs.getString("member_id"));
				member.setRole(rs.getString("roles"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return member;
	}
	
	//고객등록
	public int registCustomer(MemberDTO member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into bank_member (member_id,member_pw,member_name,roles)"
					+ "values (?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getRoles());
			
			rs=pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		
	
		return result;
	}
}
