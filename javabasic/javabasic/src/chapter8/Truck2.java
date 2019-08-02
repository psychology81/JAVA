package chapter8;

public class Truck2 extends Car2{
	int loadcount;
	
	public void takeOn() {
		loadcount++;
	}//takeon
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println(loadcount + "kg 적재");
	}// showInfo
	
	
}// class


/*
 * 상속받은 클래스라하더라도
 * 자신만의 필드나 메소드를 사용할 수 있다 
 * 여기선 화물적재랑 탑승객 수가 sub 클래스만의 메소드로 만듦
 * 
 */
