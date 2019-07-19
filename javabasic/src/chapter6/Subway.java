package chapter6;

public class Subway {
	
		String lineNumber;
		int passengerCount;
		int money;

		public Subway(String lineNumber) { //
			this.lineNumber = lineNumber;
		} // end of 
		
		public void take(int money) {
			this.money += money;
			this.passengerCount ++;
			
		}// end of
		
		public void showInfo() {
			System.out.println(lineNumber +"의 현재 탑승 승객은 " + passengerCount + " 명, " + "수익은 " + money +" 원입니다.");
		}
		
		
	} // end of the



