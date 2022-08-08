package com.produck;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.common.DAO;

public class ProduckDAO extends DAO {
	private static ProduckDAO pd = null;

	private ProduckDAO() {
	};

	public static ProduckDAO getInstanceo() {
		return pd == null ? pd = new ProduckDAO() : pd;
	}

//	2-1]상품조회      -재고 없으시 추가로 물어보고 발주목록(쇼핑리스트)에 추가
//	2-2]상품 상세 조회  - 
//	2-3]점포별 상품조회 
//	//2-4]발주 목록 조회 
//	2-5] 상품등록     
//	//2-6]발주 상품 등록 
//	2-7]상품삭제       
//	2-8]상품별 판매 갯수 출력

	// 1.가격 이름//
	public List<Produck> getPorduck() {
		List<Produck> list = new ArrayList<>();
		Produck produck = null;
		try {
			conn();
			String sql = "select produck_name,produck_price from produck";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				produck = new Produck();
				produck.setProduckName(rs.getString("produck_name"));
				produck.setProduckPrice(rs.getInt("produck_price"));
				list.add(produck);

			}

		} catch (SQLException s) {
			s.getMessage();
			s.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;

	}

//==========2-2 상세조회===============//
	public List<Produck> getDetailPorduck() {
		List<Produck> list = new ArrayList<>();
		Produck produck = null;
		try {
			conn();
			String sql = "select * from produck";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				produck = new Produck();
				produck.setProduckName(rs.getString("produck_name"));
				produck.setProduckPrice(rs.getInt("produck_price"));
				produck.setProduckExplain(rs.getString("produck_explain"));
				produck.setProduckId(rs.getString("produck_id"));
				produck.setProduckSales(rs.getInt("sales"));
				produck.setStores(rs.getString("stores"));
				list.add(produck);

			}

		} catch (SQLException s) {
			s.getMessage();
			s.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;

	}
//2-3점포별 조회///
	public List<Produck> getStoreProduck(String stores) {
		List<Produck> list = new ArrayList<>();
		Produck produck = null;
		try {
			conn();
			String sql = "select * from produck where stores = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stores);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				produck = new Produck();
				produck.setProduckName(rs.getString("produck_name"));
				produck.setProduckPrice(rs.getInt("produck_price"));
				produck.setProduckExplain(rs.getString("produck_explain"));
				produck.setProduckId(rs.getString("produck_id"));
				produck.setProduckSales(rs.getInt("produck_sales"));
				produck.setStores(rs.getString("stores"));
				list.add(produck);

			}

		} catch (SQLException s) {
			s.getMessage();
			s.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;

	}
	
	
	
	
	
//	===	2-4===
	public int insertProduck(Produck produck) {
		int result = 0;
		try {
			conn();
			String sql = "insert into produck values(?,?,?,?,?,?) ";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, produck.getProduckId());
			pstmt.setString(2, produck.getProduckName());
			pstmt.setInt(3, produck.getProduckPrice());
			pstmt.setString(4, produck.getProduckExplain());
			pstmt.setInt(5, produck.getProduckSales());
			pstmt.setString(6, produck.getStores());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;

	}

	// 삭제//
	public int deleteProduck(String produckId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from produck where produck_id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, produckId);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return result;
	}

}
