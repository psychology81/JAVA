    
/*
 * abstract class의 의미를 이해하고 추상클래스를 정의/사용할 수 있다.
 * 추상 클래스를 상속받는 클래스 정의하기
 * 이해를 돕기 위한 설명 요령....
 * 1. 일반 상속과의 차이점. 상속 선언만으로는 오류가 생김.... 왜일까??
 *    > 원인과 처방??    
 *    [힌트] 오류클래스명에 마우스 위치시키고 우측 버튼 클릭... 
 *    
 */
package chapter9;

public class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	
	}
	
	
	
	
	
	
	
	
	
	
		
	}// end of class 
