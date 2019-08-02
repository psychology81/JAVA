package chapter8;

public class Exinheritance {

	public static void main(String[] args) {
		// 먼저 상속 관계에 있는 클래스들의 생성자 호출 관계를 확인

	
		Sedan sedan1 = new Sedan();  // 하위클래스가 상위클래스를 호출할 때 별도의 명시가 없는 한
										// 기본 생성자를 호출한다 
		System.out.println("----------------");
		Sedan sedan2 = new Sedan("jungse");
		
	}

}
