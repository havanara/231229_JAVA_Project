package day13;

import java.util.Scanner;

/* Product 클래스 생성 : 상품을 등록하는 클래스
 * 상품명, 가격을 멤버변수로 생성
 * 상품추가 메서드
 * 추가한 상품 출력 메서드(toString으로 생성가능)
 */

//상품을 등록하는 클래스
class Product{
	//멤버변수(상품명, 가격)
	private String name;
	private String price;
	//기본메서드
	public Product() {
	}
	//상품 추가 메서드
	public String productAdd(String name, String price) {
		return "상품 : " + name + "("+price+"원)";
		
}
	//추가한 상품 출력 메서드(toString())
	@Override
	public String toString() {
		return "상품 : " + name + "("+price+"원)";
	}
	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}

public class 과제 {

	public static void main(String[] args) {

		/* 상품을 10개 등록 가능한 배열 생성
		 * 스캐너를 이용하여 상품을 등록받기
		 * 등록한 상품 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		Product p = new Product();
		String[] pro = new String[10];
		for(int i=0; i<pro.length; i++) {
			System.out.println("상품명, 가격을 등록하세요.");
			pro[i] = p.productAdd(scan.next(),scan.next());
		}
		for(String s:pro) {
			System.out.println(s.toString());
			
		}
		
		scan.close();
		
			
			
		
		
	}

}