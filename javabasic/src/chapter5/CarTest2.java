package chapter5;

public class CarTest2 {

	public static void main(String[] args) {
		
		Car2 satanCar = new Car2(); // new Car 가 생성자
		System.out.println(satanCar);
		
		Car2 c = satanCar.returnItself();
		System.out.println(c);  
		
		/* 왜 주소값이 똑같은가?
		 * 
		 * 자기 자신을리턴시켜주는 메소드 returnItself 를 만듦
		 */
		 
		
	} // end of main

} //end of class
