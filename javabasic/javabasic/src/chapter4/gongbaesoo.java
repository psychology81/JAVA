package chapter4;

import java.util.Scanner;

public class gongbaesoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 공배수를 찾을 때는 ? 
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
					if((num%3==0) || (num%5==0))System.out.println(num);;
					// 3 또는 5의 배수 를 출력하세요
					// 3과 5의 공배수는 &&
					num++;
				}
				// * 4. sum += num
				// * 5. num++;
				// * 6. 출력
				// 
		
		
		
		
		
	}

}
