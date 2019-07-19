/*
 * 클래스 정의하기
 * [접근제어자] class 클래스이름{
 * 멤버변수;
 * 메서드;
 * }
 * 
 * 예)
 * class Student {
 * 학번;
 * 성명;
 * 학년;
 * 주소;
 * 
 * 공부한다();
 * }
 * 
 * class 이름은 대문자로 시작
 * 하나의 java파일에 하나의 클래스를 두는 것이 원칙이나,
 * 다수의 클래스가 같이 있는 경우 public 클래스는 단 하나이며,
 * public 클래스와 자바 파일의 이름은 동일해야 한다.
 */
package chapter5;

public class A01_127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student gildong = new Student();
		Student chunhyang = new Student();
		gildong.name = "홍길동";
		gildong.address = "청원구";
		chunhyang.name = "성춘향";
		chunhyang.address = "상당구";
		
		gildong.study();
		chunhyang.study();
		
	}

}

// 현재 여기 class 에는 sysout 공부한다가 없지만, 그래도 나오는 이유는, 공동된 클래스 Student가 한 패키지 안에 있기 때문에 ~이 공부한다 . 가 출력된다.
