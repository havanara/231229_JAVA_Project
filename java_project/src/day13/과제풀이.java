package day13;

import java.util.Scanner;

/* Product 클래스 생성 : 상품을 등록하는 클래스
 * 상품명, 가격을 멤버변수로 생성
 * 상품추가 메서드
 * 추가한 상품 출력 메서드(toString으로 생성가능)
 */

class Product1{
	//멤버변수
	private String name;
	private int price;
	
	//생성자
	public Product1() {}
	public Product1(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "품명:" + name + ", 가격:" + price+"원";
	}
	//메서드
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class 과제풀이 {

	public static void main(String[] args) {
		/* 상품을 10개 등록 가능한 배열 생성
		 * 스캐너를 이용하여 상품을 등록받기
		 * 등록한 상품 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		//Product 클래스를 담을 수 있는 배열 10칸을 준비했다는 의미
		Product1[] menu = new Product1[10];
		
		//상품을 등록하시겠습니까? (y/n) y -> 등록, n -> 미등록
		//n을 누르면 등록한 상품 출력	
		
//		int cnt = 0;
//		Product1 p = new Product1("피자", 15000);
//		menu[cnt] = p;
//		cnt++;
//		Product1 p1 = new Product1();
//		p1.insertProduct("음료", 2000);
//		menu[cnt] = p1;
//		cnt++;	
		
		char c = 'y'; //반복 키워드
		int cnt = 0; //index 역할을 하는 변수
		
		while(c != 'n') { //(!c.equals("n")) -> String일 경우
			System.out.println("상품을 등록하시겠습니까? (Y/N)");
			c=scan.next().charAt(0);
			if(c=='y') {
				System.out.println("상품명을 입력하세요.");
				String name = scan.next();
				System.out.println("가격을 입력하세요.");
				int price = scan.nextInt();
				
				//객체 생성
				Product1 p = new Product1();
				menu[cnt] = p;
				menu[cnt].insertProduct(name, price);
				cnt++;
			}else {
				if(c=='n') {
					System.out.println("상품등록 종료");
				}else {
					System.out.println("Y/N만 가능합니다.");
				}
				
			}
			System.out.println("--등록된 상품 리스트--");
			for(int i=0; i<cnt; i++) {
				//toString 사용 경우
				System.out.println((i+1)+" "+menu[i]);
				//출력 메서드가 있는 경우
				//menu[i].print();
			}
		
//		while(true) {
//			char s = scan.next().charAt(0);
//			if(s=='Y' || s=='y') {
//				for(Product1 a : menu) {
//					System.out.println("상품명과 가격을 입력하세요.");
//					a.insertProduct(scan.next(), scan.nextInt());
//					menu[cnt] = a;
//					cnt++;
//					System.out.printf(a.toString()+"%n");					
//				}
//				System.out.printf(menu[cnt].toString()+"%n");
//			}else if(s=='N' || s=='n') {
//				System.out.println("------등록된 상품 내역------");
//				for(Product1 a : menu) {
//					System.out.printf(a.toString()+"%n");
//				}
//			}else {
//				System.out.println("잘못 입력된 값입니다.");
//				break;
//			}

		
		}
		scan.close();
		
		
		

	}

}
