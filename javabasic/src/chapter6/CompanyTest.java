package chapter6;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance(); // 객체 만드는데 new 로 만들면 안됨. private 이니까 거기서 허락한 getinstance로만
													// 객체를 만들 수 있음
		System.out.println(myCompany1); 
		System.out.println(myCompany2); // company1,2 둘 다 chapter6.Company@15db9742 로 부터 온거임.
										// 한 개로부터만 올 수 있음. 그게 getInstance
		
		
		
		
	}

}
