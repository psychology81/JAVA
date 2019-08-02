package chapter8;

public class Sedan extends Car {
	
	// 생성자 호출 관계 확인
	// 디폴트 생성자
	public Sedan() {
		System.out.println("Sedan 클래스 생성자 호출");
	}

	public Sedan(String name) { // 생성자 오버로딩. 위에 세단()은 암것도 없지. 여긴 있고. 이름이 똑같네.
		super("여기요");
		System.out.println("Sedan 클래스 생성자 호출 with" + name);
	} 
	
} // class 
