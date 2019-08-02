package chapter7;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			char[][] arr= new char[13][2];
			int a=97; // 아스키코드를 처리하는 방법
			for(int i = 0; i <13; i++ ) {  // 13= 행의 개수
				for(int j = 0; j<2; j++) { // 2= 열의 개수
					arr[i][j] = (char)a; // int를 char 로 변형
					a++; // a값을 하나씩 증가시켜서
		}
	}
			
			for(char i=0; i<13; i++) { // 13= 행의 개수
				for(char j = 0; j<2; j++) {  // 2= 열의 개수
					System.out.printf("%2c", arr[i][j]);
					}
				System.out.println();
				}
		} //main
			
	
	} // class

