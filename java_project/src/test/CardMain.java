package test;

public class CardMain {

	public static void main(String[] args) {
		CardPack2 cp2 = new CardPack2();
		System.out.println(cp2.cardPick());
	
		int cnt = 0;
		for(int i=1; i<=4; i++) {
			for(int j=2; j<=13; i++) {
				cp2.getArr()[cnt].print();
				cnt++;
			}
		}
		System.out.println("Card Game~!");
		Card2 player1 = cp2.cardPick();
		System.out.println("player1님의 카드 > ");
		player1.print();
		Card2 player2 = cp2.cardPick();
		System.out.println("player2님의 카드 > ");
		player2.print();		
	}

}
