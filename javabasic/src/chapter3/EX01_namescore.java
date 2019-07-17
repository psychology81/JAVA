package chapter3;

import java.util.Scanner;

public class EX01_namescore {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//필요한 변수를 선언한다 !!!! 뭐가잇을가~~~ 
	
		Scanner sc = new Scanner(System.in);  //)1 키보드로 입력 받을 변수 스캐너
		double language, english, math;       // 2) 입력받을 변수 숫자니까 더블
		double sumScore, avrScore;            // 3) 처리할 변수들 숫자값을 계산할 녀석들~~이니까 더블
			
		System.out.println("이름을 입력하세요");
		String name = sc.next();

		System.out.println("국어 점수 입력");
		language = sc.nextDouble();
		
		System.out.println("영어 점수 입력");
		english = sc.nextDouble();
		
		System.out.println("수학 점수 입력");
		math = sc.nextDouble();

		sumScore = (language + english + math);
		avrScore = ((language + english + math)/3);

		System.out.println(name + "의 총점은" + sumScore + "점," +"평균" + avrScore + "점 입니다.");
	
	// 교수님이 한 거
		// 변수선언하기
		Scanner kbd = new Scanner(System.in);
		int korean, eng, mathmatic;
		double sum, avr;
		String writename;
		
		// 입력하기
		System.out.println("이름 : ");
		writename = kbd.next();
		System.out.println("국어 : ");
		korean = kbd.nextInt();
		System.out.println("영어 : ");
		eng = kbd.nextInt();
		System.out.println("수헉 : ");
		mathmatic = kbd.nextInt();
		
		//총점
		sum = korean + eng + mathmatic ;
		
		// 평균
		avr = (double) sum / 3;
		
		// 출력
		System.out.println(name + "의 총점은" + sumScore + "점," +"평균" + avrScore + "점 입니다.");
		 
	}

}
