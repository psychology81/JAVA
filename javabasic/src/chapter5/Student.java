package chapter5;

public class Student {

			int id;
			String name;
			int grade;
			String dept;
			String address;
			
			public Student() {  // 원래 생성자
				System.out.println("기본 생성자가 호출됨."); // 한 패키지 안에 있는 다른 클래스들도 Student를 가지고 있고(Student 클래스를 사용하면 무조건 출력되게 만듦),
														// 그래서 클래스를 실행시키면 무조건 '기본 생성자가 호출됨' 이라고 뜸.
			}
			public Student(String p_name) { //이름을 패러미터로 가지는 생성자
				name = p_name;
				System.out.println("이름을 가진 생성자 호출"); //이름을 가진 생성자 호출
			}
	
			public Student(int p_id, String p_name, int p_grade, String p_dept, String p_address) {
				id = p_id;
				name = p_name;
				grade = p_grade;
				dept = p_dept;
				address = address;
			}
			
			public String getname() {
				return name;
			}
			
			public void study() { // study 는 메소드임
				System.out.println(name + " 님은 " + dept + " 에서 공부합니다."); //호랑 님은 경제학과 에서 공부합니다.

			}
			
			public void showInfo() {  // showInfo 는 메소드임
				System.out.println(id + " ," + name + " ," + grade + ", " + dept + "," + address );  //1 ,호랑 ,3, 경제학과,null

			}
			
		}// end of class Student




