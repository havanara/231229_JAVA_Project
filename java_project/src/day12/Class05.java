package day12;

public class Class05 {

	/* 객체 생성 시 값을 초기화 하는 방법
	 * 기본값, 명시적 초기값, 초기화 블럭, 생성자
	 * 1. 기본값 : 기본적으로 지정되는 값 -> int = 0, String = null
	 * 2. 명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * ex) private String name = "홍길동";
	 * 3. 초기화 블럭 : { } 멤버변수를 초기화
	 * 4. 생성자 : 객체를 생성할 때 초기화 해서 생성
	 * 
	 * 초기값의 우선순위
	 * 기본값 -> 명시적 초기값 -> 초기값 블럭 -> 생성자
	 * */
	
	public static void main(String[] args) {

		Ezenstudent s = new Ezenstudent("인천","박이젠","java","010-1234-5678");
		//toString() 메서드가 없으면 객체의 주소가 출력
		//toString() 메서드가 있으면 toString()가 출력
		System.out.println(s);
		
//		s.setName("이젠");
//		s.setPhoneNum("010-1234-5678");
//		s.setClassName("빅데이터C");
//		s.print();
		
		Ezenstudent s1 = new Ezenstudent();
		System.out.println(s1);
		
		Ezenstudent s2 = new Ezenstudent("부천","문이젠","빅데이터","010-2345-6789");
		System.out.println(s2);
		
		Ezenstudent s3 = new Ezenstudent("강남","최이젠","java","010-3456-7890");
		System.out.println(s3);
		
		Ezenstudent s4 = new Ezenstudent("인천","정이젠","빅데이터","010-8795-5678");
		System.out.println(s4);
		
		Ezenstudent s5 = new Ezenstudent("강남","원이젠","java","010-3416-7770");
		System.out.println(s5);
		
		Ezenstudent s6 = new Ezenstudent("인천","현이젠","java","010-8295-5748");
		System.out.println(s6);
		
		Ezenstudent studentArr[] = new Ezenstudent[7];
		studentArr[0] = s;
		studentArr[1] = s1;
		studentArr[2] = s2;
		studentArr[3] = s3;
		studentArr[4] = s4;
		studentArr[5] = s5;
		studentArr[6] = s6;
		
		System.out.println();
		//현이젠이 듣고 있는 과목을 출력
		String searchName = "정이젠";
		System.out.println(searchName+" 학생이 듣고 있는 과목 > ");

		for(int i=0; i<studentArr.length; i++) {
			if(searchName.equals(studentArr[i].getName())) {
				System.out.println(studentArr[i].getClassName());
			}
		}
		
		System.out.println();
		//현이젠은 java를 들으려고 했는데 빅데이터로 변경 -> 현이젠 정보 출력
		String modify = "현이젠";
		System.out.println(modify+" 학생 정보 > ");
		
		for(int i=0; i<studentArr.length; i++) {
			if(modify.equals(studentArr[i].getName())) {
				studentArr[i].setClassName("빅데이터");
				System.out.println(studentArr[i]);
			}
		}
		System.out.println();
		//자바를 듣고 있는 학생 명단을 출력, 학생이 없으면 명단에 없습니다 출력
		String subject = "파이썬";
		System.out.println(subject+" 수강중인 학생 내역");
		
		int cnt = 0;
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getClassName().equals(subject)) {
				System.out.printf(studentArr[i]+"%n");
				cnt++;
			}
		}
			if(cnt==0){
				System.out.println("명단에 없습니다.");
		
	}
		
		
	}

}

class Ezenstudent{ //학생의 정보를 생성하는 클래스

	//멤버변수
	private String gigum = "incheon"; //명시적 초기값
	private String name; //기본 초기값 : null
	private String className;
	private String phoneNum;
	
	
	//기본생성자
	public Ezenstudent(){}
	
	public Ezenstudent(String gigum, String name, String className, String phoneNum) {
//		super(); //내 부모 클래스의 생성자 호출(쓸일이 없으면 사용안해도 무방)
		this.gigum = gigum;
		this.name = name;
		this.className = className;
		this.phoneNum = phoneNum;
	}
	
	{
		//초기화 블럭 영역
		gigum = "인천";
		name = "미상";
		className = "미정";
		phoneNum = "000";
	}

	//print() 메서드 -> source-toString() 통해서 대처 가능 / 문자 출력으로 자동 작성 가능
	
//	public void print() {
//		System.out.println("수강생 정보 : "+name+"/"+className+"/"+phoneNum);
//	}

	@Override
	public String toString() {
		return gigum + "[" + name + "/" + className + "/" + phoneNum + "]";
	}

	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
}