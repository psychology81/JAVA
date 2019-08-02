package chapter8;

public class GoldCustomer extends Customer {
	
	double saleRatio;
	
	public GoldCustomer(int cID, String cName) {
		super(cID, cName);
		cGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	


} // end of class
