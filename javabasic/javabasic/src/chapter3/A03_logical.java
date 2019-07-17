package chapter3;

public class A03_logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((10>5)&&(3>1)); // 둘 다 참 true
		
		System.out.println((10<5)&&(3>1)); // 한 쪽이 거짓인 경우
		
		System.out.println((10<5)||(3>1)); //하나는 거짓, 하나는 참인 상태 : 트루로 나옴 
		System.out.println((10<5)||(3<1)); // 둘 다 거짓이면? : false 로 나옴
		
		System.out.println(!(10<5)); //  거짓인데 부정하니 참(true 나옴)
		System.out.println(!(10>5)); // 참인데 부정하니 거짓으로 
		
		// : 동시에 처리되는 상황이 나올 때 논리연산이 나와서 순서를 정해줌 
		
		
		 
	}

}
