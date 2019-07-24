package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 객체를 생성한 후 변수값을 확인하는 방법
		Student studentKim = new Student("Kim", 10000);
		studentKim.showInfo();
		
		Student studentLee = new Student("Lee", 10000);
		studentLee.showInfo();  
		
		*/
		
		// 객체를 생성하지 않고도 static 클래스 변수값을 확인하는 방법
	//	System.out.println(Student.serialNum); 
		
		// 아예  student 클래스에서 static 변수를 생성해 더 간단하게 표현할 수 잇다 
		Student.showSerial();
		
		//
	 // 	System.out.println(Student.grade);  이 때는 안됨. 왜냐면 static 변수로 만들어준적이없자나~~
		
		
		
		
		
		
		
	}

}
