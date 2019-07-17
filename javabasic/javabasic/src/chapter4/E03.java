package chapter4;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int num = 5;
		int rem;
		rem = num % 2;
		

		switch(rem) {
		case 0 : 
			System.out.println("짝수");
			break;
		case 1 :
			System.out.println("홀수");
		    break;
		default:  // 케이스 0, 1 이외의 값 말고 다른 값이 나오면 출력할 값이 피요하다
			
			break; 
		
		}

	}

}
