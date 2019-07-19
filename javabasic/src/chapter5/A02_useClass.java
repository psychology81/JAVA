/*
 *  클래스의 생성자 constructor
 * 
 */

package chapter5;

public class A02_useClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student(); //null이 공부한다.
		Student st2 = new Student("사탄"); //사탄이 공부한다.
		Student st3 = new Student(1, "호랑", 3, "경제학과", "청원구"); //호랑이 공부한다.
		st1.study();
		st2.study();
		st3.study();
		st3.showInfo(); // 1 ,호랑 ,3, 경제학과,null
		
		
		// 여기서 Student 클래스에서 st1 st2 라는 객체가 2개 생성되었으니, Student 가 2번 쓰여 "기본 생성자가 호출됨" 이라고 2번 나옴.
		// 만약 3번 쓴다면? 기본생성자가 호출됨이 3번 나옴 
		/* 
		 * 예를 들면... 
		 * 우리가 "학생" 이라고 지칭할 때 그 안에는 여러 명의 학생이 있을 것임
		 * 정연 연아 혜민 미리 다혜가 각자 5명 잇다고 하면 Student 정연 = new Student.... Student 다혜 = new Student(); 까지 5명이라면
		 * 학생은 5명이 되는거고 학생(5) 가 되는거임. 그니까 학생을 표시하면 5명이 있다는 걸 무조건 가지고 가는거
		 * 
		 */
		

	}

}
