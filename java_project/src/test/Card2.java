package test;

public class Card2 {
	//멤버변수(모양,숫자)
	private char shape;
	private int num;
	//생성자
	public Card2() {}
	public Card2(char shape,int num) {
		//'♥'와 1을 기본값으로 설정
		this.shape = '♥';
		this.num = 1;
	}
	//메서드
	public void print() {
		char jqk; // J,Q,K 담을 변수선언
		if(num>10&&num<14) {
		switch(num) {
		case 11 : jqk='J'; break;
		case 12 : jqk='Q'; break;
		/* num가 10보다 크거나 14보다 작다는 조건(11or12or13)이기 때문에
		 * case11, case12가 있는 현 상황에서
		 * case13을 가정하고 default를 적는건 의미가 없음
		 */
		default : jqk='K'; break;
		}
		//String.valueOf() : 숫자를 문자로 변환
		System.out.println(shape+String.valueOf(jqk));
		}else if(num>=2&&num<=10){
			System.out.println(shape+String.valueOf(num));
		}else {
			System.out.println("잘못된 값입니다.");
		}
	}
	//getter/setter
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		if(shape=='♥'||shape=='◆'||shape=='♣'||shape=='♠') {
			this.shape = shape;			
		}else {
			this.shape = '♥';
		}
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num>=2&&num<=13) {
			this.num = num;
		}
		this.num = 1;
	}
	
	
	
}
