 /* 생년월일을 입력함
	만약 ~19 세= 미성년
	20대 ~ 30대  = 청년
	40대 ~ 50대 = 중장년
	60대  ~ = 노년

 1 ) 프로그램 작성 전 논리 처리 과정의  순서도
 2 ) 의사코드 ( Pseudo Code ) = 수도코드. 유사한, 비슷한
                             일상의 언어를 빌려 처리과정을 순서대로 기술하는 것 
               e.g. 

*/

package chapter4;

import java.util.Scanner;

public class PR01 {

	public static void main(String[] args) {
		
		
		// 1. 필요한 변수 선언
		Scanner sc = new Scanner(System.in);
		int birthyear, age;
		
		
		//   2. 생년을 입력하는 메시지를 출력 + 입력한다.
		System.out.println(" 생년을 입력하세요." );
		birthyear = sc.nextInt();
		
		//  *3. 나이를 계산한다
		age = 2019-birthyear;
		
		//  *4. 계산된 나이를 10으로 나눈다
		switch (age/10) {
		
		//  * 4-1. 0, 1 = 미성년
		case 0 : case 1: 
			System.out.println("미성년입니다.");
			break;
			
		//  *      2, 3 = 청년
		case 2 : case 3 :
			System.out.println("청년입니다.");
			break;
		//  *      4, 5 = 중장년
		case 4 : case 5 : 
			System.out.println("중장년입니다.");
			break;
		
		//  *      6 ~ = 즉 0~5 이외에는  노년 으로 출력한다. 
		default :
			System.out.println("노년");
			break;
		} //end of switch


		
		
		
		
		
		
	}

}
