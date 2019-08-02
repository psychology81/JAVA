package chapter8;

import java.util.ArrayList;

public class CTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		VipCustomer customerPEN = new VipCustomer(161212, "신펜리", 1000000);
/*		customerPEN.setcID(161212);
		customerPEN.setcName("신펜리");
		customerPEN.bonusPoint = 1000000; */
		customerPEN.cPrice(200000);

		
		Customer customerLee = new Customer(10010, "나혜석");
		Customer customerYoo = new Customer(10020, "유성은");
		Customer customerNo = new GoldCustomer(10030, "노현명");
		Customer customerHSK = new GoldCustomer(10040, "현슬기");
		Customer customerShin = new VipCustomer(10050, "신연아", 12345);
		
		customerList.add(customerShin);
		customerList.add(customerLee);
		customerList.add(customerHSK);
		customerList.add(customerNo);
		customerList.add(customerYoo);
		
		System.out.println("=====고객정보출력=====");

		for(Customer customer : customerList) {
			System.out.println(customer.showCInfo());
		}
		
		System.out.println("===== 할인율, 보너스 포인트 계산 =====");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.cPrice(price);
			System.out.println("[ " + customer.getcGrade() + " ] " + customer.getcName() + "님이 " + cost + " 원 지불하셨습니다.");
			System.out.println("[ " +customer.getcGrade()+ " ] " + customer.getcName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다." );
		}
		
		
		
		
	}

}
