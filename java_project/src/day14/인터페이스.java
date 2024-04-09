package day14;

public class 인터페이스 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어짐
		 * 추상메서드 : 메서드의 선언부만 있고 구현부가 없는 메서드 (~하겠다 만 있고 구현 하진 않음)
		 * 추상클래스/인터페이스 -> 반드시 구현을 해야 객체를 생성할 수 있음
		 * 
		 * 인터페이스 키워드 : interface
		 * 기능요약서 : 메뉴얼 화
		 * 자체적으로 사용할 수 없고 인터페이스를 구현한 클래스로 활용
		 * 구현 키워드 : implements
		 * 인터페이스는 멤버변수가 없어 이 부분을 염두에 두고 메서드 정리가 필요
		 * 상속 : 다중상속 불가능
		 * 구현 : 다중구현 가능
		 * 상속 + 구현은 동시에 가능
		 * */
		
		Tv t = new Tv();
		t.trunon();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.trunoff();
		t.trunon();
		t.volUp();

	}

}

interface Power{
	abstract void trunon();
	abstract void trunoff();	
}

interface Remocon{
	void volUp();
	void volDown();
}

//class Tv extends A implement B{} //상속과 구현을 하는 케이스(이 방식은 잘 안씀)

//인터페이스 구현
class Tv implements Power, Remocon{ //인터페이스를 구현한 클래스 / 다중 구현
	
	private boolean power;
	private int ch;
	private int vol;

	@Override
	public void trunon() { //전원켜기
		power = true;
		System.out.println("전원이 켜졌습니다.");		
	}

	@Override
	public void trunoff() { //전원끄기
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}
	
	public void chUp() {
		if(power) {
			ch++;
			System.out.println("ch:"+ch);
		}
	}
	
	public void chDown() {
		if(power) {
			ch--;
			System.out.println("ch:"+ch);
		}
	}

	@Override
	public void volUp() {
		power = true;
		vol++;
		System.out.println("vol:"+vol);
	}

	@Override
	public void volDown() {
		power = true;
		vol--;
		System.out.println("vol:"+vol);
	}
	
}
