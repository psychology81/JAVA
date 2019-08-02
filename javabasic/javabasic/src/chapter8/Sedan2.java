package chapter8;

public class Sedan2 extends Car2{
	int passengerCount;
	
	public void takeOn() {
		passengerCount++;
	}//takeon
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println(passengerCount + "명 탑승");
	}// showInfo
	
	
}//class
