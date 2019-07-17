/*
 * 반복문 while for
 * while(조건식) {
 * 				반복수행할 문장;
 * 				}
 * 
 * 
 * 
 * 
 */



package chapter4;

import java.util.Scanner;

public class A03_LOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*  1 ~ 5 까지 수를 출력하는 프로그램 작성 하세요
	    int num = 1;
	    System.out.println(num);
	    num ++;
	    System.out.println(num);
	    num ++;
	    System.out.println(num);
	    num ++;
	    System.out.println(num);	
	    num ++;
	    System.out.println(num);	
		근데 우리 이거할라고 프로그래밍 하는거 아니자나~
		이거 반복문으로 작성하면 더 간단하게 할 ㅅ수 있어 ㅋ
		*/
		/*
		int num = 1;
		while(num<=10000) {
			System.out.println(num);
			num++;
		} //  이렇게 간단하게 할 수 있땅~~ 이것이 반복문이다~~~~~~~
		
		 반복문 쓸 때 주의할 점
		 * 조건식을 적어줄 때 반복수행할 문장뒤에 
		 * 조건 값이 변화할 문장도 필요 (num++;) 왜? 무한반복되니까. => 얘를 제어변수라고 함
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		int num, odd, even;
		int oddsum=0, evensum=0;
		

		System.out.println(" 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
				while(num<=100) {
				if((num % 2)==1) {
					oddsum = oddsum+num;
				}
				else {
					evensum = evensum+num;
				}
				num++;
				}
	}
	}
	틀렸어ㅠ  수도코드가지고 해보자
	*/
		
 //1. 변수선언
		int num=1, oddsum=0, evensum=0;
		while(num<=100) {
			if((num % 2) == 0) evensum += num;
			else oddsum +=num;
			
			num++;
			
		}//end of while
		
		System.out.println("oddsum"+ oddsum + "이고," + "evensum" + evensum +"이다.");
	}
}

		
