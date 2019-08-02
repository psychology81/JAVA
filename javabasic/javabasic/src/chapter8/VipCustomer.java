package chapter8;

public class VipCustomer extends Customer {

	private int AgentID;
	double saleRatio;
	
	@Override // 재정의한 메서드, 보너스 포인트 적립
	public int cPrice(int price) {
		int bonusProint=super.getBonusPoint();
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public VipCustomer(int cID, String cName, int bonusPoint) {
		super(cID, cName);
		cGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.AgentID = AgentID;
		System.out.println("VIPCustomer () 생성자 호출");
		
	}
	
	public int getAgentID() {
		return getAgentID();
	}
	
	
	
} // end of class
