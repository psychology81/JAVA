package chapter8;

public class Customer {
	protected int cID;
	protected String cName;
	protected String cGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer(int cID, String cName) {
		this.cID = cID;
		this.cName = cName;
		cGrade = "silver";
		bonusRatio = 0.01;
		System.out.println("customer() 생성자 호출");
	} // customer grade bonusratio

	public int cPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCInfo() {
		return cName + "님의 등급은 " + cGrade + " 이며, 보너스 포인트는 " + bonusPoint + " 포인트 입니다"; 
	}

	/**
	 * @return the cID
	 */
	public int getcID() {
		return cID;
	}

	/**
	 * @param cID the cID to set
	 */
	public void setcID(int cID) {
		this.cID = cID;
	}

	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}

	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}

	/**
	 * @return the cGrade
	 */
	public String getcGrade() {
		return cGrade;
	}

	/**
	 * @param cGrade the cGrade to set
	 */
	public void setcGrade(String cGrade) {
		this.cGrade = cGrade;
	}

	/**
	 * @return the bonusPoint
	 */
	public int getBonusPoint() {
		return bonusPoint;
	}

	/**
	 * @param bonusPoint the bonusPoint to set
	 */
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	/**
	 * @return the bonusRatio
	 */
	public double getBonusRatio() {
		return bonusRatio;
	}

	/**
	 * @param bonusRatio the bonusRatio to set
	 */
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	

	
	
	
} // end of class
