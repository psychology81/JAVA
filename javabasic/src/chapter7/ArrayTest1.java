package chapter7;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열선언 방법
		// 자료형[] 배열이름 = new 자료형 [배열의 크기(=개수)] 
		// 자료형 배열이름[] = new 자료형 [배열의 크기]

		/*

		int[] studentId = new int[10]; // int 형 요소가 10개 배열 선언
		int studentIDs[] = new int[10]; // student 에 10개의 배열이 확보되었당
		
		

		 */
		/*			studentID[0] = 10;
     	studentID[1] = 9;....로 가려면

		
		int studentID[] = new int[10]; 					// int 타입으로 하면 0, String 타입으로 하면 null 로 10개 출력됨 
		for(int i=0, num=10; i<10; i++, num--) {
			studentID[i] = num;
		}

		for(int i=0; i<10; i++)	 // 10 개의 배열을 하나하나 써주기도 귀찮으니까 그냥 반복문 돌리자~~@!!
			System.out.printf("%3d",studentID[i]); // 
		 */
		

		
		/*
		
		
		// 선언과 동시에 배열값도 넣으려면
		int studentID[] = new int[] {10,9,8,7,6,5,4,3,2,1};
		for(int i=0; i<10; i++)	 // 10 개의 배열을 하나하나 써주기도 귀찮으니까 그냥 반복문 돌리자~~@!!
			System.out.printf("%3d",studentID[i]); // 
		
		*/
		
		
		
		int studentID[] = new int[] {100,10,9,11,8,7,4,1}; // 배열은 현재 7개 . 배열의 인덱스가 지정된 값의 범위를 넘어감(적거나 많아도)
		for(int i=0; i<studentID.length; i++)	 //  studentID.length 라고 쓰면 배열의 크기를 자동으로 세어주고 범위를 자동으로 나타내줌
			System.out.printf("%3d",studentID[i]);
		
		
		
	}

}
