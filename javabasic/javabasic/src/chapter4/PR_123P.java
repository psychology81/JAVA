package chapter4;

import java.util.Scanner;

public class PR_123P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. 페이지 123쪽 1번 문제
		
		int num1, num2;
		String op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1 : ");
		num1 = sc.nextInt();
		System.out.println("숫자 2 : ");
		num2 = sc.nextInt();
		System.out.println("연산의 종류 : ");
		op = sc.next();
		
		switch(op) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		}
		System.out.println("terminated");
		
		
		
		
		//2. 구구단을 짝수 단만 출력하도록 프로그램을 만들어라
		/* for 이용한 구구단 만들기 
		int i = 1, j = 1;
		for(i = 1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
		}//for j
		}//for i
		*/
		
		
		int i = 1, j = 1;
		for (i = 1; i<=9; i++) {
			if(i%2==1) continue; {
			for(j=1; j<=10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
		

		
		
		//3. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어라
		
		System.out.println("3번문제");
		int n = 1, m = 1;
		for (n = 1; n<=9; i++) {
			for(m = 1; m<=9; m++) {
					if(n >= m) break;
				System.out.println(n + "*" + m + "=" + n*m);
				
			
		}
	}
		
		
	}

}
