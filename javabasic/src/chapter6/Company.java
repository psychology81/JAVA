package chapter6;

public class Company {

	private static Company instance = new Company(); // 자기 자신을생성. 유일하게 생성된 인스턴스
	private Company() {
	}

	public static Company getInstance() {
		if(instance == null) { // 인스턴스가 null 이라면, new company 를 만들어라
			instance = new Company ();
		}
		return instance; // null 이 아니라 이미 인스턴스가 있다면 기존 인스턴스를 가져라가라라
	} // end of company
} // end of class