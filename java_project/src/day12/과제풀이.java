package day12;

import javax.naming.directory.SearchControls;

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
public class 과제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st = new student();
		st.setName("홍길동");
		st.setPhone("010-0000-0000");
		st.printInfo();
		st.printCompany();
		st.printCourse();
		
		student st1 = new student("홍길순","010-1111-1111","인천");
		st1.printInfo();
		st1.printCompany();
		st1.insertCourse("java ", "5");
		st1.insertCourse("html ", "1");
		st1.printCourse();

		student st2 = new student("둘리","951208","010-2222-2222",30,"서울");
		st2.printInfo();
		st2.printCompany();
		st2.insertCourse("java ", "5");
		st2.printCourse();
		
		student st3 = new student("짱구","000202","010-3333-3333",25,"부천");
		st3.printInfo();
		st3.printCompany();
		st3.insertCourse("빅데이터 ", "6");
		st3.insertCourse("html ", "1");
		st3.printCourse();
		
		student st4 = new student("짱아","040202","010-4444-4444",21,"부천");
		st4.printInfo();
		st4.printCompany();
		st4.printCourse();
		
		student st5 = new student("봉미선","971025","010-5555-5555",28,"서울");
		st5.printInfo();
		st5.printCompany();
		st5.insertCourse("파이썬 ", "3");
		st5.printCourse();
		
		student st6 = new student("신형만","940321","010-6666-6666",31,"서울");
		st6.printInfo();
		st6.printCompany();
		st6.insertCourse("파이썬 ", "3");
		st6.insertCourse("빅데이터 ", "6");
		st6.insertCourse("html ", "1");
		st6.insertCourse("java ", "5");
		st6.printCourse();
		
		student st7 = new student("코난","990712","010-7777-7777",26,"인천");
		st7.printInfo();
		st7.printCompany();
		st7.printCourse();

		student[] std = new student[8];
		std[0]=st;
		std[1]=st1;
		std[2]=st2;
		std[3]=st3;
		std[4]=st4;
		std[5]=st5;
		std[6]=st6;
		std[7]=st7;
		
		System.out.println("-----------------------------------");
		//짱구 학생의 학생정보, 학원정보, 수강정보를 출력
		String searchName = "짱구";
		System.out.println(searchName+" 학생 검색내역 >");
		for(int i=0; i<std.length; i++) {
			if(searchName.equals(std[i].getName())) {
				std[i].printInfo();
				std[i].printCompany();;
				std[i].printCourse();;
			}
		}

		System.out.println("-----------------------------------");
		
		//인천 지점의 학생들을 모두 검색하여 학생정보만 출력
		String branchh = "인천";
		System.out.println(branchh+"지점 학생 정보 >");
		for(int i=0; i<std.length; i++) {
			if(std[i].getBranch() != null) {
				if(branchh.equals(std[i].getBranch())) {
					std[i].printInfo();	
				}
			}
		}
		
		System.out.println("-----------------------------------");

		//java과목을 수강하는 학생들만 검색해서 학생정보/학원정보 출력
		String coursee = "java";
		System.out.println(coursee+"수강 학생 정보 >");
		int cnt = 0; //학생의 번지
		while(cnt<std.length) {
			for(int i=0; i<std[cnt].getCourse().length; i++) { //수강 과목에 대한 번지
				if(std[cnt].getCourse()[i] != null) {
					if(coursee.equals(std[cnt].getCourse()[i])) {
						std[cnt].printCompany();
						std[cnt].printInfo();
						std[cnt].printCourse();
					}
				}
			}
			cnt++;
		}
		
		
		
	}

}

class student{
	//멤버변수 선언
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY = "EZEN"; //final static 순서는 상관없음 private 뒤에만 나오면 됨
	private String branch;
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; //수강기간
	private int cnt; //배열의 index 처리용 번지

	//생성자
	public student() {
		
	}
	
	public student(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	public student(String name, String birth, String phone, int age, String branch) {
		this(name,phone,branch); //생성자 호출은 반드시 첫번째 라인에서만 가능
		this.birth = birth;
		this.age = age;
	}
	
	//method
	public void printInfo() { //학생 기본정보 출력
		System.out.println("--학생정보--");
		System.out.println("이름:"+name+"("+age+"세 "+birth+") / "+phone);
	}
	
	public void printCompany() { //학원 정보 출력
		System.out.println("--학원정보--");
		System.out.println("학원명:"+COMPANY+" / "+branch+"지점");
	}
	//수강 정보 출력
	public void printCourse() {
		//cnt까지만 출력 -> 추가되지 않은 값은 출력되면 안됨
		if(course.length == 0 || cnt== 0) { //등록한 과목이 없다는 의미
			System.out.println("수강과목이 없습니다.");
			return; //여기서 메서드 종료 -> 데이터가 있는 것만 출력
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("과정:"+course[i]+"기간:"+period[i]);
		}
	}
	
	//수강 정보 추가 등록
	//insertCourse()
	//매개변수 course, period 주고 배열에 추가(배열을 완성 / 리턴되는 값은 없음)
	public void insertCourse(String course, String period) {
		//cnt = 0 -> 아직 추가값이 없음
		if(cnt>=5) {
			//배열을 늘려 더 많은 수강을 받을 수 있음 (배열복사)
			System.out.println("더 이상 수강하실 수 없습니다.");
			return;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return COMPANY;
	}
	
	
	
	
}