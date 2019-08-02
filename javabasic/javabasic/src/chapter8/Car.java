package chapter8;

public class Car {
	// 생성자 호출관계 확인
	// 디폴트 생성자
	public Car() {
		System.out.println("car 클래스 생성자 호출~");
		
	} // car 생성자 
	
	
	public Car(String name) { // 생성자 오버로딩. 위에 Car()는 암것도 없지. 여긴 있고. 이름이 똑같네. 다형성.
		System.out.println("Car 클래스 생성자 호출 with" + name);
	}
	
	
} // class
