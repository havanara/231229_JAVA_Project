package day11;

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

public class Card {

	//멤버변수
		private int num;
		private char shape;

		//기본 생성자
		public Card(){
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
		    	System.out.print(shape+String.valueOf(shape1)+" ");	
		    }else if(num>=1 && num<=10){
		    	System.out.print(shape+String.valueOf(num)+" ");		    	
		    }else {
		    	System.out.print("♥1"+" ");
		    }
		    

		}
		
		//getter/setter 생성
		public int getNum() {
			return num;
		}

		//setter 외부의 값(매개변수) 내부변수(멤버변수)를 변경할 때 사용하는 메서드
		public void setNum(int num) { //1~13까지만 내 숫자, 그 외는 1로 설정
			if(num>=1 && num<=13) {
				this.num = num;
			}else {
			this.num = 1;
		}
	}

		public char getShape() {
			return shape;
		}

		public void setShape(char shape) { //♥, ◆, ♣, ♠이 아닌 모양은 ♥로 설정
			if(shape=='♥'||shape=='◆'||shape=='♣'||shape=='♠') {
				this.shape = shape;		
			}else {
				this.shape = '♥';
			}
		}
	
}
