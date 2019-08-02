package chapter8;

public class Exinheri2 {

	public static void main(String[] args) {
		Sedan2 mySedan = new Sedan2();
		Truck2 myTruck = new Truck2();
		
		mySedan.color = "세리니티";
		mySedan.speed = 0;
		mySedan.takeOn();
		mySedan.showInfo();
		
		System.out.println("--------------------");
		
		myTruck.color = "코랄";
		myTruck.speed = 0;
		myTruck.takeOn();
		myTruck.showInfo();
		
		
		
	}//main

}//class
