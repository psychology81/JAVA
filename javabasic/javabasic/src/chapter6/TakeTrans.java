package chapter6;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentJames = new Student("james", 5000);
		Student studentAvril = new Student("Avril", 10000); // 
/*		System.out.println(studentJames); // chapter6.Student@15db9742
		System.out.println(studentAvril); // chapter6.Student@6d06d69c */ // 객체 생성 -> 제임스, 에이브릴
		
		
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway("2호선");
		
		studentJames.takeOnBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();  // -> 
		System.out.println("-----------------------");
		
		studentAvril.takeOnBus(bus100);
		studentAvril.showInfo();
		bus100.showInfo();
		System.out.println("-----------------------");	
		
		studentJames.takeOffBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		System.out.println("-----------------------");
		
		studentJames.takeSubway(subwayGreen);
		studentJames.showInfo();
		subwayGreen.showInfo();
		System.out.println("-----------------------");
		
		
		
		
		
		
	}

}
