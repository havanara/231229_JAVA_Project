package test;

public class CardPack2 {
	//멤버변수
	//숫자 2~10,K,Q,K = 12개 * 문자 4개 = 48장의 카드
	private Card2 arr[] = new Card2[48]; //카드 담는 배열
	private int count = 0; //카드 담는 배열 index
	//생성자
	public CardPack2() {}
	//메서드
	//카드 생성
	public void cardAdd() {
		char shape = '♥';
		for(int i=1; i<=4; i++) {
		switch(i) {
		case 1 : shape = '♥'; break;
		case 2 : shape = '◆'; break;
		case 3 : shape = '♣'; break;
		case 4 : shape = '♠'; break;
		}
		//(반복문)이중 for문 모양+숫자
		for(int j=2; j<=13; i++) {
			Card2 card = new Card2(); //카드 객체 생성
			card.setShape(shape);
			card.setNum(j);
			arr[count] = card;
			count++;
		}
		}
	}
	//카드 고르기
	public Card2 cardPick() {
		return arr[count];
	}
	//getter/setter
	public Card2[] getArr() {
		return arr;
	}

	public void setArr(Card2[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if(count>48) {
			System.out.println("전체 카드는 48장입니다. 카드가 더 이상 없습니다.");
		}else {
			this.count = count;			
		}
	}
}
