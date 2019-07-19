package chapter5;

public class CarTest {

	public static void main(String[] args) {
		
		Car satanCar = new Car(); // new Car 가 생성자
		satanCar.showInfo();
		
		Car penryCar = new Car("보라색", "디젤", "인조가죽");
		penryCar.showInfo(); // 카 클래스에서 void 가 있으면 안돌아감. void빼서 돌아가야된다 
		penryCar.setColor("빨강");
		penryCar.showInfo();
		
		
		
		/*// Car penryCar = new Car();  // 특정한 개체가 만들어졌으면 그 개체의 권한은 제한되어야겠지? 남이 펜리차를 맘대로 할 순 없으니까
		
		//생성자가 만들어졌으니까 필드값을 넣어보자. 
		
		satanCar.color = "blue";		
	//	satanCar.speed = 1000; // 펜리차 속도는 펜리만 건드리게 제한해놨음 현명이는 못건드려 그래서 Car 클래스에서 Private int speed 헀어
								// 현명이가 막 속도 1000으로 밟으면 펜리 죽어ㅠ
							//---> 그럼 어떡해 펜리차  Car 클래스에서 public 으로 method 만들어서 일단 조절하게 했어 
		satanCar.setSpeed(0); // ---> 여기서 car 클래스에서 setspeed 참조했음. 외부에서는 함부로 바꾸는게 아니라 허가된 통로인 setspeed를 통해서만 값을 바꿀 수 있음 그니까 허락맡고 바꾼다는소리
							 //  ---> 정보를 보호해야하므로 권한을 없게 만들었음. 그러나 부득이하게 정보를 변경해야하는 경우가 있는데, 
									 // 그 방법은 제한된 경로를 통해서(공식절차)를 통해서만 접근할 수 있게 함
								/* 예를 들어 나라 라는 클래스가 있음. speed 
		satanCar.showInfo(); // 색깔은 : blue이고,현재 속도는 0 입니다.
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*
		System.out.println(satanCar);  // chapter5.Car@15db9742 --> 힙 메모리 안에 패키지.클래스@메모리주소값 에 만들어졌다는 소리
		System.out.println(penryCar); // chapter5.Car@6d06d69c ---> 힙 메모리 안에 패키지.클래스@메모리주소값 에 만들어졌다는 소리
*/
		
		
		
		
		
		
		
/*		
		satanCar.upSpeed(50);
		satanCar.showInfo(); // 색깔은 : blue이고,현재 속도는 50 입니다.
		
		satanCar.upSpeed(500); 
		satanCar.showInfo(); // 색깔은 : blue이고,현재 속도는 300 입니다. 
		
		satanCar.downSpeed(290); //색깔은 : blue이고,현재 속도는 10 입니다.
		satanCar.showInfo();
		
		satanCar.downSpeed(30); //색깔은 : blue이고,현재 속도는 0 입니다.
		satanCar.showInfo();
		
		CarTest 클래스는 현재 Car 클래스를 참조한다. 
		클래스는 여러개 생성해서 메인함수가 있는 클래스를 참조하면 된다(=참조변수)  
		
		satanCar 는 stack memory에 들어가고, 여기에는 new Car()라는, 컬러와 스피드라는 필드(속성)을 가진 것이 생성되었다.
	
		
		
*/
		
		
		
		
	} // end of main

} //end of class
