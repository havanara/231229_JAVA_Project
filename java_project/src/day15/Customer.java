package day15;

public class Customer {

		/* 일반고객 / Gold 고객(할인) / VIP 고객(할인)
		 * 
		 * //멤버변수
		 * 고객 ID :int customerID
		 * 고객 이름 : String customerName
		 * 고객 등급 : String customerGrade
		 * 보너스포인트 : int bonusPoint
		 * 보너스포인트 적립 비율 : double bonusRatio
		 * 
		 * //클래스 생성
		 * 기본 customerGrade = "Silver"
		 * bonusRatio = 0.01 -> 1% 적립
		 * 
		 * //메서드
		 * 1. 보너스 적립 계산 메서드(메서드명 : calcPrice(int price))
		 * -> 구매 금액을 주고 적립 보너스를 계산 bounsPoint에 누적
		 * -> 보너스 적립, 할인 여부를 체크해서 구매 price를 리턴
		 * 
		 * 2. 출력 메서드(메서드명 : customerInfo())
		 * -> ex) 홍길동님 등급은 VIP입니다. 보너스 포인트는 1,000포인트입니다.
		 *        전담 상담사 번호는 11111 입니다.(VIP 고객만 출력)
		 * 
		 * 3. Silver 등급
		 * -> 제품을 구매할 때 0% 할인 / 보너스 포인트 1% 적립
		 *    Gold 등급
		 * -> 제품을 구매할 때 10% 할인 / 보너스 포인트 2% 적립
		 *    VIP 등급
		 * -> 제품을 구매할 때 10% 할인 / 보너스 포인트 5% 적립
		 * -> 전담 상담사를 멤버변수에 추가(int agentID)
		 * 
		 * GoldCustomer extends Customer{
		 * 기본 메서드를 오버라이딩 하여 사용
		 * }
		 * 
		 * VIPCustomer extends Customer{
		 * 기본 메서드를 오버라이딩 하여 사용
		 * }
		 * 
		 * CustomerMain 클래스에서 확인
		 * 
		 * */
	
	
	//멤버변수
	private int customerID; //고객 ID
	private String customerName; //고객 이름
	private String customerGrade; //고객 등급
	private int bonusPoint; //보너스포인트
	private double bonusRatio; //보너스포인트 적립 비율
	private int agentID; //VIP 전담상담사 번호
	
	//생성자
	public Customer() {	}
	
	//메서드
    //보너스 적립 계산 메서드
	public int calcPrice(int price) {
		while(true) {
			if(customerGrade=="Silver") {
				double bonusRatio = 0.01;
				System.out.println(bonusPoint += (price * (double)bonusRatio));
			}else if(customerGrade=="Gold") {
				double bonusRatio = 0.02;
				price =  (int)(price-(price*0.1));
				System.out.println(bonusPoint += (price * (double)bonusRatio));
			}else if(customerGrade=="VIP") {
				double bonusRatio = 0.05;
				price =  (int)(price-(price*0.1));
				System.out.println(bonusPoint += (price * (double)bonusRatio));
			}else {
				System.out.println("구매 금액이 없습니다.");
			}
			return price;
		}
	}
	
    //출력 메서드
	public void customerInfo() {
		System.out.printf(customerName+" 님 등급 ▶ "+customerGrade+"%n보너스 포인트 ▶ "+bonusPoint+"%n");
		if(customerGrade=="VIP") {
			System.out.printf("전담상담사 번호 ▶ "+agentID+"%n");
		}
	}

	//getter/setter
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public double getBonusRatio() {
		return bonusRatio;
	}
	
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	//toString
	@Override
	public String toString() {
		return "[" + customerGrade + " " + customerName + " 님] ID : " + customerID + " | 보너스 포인트 : " + bonusPoint;
	}
}

class GoldCustomer extends Customer{

	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public void customerInfo() {
		super.customerInfo();
	}


}


class VIPCustomer extends Customer{

	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public void customerInfo() {
		super.customerInfo();
	}




}
