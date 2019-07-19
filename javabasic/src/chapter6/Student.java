package chapter6;

public class Student {
	public static int serialNum = 1000;  // serialNum 이라는 객체가 만들어지지 않아도 값을 처리할 수 있음
	public int studentID;
	public String studentName;
	public int grade;
	public int money;
	public String address;
	
	// 이름과 가진 돈을 매개변수로 받는 생성자
	public Student(String studentName, int money) {
		this.studentID = ++serialNum;  // 객체와 객체가 공동으로 사용하는 변수 = 클래스변수 = static 변수 
		this.studentName = studentName;
		this.money = money;
	} // end of constructor studnet
	
	public void takeOnBus(Bus bus) {
		bus.takeOnBus(1000);
		this.money -= 1000;
	}// end of takeOnBus
	
	public void takeOffBus(Bus bus) {
		bus.takeOffBus();
	}// end of takeOnBus
	
	
	public void takeSubway(Subway Subway) {
		Subway.take(1500);
		this.money -= 1500;
	} // end of takeSubway
	
	public void showInfo() {
		System.out.println(studentID);
	}
	
	// student 클래스에 showSerial 메소드를 만듦. static method 임. 객체와 상관없이 클래스가 활성화될 때 이 메소드도 만들어진다 . 
	public static void showSerial() {
		System.out.println(serialNum);
	}
	
	
	
} // end of class student 
