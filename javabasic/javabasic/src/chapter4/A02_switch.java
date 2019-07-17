/*
 * A04_SwitchCase
 * switch~case 문:
 * 조건이 많아질 경우 if~else if 구문의 불편함.
 * 조건식의 결과가 정수 또는 문자열 값이고 그 값에 따라 수행되는 경우 깔끔한 표현 가능함.
 * switch()조건{
 *   case 값1: 수행문1;
 *             break;
 *   case 값2: 수행문2;
 *             break;
 *        ...
 *   case 값n : 수행문n;
 *             break;
 *   default: 수행문d;
 * }
 */


package chapter4;

public class A02_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		int num1 = 2;
		switch(num1) {
		case 1 : 
			System.out.println("숫자 1");
			break;
		case 2 :
			System.out.println("숫자 2");
			break;
		case 3 :
			System.out.println("숫자 3");
			break;
		}
		// if (num1 ==1){
		 //   }else if(num1 ==2){
	     //   }else if(num1 ==3){
		 //   }else {
		 //   };
		
		
		
		
	}

}
