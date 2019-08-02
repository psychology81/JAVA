package chapter7;

public class StudentTest {

	public static void main(String[] args) { 
		Student studentLee = new Student(1001, "Lee"); // Student 클래스 22행 참고
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 80);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("------");
		studentKim.showStudentInfo();
		
		


	} // main

} //class
