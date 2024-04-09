package day11;

import javax.lang.model.util.AbstractAnnotationValueVisitor6;

public class Class04 {

	public static void main(String[] args) {
		/* Tv 클래스 생성
		 * 멤버변수 : brand, power, ch, vol
		 * 메서드 :
		 * power() : "TV가 켜졌습니다/TV가 꺼졌습니다" 출력
		 * chUp() : 1씩 증가, 20번까지 출력, 20이 넘어가면 다시 0으로 순환구조
		 * chDown() : 1씩 감소, Up과 동일한 순환 구조
		 * volUp()/volDown() : 1씩 증가/1씩 감소, 10까지 있음, 10이 넘으면 10, 0이면 음소거 출력
		 * */

		Tv v = new Tv();
			
		v.print();
		v.power();
		v.power();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chUp();
		v.chDown();
		v.chDown();
		v.chDown();
		v.chDown();
		v.chDown();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volUp();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
		v.volDown();
			
	}

}

class Tv {
	
	private final String BRAND = "LG"; //final은 변경할 수 없는 값을 지정, final사용시 변수명은 대문자 작성 /첫 기본값 null
	private boolean power; //첫 기본값 false
	private int ch; //첫 기본값 0
	private int vol; //첫 기본값 0
	
	//출력 메서드
	public void print() {
		System.out.println(BRAND+" TV");
	}
	
	public void power() {
		power = !power;
		if(power) { //TV가 켜진 상태
			System.out.println("전원 ON!");
		}else { //TV가 꺼진 상태
			System.out.println("전원 OFF!");
		}
	}
	
	public void chUp() { //기본값 0
			if(ch>=20) {
				ch=0;
				System.out.println("ch "+ch+"번");
			}else {
				ch+=1;
			System.out.println("ch "+ch+"번");
		}
	}
	
	public void chDown() {
			if(ch<=0) {
				ch=20;
				System.out.println("ch "+ch+"번");
			}else {
				ch-=1;
				System.out.println("ch "+ch+"번");
		}
	}
	
	public void volUp() {
			if(vol>=10) {
				vol=10;
				System.out.println("vol "+vol);
			}else {
				vol+=1;
				System.out.println("vol "+vol);
			}
		}
	
	
	public void volDown() {
			if(vol<=0) {
				vol=0;
				System.out.println("음소거");
			}else {
				vol-=1;
				System.out.println("vol "+vol);
			}
		}
	

	public String getBrand() {
		return BRAND;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
	
}

