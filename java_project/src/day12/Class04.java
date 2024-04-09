package day12;

public class Class04 {
	
	/* static
	 * static이 붙은 메서드/멤버변수 클래스 멤버변수/메서드라고 함
	 * 객체의 생성없이 클래스가 만들어지면 생성
	 * 객체없이 클래스만으로 사용 가능
	 * 클래스명.메서드/클래스명.멤버변수
	 * 객체를 생성해서 호출도 가능하지만 그렇게 사용하지 않음(노란밑줄:에러는 아니지만 의미없음)
	 * 클래스의 멤버변수/메서드는 하나의 멤버변수가 모든 객체에 공유(사용)할 때 사용
	 * 
	 * static이 안붙은 메서드/멤버변수는 객체(인스턴스)의 멤버변수/메서드라고 함
	 * 객체의 멤버변수/메서드는 객체를 통해 사용되고, 생성됨(객체를 만들지 않으면 생성이 안됨)
	 * 객체명.메서드/객체명.멤버변수
	 * 각 객체마다 독립적인 객체 -> 각 객체마다 독립적인 멤버변수, 메서드를 생성
	 * 
	 * 클래스/객체는 생성 시점이 달라서 메서드를 사용할 수 있는 환경이 다름
	 * 객체의 멤버는 클래스가 생성되고난 후 객체를 생성할 수 있음
	 * 클래스 멤버는 클래스의 멤버(변수/메서드)/객체의 멤버(변수/메서드)에서 모두 사용될 수 있음
	 * 객체의 멤버는 객체에서만 사용될 수 있음
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tv t = new Tv();
		t.printPower();
		t.printBRAND();
		
		
	}

}

class Tv{
	private boolean power;
	private final String BRAND = "LG";
	
	//power를 출력하는 메서드
	public void printPower() {
		if(power) {
			System.out.println("TV가 켜졌습니다.");
		}else {
			System.out.println("TV가 꺼졌습니다.");
		}
		//객체 메서드에서 클래스 변수를 사용할 수 있음
		//클래스의 멤버는 어디서든 사용 가능
		System.out.println("Brand : "+BRAND); //가능
	}
	
	public void printBRAND() {
		System.out.println("Brand : "+BRAND);
	}
	
	
}