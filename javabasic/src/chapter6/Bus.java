package chapter6;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) { //
		this.busNumber = busNumber;
	} // end of public Bus
	
	public void takeOnBus(int money) {
		this.money += money;
		this.passengerCount ++;
	
		
	}// end of take On bus
	
	
	public void takeOffBus() {
		this.passengerCount --;
	}
	
	public void showInfo() {
		System.out.println(busNumber +"번 버스의 현재 탑승 승객은 " + passengerCount + " 명," + "수익은 " + money +" 원입니다.");
	}
	
	
} // end of the class bus
