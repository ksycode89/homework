package com.produck;

//PRODUCK_ID     
//PRODUCK_NAME   
//PRODUCK_PRICE       
//PRODUCK_EXPALIN          
//SALES                     
//STORES  
public class Produck {
	private String produckId ;
	private String produckName ;
	private int produckPrice ;
	private String produckExplain ;
	private int produckSales ;
	private String stores ;
	
	
	public Produck() {
		super();
	}
	
	public String getProduckId() {
		return produckId;
	}
	public void setProduckId(String produckId) {
		this.produckId = produckId;
	}
	public String getProduckName() {
		return produckName;
	}
	public void setProduckName(String produckName) {
		this.produckName = produckName;
	}
	public int getProduckPrice() {
		return produckPrice;
	}
	public void setProduckPrice(int produckPrice) {
		this.produckPrice = produckPrice;
	}
	public String getProduckExplain() {
		return produckExplain;
	}
	public void setProduckExplain(String produckExplain) {
		this.produckExplain = produckExplain;
	}
	public int getProduckSales() {
		return produckSales;
	}
	public void setProduckSales(int produckSales) {
		this.produckSales = produckSales;
	}
	public String getStores() {
		return stores;
	}
	public void setStores(String stores) {
		this.stores = stores;
	}
	@Override
	public String toString() {
		return "ProduckDTO [produckId=" + produckId + ", produckName=" + produckName + ", produckPrice=" + produckPrice
				+ ", produckExplain=" + produckExplain + ", produckSales=" + produckSales + ", stores=" + stores + "]";
	}
	
	
}
