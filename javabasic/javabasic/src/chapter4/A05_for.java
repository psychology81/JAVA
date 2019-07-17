/*
 * 반복문 중 가장 많이 사용하는 반복문
 * 주로 조건이 횟수인 경우에 사용
 * 초기화식, 조건식, 증감식을 한번에 작성한다.
 * 
 * for(초기화식;조건식;증감식){
 *    반복 수행할 문장
 * }
 * 
 * 그외 추가 설명 및 예제
 * - for 루프를 이용한 문자(알파벳, 한글) 출력하기
 * - 무한 루프
 * - for 루프에서 다중 변수 선언하기
 * - 다중 for 루프
 * - continue, break
 */

package chapter4;

public class A05_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// num이 1에서 부터 5일때까지 하나씩 증가하면서 출력하는 for문
/*
		for(int num=1;num<=5;num++) {
			System.out.println(num);
		}
		
		
			
			for(int num=5;num>=1;num--) {
				System.out.println(num);
				}
				
				*/
		
		/*
		int num = 1;
		while(true) {
			System.out.println(num);
			num++;
			if (num==100) break; // 숫자가 100이 되면 종료 = 99까지 찍힌다 
		}
		System.out.println("프로그램종료");
		*/
		
		
		
		
		/*
		// 중첩된 while 문 
		int i = 1, j = 1;
		
		while(i<=9) {
			System.out.println(i+"dan multiple");
			j = 1;
			while(j <= 9) {
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			} //while
			i++;
			System.out.println(" ");
			} // while
	System.out.println("프로그램 종료");
	
	*/
	
		
		/* for 이용한 구구단 만들기 
		int i = 1, j = 1;
		for(i = 1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
		}//for j
		}//for i
	*/
	
	/*
	//무한 for loop
		for(;;) {
			System.out.println("hello");
		} //end for
	
	*/
		/* 아래와 같이 표시
		 *   1 : 1
			 2 : 3
		   	3 : 5
		   	끝나는 조건식은 한 개만 적을 수 있다 
	
		for(int i=1, j=1; i<=3; i++, j+=2) {
			System.out.println(i + " : " + j);
		}
	
	*/
	
	
	/*
		// continue 홀수만 출력되는데, 짝수가 만나면 출력되지 않고 for로 가기 때문
		for (int i=1; i<=10; i++) {
			if(i % 2 ==0) continue; //i가 짝수인 경우는 출력되지 않고 for로 간다
			System.out.println(i);
		}//end for
		*/
		
		
		
		// break
		for (int i=1; i<=10; i++) {
			if(i==8) break; // 8이 되면 출력하지 않고 그만한다
			if((i % 2) ==0) continue;  //i가 짝수인 경우는 출력되지 않고 for로 간다
			System.out.println(i);
		} //end for
	
	
		

	
	}
	
		
		
		}
	
	
