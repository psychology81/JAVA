package chapter8;


	public class mOver {
		public static void main(String[] args) {
			Customer customerJ = new Customer(800318, "정문교");
			customerJ.bonusPoint = 1000;
			
			VipCustomer customerK = new VipCustomer(931212, "김사탄", 1200000);
			customerK.bonusPoint = 10000;
			
			int price = 10000;
			System.out.println(customerJ.getcName() + " 님이 지불할 금액은 " + customerJ.cPrice(price) + " 원입니다.");
			System.out.println(customerK.getcName() + " 님이 지불할 금액은 " + customerK.cPrice(price) + " 원입니다.");
			
			System.out.println(customerJ.bonusPoint);
			System.out.println(customerK.bonusPoint);
			
		
			
					
		
		
		
		

	} // end of main

} // end of class