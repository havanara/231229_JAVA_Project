package day15;

public class VipCustomer풀이 extends Customer풀이 {

	private double saleRatio;
	private int agentID;
	
	public VipCustomer풀이() {}
	public VipCustomer풀이(int id, String name, int agentid) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		agentID = agentid;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		//세일가격 구하기
		price = price - (int)(price*saleRatio);
				return price;
	}
	@Override
	public void customerInfo() {
		super.customerInfo();
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
}
