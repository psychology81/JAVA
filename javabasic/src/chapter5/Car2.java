package chapter5;

public class Car2 {


	// member 변수  라고도 하고  field 라고도 하고 속성이라고도 한다.  얘들은 기본생성자인데 
	private String color = "흰색";
	private String engine= "가솔린";
	private String fabric="가죽";
	private int speed = 0 ;
/*	public void setSpeed(int value) {
		speed = value;
	}// public void setSpeed*/

	public Car2() {  //<---------생성자
		this("검정색", "디젤", "인조가죽");
	}
	public Car2(String pcolor, String pengine, String pfabric) { // 현재 이 메소드를 사용하면 기본값이 흰색이더라도 컬러값을 받는 생성자 (지정해줄 수 있음)
		this.color = pcolor;
		this.engine = pengine;
		this.fabric = pfabric;
		
	}
	
	Car2 returnItself() { 
		return this; // 이 클래스로부터 만들어진 해당 객체의 시작주소값을 리턴한다 
	}// returnItself
	
	
	
	
	// member method, method, 함수. 자바에서는 method 라고 부르는 것이 일반적임
	// 속도를 올려주는(가속하는) 메소드니까 그냥 가속메소드라고 할게~
	public void upSpeed(int value){
		if(speed + value > 300 ) 
		   speed = 300;
		else speed = speed + value;
		}// end of upSpeed


	//속도를 줄여주는 (감속하는) 메소드도 만들어볼게
	public void downSpeed(int value) {
		if(speed - value <= 0)
		   speed = 0;
		else speed = speed - value;
	}// end of downSpeed

	
	 // 정보를 보여주는 method 만들기
	public void showInfo() {
		System.out.println("색깔은 : " + color + "이고," + "현재 속도는 " + speed + " 입니다.");
	} // end of showSpeed 
	
	// source - getter and setter  
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}
	/**
	 * @return the fabric
	 */
	public String getFabric() {
		return fabric;
	}
	/**
	 * @param fabric the fabric to set
	 */
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}



} // end of class car
