package chapter4;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. 변수선언
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int max;
		
		// 2. 숫자입력할 수 있게 
		System.out.println(" 숫자를 입력하세요 : ");
		a = sc.nextInt();
		System.out.println(" 숫자를 입력하세요 : ");
		b = sc.nextInt();
		System.out.println(" 숫자를 입력하세요 : ");
		c = sc.nextInt();
		
		// 3. 조건문
		max = a;   // 가장 처음 입력한 값을 제일 큰 값으로 가정 
		if(b>max) max=b;
		if(c>max) max=c;
		
		// 4. 출력 
		System.out.println("가장 큰 수는" + max + "입니다.");
	}
}