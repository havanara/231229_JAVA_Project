package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	//제네릭 클래스 처리
	private ArrayList<Sale<String,Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String,Integer>> order = new ArrayList<>();

	public void add(Scanner scan) { //제품추가
		System.out.println("--메뉴 추가--");
		System.out.println("제품명 > ");
		String menu = scan.next();
		System.out.println("가격 > ");
		int price = scan.nextInt();
		//객체 생성 후 추가
		Sale<String, Integer> s = new Sale<String, Integer>(menu,price);
		this.menu.add(s);
		System.out.println("메뉴 추가 완료!");
	}

	public void menuPrint() {
		System.out.println("--메뉴 리스트--");
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i));
		}
	}
	
	public void delMenu(Scanner scan) {
		System.out.println("--메뉴 삭제--");
		System.out.println("삭제할 제품명 > ");
		String menuName = scan.next();
		for(Sale<String, Integer> s : menu) {
			if(s.getMenu().equals(menuName)) {
			menu.remove(s);
			System.out.println(menuName+" 삭제완료!");
			return;
		}
		}
		System.out.println("삭제할 메뉴가 없습니다.");
	}
	
	public void modMenu(Scanner scan) {
		System.out.println("--메뉴 수정--");
		System.out.println("수정할 제품명 검색 > ");
		String menuName = scan.next();
		for(Sale<String, Integer> s : menu) {
			if(s.getMenu().equals(menuName)) {
				menu.remove(s);
				System.out.println("수정할 제품명 > ");
				String opName = scan.next();
				System.out.println("수정할 가격 입력 > ");
				int opPrice = scan.nextInt();
				Sale<String,Integer> str = new Sale<String,Integer>(opName, opPrice);
				menu.add(str);
				System.out.println("메뉴 수정완료!");
			return;
				}
		}
		System.out.println("수정할 메뉴가 없습니다.");
	}

	public void orderPick(Scanner scan) {
		//입력받는 값은 제품명, 수량
		//제품명 가격*수량(지불금액)을 order에 추가
		//ex)햄버거 5개 -> 햄버거 25000원
		System.out.println("--제품 주문--");
		System.out.println("제품명 > ");
		String menuName = scan.next();
		for(Sale<String, Integer> s : menu) {
			if(s.getMenu().equals(menuName)) {
				int orderPrice = 0;
				System.out.println("수량 > ");
				int orderEa = scan.nextInt();
				orderPrice += s.getPrice()*orderEa;
				order.add(new Sale(menuName,orderPrice));
				System.out.printf(menuName+" "+orderEa+"개"+"("+orderPrice+"원) %n주문 담기 완료!");
				return;
			}
		}
		System.out.println("해당 제품이 없습니다.");
	}
	
//	public int orderSearch(String name) {
//		//name = 주문메뉴
//		int index = -1;
//		for(int i=0; i<order.size(); i++) {
//			if(order.get(i).getMenu().equals(name)) {
//				index = i;
//				System.out.println(index);
//				return index;
//			}
//		}
//		return index;
//	}

	public void orderPrint() {
		//주문내역 출력
		//총 지불금액 출력
		System.out.printf("%n┏━━━━━━━━━━━━영수증━━━━━━━━━━━━┓%n┃ 제품명(가격)                  ┃%n");
		int totalPrice = 0;
		for(Sale<String, Integer> s : order) {
			totalPrice += s.getPrice();
		}
			for(int i=0; i<order.size(); i++) {
				System.out.println("┃ "+order.get(i)+ "                ┃");
		}
			double vat = totalPrice-((double)totalPrice/1.1);
			double price = (double)totalPrice/1.1;
			System.out.println("┃=============================┃");
			System.out.printf("┃ 공급가액 : "+price+"원  ┃%n");
			System.out.printf("┃ 부가세액 : "+vat+"  ┃%n");
			System.out.printf("┃ 총 금액 : "+totalPrice+"원             ┃%n");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			
			return;
	}


}
