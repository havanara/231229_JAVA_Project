package studentManager;

import java.util.Scanner;

public class StudentManager {

	private Student[] st = new Student[10]; //학생 배열
	private int cnt = 0;
	
	
	public void printStudent() {
		System.out.println(cnt);
		for(int i=0; i<cnt; i++) {
			System.out.println(st[i].toString());
		}
	}
	
	
	public void insertStudent(Scanner scan) {
		System.out.printf("등록할 학생 정보를 입력하세요."+"%n학번 : ");
		String num = scan.next();
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("나이 : ");
		int age = scan.nextInt();
		System.out.println("연락처 : ");
		String phone = scan.next();
		System.out.println("주소 : ");
		String address = scan.next();
		st[cnt] = new Student(num,name,age,phone,address);
		cnt++;
		if(cnt==st.length) {
			Student[] temp = new Student[st.length*2];
			for(int i=0; i<st.length; i++) {
				temp[i] = st[i];
			}
			st = temp;
		}
	}

	public void searchStudent(Scanner scan) {
		System.out.printf("검색할 학생 정보를 입력하세요."+"%n이름 : ");
		String name = scan.next();
		for(int i=0; i<cnt; i++) {
			if(st[i].getName().equals(name)) {
				System.out.println(st[i].toString());
				//st[i].printStudent();
				return;
			}
		}
		System.out.println("해당 학생을 찾을 수 없습니다.");
	}
	
	public void registerSubject(Scanner scan) {
		System.out.printf("수강신청할 학생 정보를 입력하세요."+"%n이름 : ");
		String name = scan.next();
		System.out.printf("%n학번 : ");
		String num = scan.next();
		System.out.printf("%n신청 과목명 : ");
		String subName = scan.next();
		Subject sub = new Subject(subName);
		for(int i=0; i<cnt; i++) {
			if(st[i].getName().equals(name)) {
				st[i].subAdd(sub);
				System.out.println(subName+"과목 수강신청이 되었습니다.");
				return;
			}
		}
		System.out.println("해당 학생을 찾을 수 없습니다.");
	}
	
	
	
}