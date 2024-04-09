package day12;

import javax.print.attribute.standard.PrinterInfo;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		info inEz = new info("김이젠","950818",30,"010-1111-1111","인천","파이썬(4개월)");
		inEz.printSt();
		inEz.printEz();
		inEz.printInfo();
		inEz.printAdd("자바(3개월)");
		inEz.printAdd("빅데이터(6개월)");
		inEz.printAdd("C언어(4개월)");
		inEz.printAdd("정보보안(5개월)");
		inEz.printAdd("서버관리(7개월)");
		inEz.printAdd("html(2개월)");
	
	}

}

/* 학생 정보를 관리하기 위한 클래스
 * 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
 * 학원 정보 : 학원명 = "EZEN"(final static), 지점
 * 수강 정보 : 수강과목, 기간
 * -> 여러 과목을 들을 수 있음(여러과목 수강하기 위해서는 배열로 처리 5과목까지 가능)
 * ex) 홍길동 960101 010-1234-5678 28
 *     EZEN(인천)
 *     자바 3개월, 파이썬 4개월, 빅데이터 6개월
 * 기능 추가(메서드)
 * 학생 기본정보를 출력하는 기능
 * 학원 정보를 출력하는 기능
 * 수강 정보를 출력하는 기능
 * 학생의 수강정보를 추가하는 기능
 * */

class info{
	
	//멤버변수
	private String name;
	private String birth;
	private String phone;
	private int age;
	
	private final static String ezen = "EZEN";
	private String gigum;
	
	private String group;
	int cnt = 0;
	private String[] groupArr = new String[5];
	
	//기본 생성자
	public info(){
	}
	
	public info(String name, String birth, int age, String phone,String gigum,String group){
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;	
		this.gigum = gigum;
		this.group = group;
	}
	
	//학생 기본정보를 출력하는 기능
	public void printSt() {
		System.out.println("[학생 정보] 이름:"+name+", 생년월일:"+birth+", 나이:"+age+"세, 연락처:"+phone);
	}
	
	//학원 정보를 출력하는 기능
	public void printEz() {
		System.out.println("[학원 정보] "+ezen+"("+gigum+")");
	}
	
	//수강 정보를 출력하는 기능
	public void printInfo() {
		System.out.println("[수강정보] "+group);
	}
	
	//학생의 수강정보를 추가하는 기능
	public String printAdd(String group) {
		if(cnt<4) {
			this.group = group;
			System.out.println("(추가 수강) "+group);
			cnt++;
		}else {
			System.out.println("과목은 5개를 초과할 수 없습니다.");
		}
		return group;
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGigum() {
		return gigum;
	}
	public void setGigum(String gigum) {
		this.gigum = gigum;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getEzen() {
		return ezen;
	}
	
}