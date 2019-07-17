package chapter4;

import java.util.Scanner;

public class PR02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 사용자로부터 시작하는 숫자와 끝나는 숫자
		begin=시작숫자, end=끝나는 숫자 를 입력받아서
		begin부터 end 까지의 숫자를 모두 합하세요
		e.g begin=1 end=100 --> begin 1부터 100까지 다 더해
	
		*/
		

		// * 1. 필요한 변수 선언 begin end sum, num
		Scanner sc = new Scanner(System.in);
		int num, begin, end, sum=0;
		
		// * 2. begin end 입력받는다
		System.out.println(" 시작 숫자를 입력하세요." );
		begin = sc.nextInt();
		System.out.println(" 끝 숫자를 입력하세요." );
		end= sc.nextInt();
		
		// * 3. num =begin
		num=begin;
		
		// * 4. num <= end 반복
		while(num<=end) {
			sum+=num;
			num++;
		}
			System.out.println(begin+ "부터 " + end+ "까지의 합은"+ sum +"입니다.");
		
		// * 4. sum += num
		// * 5. num++;
		// * 6. 출력
		// 
		
		
		/* 내가한거
		// 1. 필요한 변수 선언 - 입력, 시작숫자, 끝숫자, sum
		Scanner sc = new Scanner(System.in);
		int begin, end, sum=0;
		
		//   2. 시작 / 끝 숫자를 입력받는다
		System.out.println(" 시작 숫자를 입력하세요." );
		begin = sc.nextInt();
		System.out.println(" 끝 숫자를 입력하세요." );
		end= sc.nextInt();
		
		//3. 반복
		while(begin <= end) {
			sum+=begin;
			begin++;}
			System.out.println(begin+ "부터 " + end+ "까지의 합은"+ sum +"입니다.");
		
			
		*/
		
		
	}

}
