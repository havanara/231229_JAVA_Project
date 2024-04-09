package day11;

public class CardEx {

public static void main(String[] args) {
	
/* 1장의 카드를 생성하기 위한 클래스
 * 숫자 : 1~10, J(11), Q(12), K(13)
 * 모양 : ♥, ◆, ♣, ♠
 * 한장의 카드를 출력하는 기능을 가진 print() 라는 메서드 생성 ex)♥1 (모양숫자)출력
 * ex) ◆12 -> ◆Q, ★2(없는모양입력) -> ♥2, ●17(없는모양없는값) -> ♥1(기본값)
 * */

/* 클래스의 구성
 * 멤버변수 : 모양(shape), 숫자(num) -> private 선언 -> getter/setter 생성
 * 메서드 : print()
 * 생성자 : 기본 생성자만 생성 -> 기본값 ♥1
 * */

//	Card01 c = new Card01();
//
//	c.setNum(5);
//	c.setShape('♥');
//	c.print();
//	c.setNum(11);
//	c.setShape('★');
//	c.print();
//	c.setNum(20);
//	c.setShape('♣');
//	c.print();
	
	CardPack cp = new CardPack(); //52장의 카드가 모두 생성됨
	cp.shuffle();
	int cnt = 0;
	for(int i=0; i<4; i++) {
		for(int j=0; j<13; j++) {
			cp.getPack()[cnt].print(); //CardPack 클래스 안에 있는 pack[] 리턴
			//cp.getPack()[cnt] : pack[0]의 의미 -> Card(멤버변수,메서드)
			cnt++; //52
		}
		System.out.println();
	}
	System.out.println("-------------------------");
	Card player1 = cp.pick();
	Card player2 = cp.pick();
	System.out.println("player1 Card open");
	player1.print();
	System.out.println("");
	System.out.println("player2 Card open");
	player2.print();

	
	}	
}



class Card01 {

	//멤버변수
	private int num;
	private char shape;

	//기본 생성자
	public Card01(){	
		this.shape = '♥';
		this.num = 1;
	}
	
	//print() 메서드
	public void print() {
	    char shape1;
	    if(num>10 && num<14) {
	    	switch(num) {
	    	case 11: shape1='J'; break;
	    	case 12: shape1='Q'; break;
	    	default: shape1='K'; break;
	    	}
	    	System.out.println(shape+String.valueOf(shape1));	
	    }else if(num>=1 && num<=10){
	    	System.out.println(shape+String.valueOf(num));		    	
	    }else {
	    	System.out.println("♥1");
	    }
	    

	}
	
	//getter/setter 생성
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num>=1 && num<=13) {
			this.num = num;
		}else {
		this.num = 1;
	}
}

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
	
	
	
}
