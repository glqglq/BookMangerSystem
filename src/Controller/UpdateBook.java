package Controller;

import po.Book;

public class UpdateBook {
	private int NO;
	public int getNO() {
		return NO;
	}
	public void setNO(int nO) {
		NO = nO;
	}
	private String NAME;
	private String DISC;
	private double PRICE;
	private int NUM;
	public String execute(){
		System.out.println(NAME+"-"+DISC+"-"+NO+"-"+PRICE+"-"+NUM);
		Book b = new Book();
		b.setDISC(DISC);
		b.setNAME(NAME);
		b.setNUM(NUM);
		b.setPRICE(PRICE);
		b.setNO(NO);
		DAO.BookDao.Update(b);
		System.out.println("OK");
		return "success";
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDISC() {
		return DISC;
	}
	public void setDISC(String dISC) {
		DISC = dISC;
	}
	public double getPRICE() {
		return PRICE;
	}
	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}
	public int getNUM() {
		return NUM;
	}
	public void setNUM(int nUM) {
		NUM = nUM;
	}
	
}
