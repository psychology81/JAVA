package chapter7;

public class TwoDimension {

	public static void main(String[] args) {


		// 1. 2차원 배열 선언
		// 
		//아래는 배열과 동시에 초기화
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]); //3자리수 10진수 형태로 출력
			}//innere of for loop			
			System.out.println();	
		}// out of for loop
		System.out.println("2차원 배열개념 확인");
		
	}

}
