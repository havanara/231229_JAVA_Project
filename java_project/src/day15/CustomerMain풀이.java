package day15;

public class CustomerMain풀이 {

	public static void main(String[] args) {
		
		Customer풀이[] customerList = new Customer풀이[10];
		
		Customer풀이 cLee = new Customer풀이(1001,"이종혁");
		Customer풀이 cHong = new GoldCustomer풀이(1002,"홍민주");
		Customer풀이 cKim = new VipCustomer풀이(1003,"김하늘",1111);
		
		int cnt = 0;
		customerList[cnt] = cLee;
		cnt++;
		customerList[cnt] = cHong;
		cnt++;
		customerList[cnt] = cKim;
		cnt++;
		customerList[cnt] = new Customer풀이(1004,"최주영");
		cnt++;
		customerList[cnt] = new GoldCustomer풀이(1005,"문혜미");
		cnt++;
		customerList[cnt] = new VipCustomer풀이(1006,"박현우",2222);
		cnt++;
		customerList[cnt] = new VipCustomer풀이(1007,"정우진",1111);
		cnt++;
		
		/* 다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		 * 자식 고유의 멤버변수나 메서드를 호출하고자 할 때 사용
		 * 다운캐스팅 : 반드시 명시적으로 형변환 해야함
		 * instanceof : 객체의 형이 맞는지 체크하는 명령어 true / false로 리턴
		 */
		
		System.out.println("-----할인율 & 보너스 포인트-----");
		
		int price = 100000;
		for(int i=0; i<cnt; i++) {
			int salePrice = customerList[i].calcPrice(price);
			System.out.printf(customerList[i].getCustomerName()+"님 지불 금액 ▷ "+salePrice+"원 %n보너스 포인트 ▶ "
			+customerList[i].getBonusPoint()+"point %n");
		}
		
		System.out.printf("%n-----고객정보-----%n");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
		}
		
		//agentID = 1111 -> 3333 변경
		for(int i=0; i<cnt; i++) {
			Customer풀이 c = customerList[i];
			if(c instanceof VipCustomer풀이) {
				VipCustomer풀이 vip = (VipCustomer풀이) c;
				if(vip.getAgentID()==1111) {
					vip.setAgentID(3333);
				}
			}
		}

		
		System.out.printf("%n-----고객정보-----%n");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
		}
		
		
		
		
//		int price = cLee.calcPrice(10000);
//		System.out.println("금액 "+price);
//		cLee.customerInfo();
//		
//		int price = cHong.calcPrice(10000);
//		System.out.println("금액 "+price);
//		cHong.customerInfo();
//		
//		int price = cKim.calcPrice(10000);
//		System.out.println("금액 "+price);
//		cKim.customerInfo();
		
		

	}

}
