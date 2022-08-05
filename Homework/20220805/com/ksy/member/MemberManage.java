package com.ksy.member;

import com.ksy.common.DAO;

//member 관련 sql
public class MemberManage extends DAO {

	private static MemberManage mm;

	private MemberManage() {
		super();
	};

	public static MemberManage getInstanceof() {
		if (mm == null) {
			mm = new MemberManage();
		}
		return mm;
	}

	// 기능//
	// 1.로그인//
	public MemberDTO login(MemberDTO member) {
		MemberDTO mem = null;
		try {
			conn();
			String sql = "SELECT * FROM member WHERE member_id = ? and member_pw =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());

			rs = pstmt.executeQuery();
			if (rs.next()) {
				mem = new MemberDTO();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberSosok(rs.getString("member_sosok"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return mem;
	}//end of login
	
	

}
