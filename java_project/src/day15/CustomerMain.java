package day15;

import java.util.Scanner;

public class CustomerMain{

	public static void main(String[] args) {
		

		Customer gc = new GoldCustomer();
		gc.setCustomerName("김하늘");
		gc.setCustomerID(12345);
		gc.setCustomerGrade("VIP");
		gc.setAgentID(501);
		
		gc.calcPrice(100000);
		gc.customerInfo();
		System.out.println(gc.toString());
		
	}

}


