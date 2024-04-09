package stdManager;

import java.util.Scanner;

public class StudentManager implements Program{

	//학생의 배열을 멤버변수로 추가
	private Student[] studentList = new Student[5];
	
	//index 처리 변수
	private int stdCnt;
	
	@Override
	public void printStudent() {
		System.out.println("----------전체 학생 정보----------");
		for(int i=0; i<stdCnt; i++) {
			studentList[i].stdPrint(); //학생 정보 출력
		}
	}

	@Override
	public void insertStudent(Scanner scan) { //1명의 학생 정보를 입력 받아 객체를 생성한 후 studentList에 추가
		System.out.println("학번 > ");
		String stdNum = scan.next();
		System.out.println("학생명 > ");
		String stdName = scan.next();
		System.out.println("연락처 > ");
		String stdPhone = scan.next();
		
		//입력받은 값을 객체로 생성(Student)
		Student s = new Student(stdNum, stdName, stdPhone);
		
		//배열이 다 찼을 경우 배열복사
		if(stdCnt==studentList.length) {
			Student[] tmp = new Student[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdCnt);
			studentList = tmp;
		}
		studentList[stdCnt] = s;
		stdCnt++;
		
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		//검색할 학생 이름을 입력받아 배열에서 탐색 후
		//있을 시 학생정보 + 수강정보 출력
		System.out.println("검색할 학생명 > ");
		String searchName = scan.next();
		
		//배열 탐색
		for(int i=0; i<stdCnt; i++) {
			if(searchName.equals(studentList[i].getStdName())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
		
	}

	@Override
	public void registerSubject(Scanner scan) { //누가 무슨 과목을 추가할지 설정
		//수강 신청할 학생 이름을 입력받아 학생의 위치 탐색 후 그 학생 배열에 수강 과목[]을 추가
		//수강 과목의 객체를 생성하여 Student클래스의 insertSubject 호출(해당 배열에 추가)
		System.out.println("학생명 > ");
		String stdName = scan.next();
		int index = -1; //학생의 번지를 저장하기 위한 변수
		
		//학생 위치 탐색
		for(int i=0; i<stdCnt; i++) {
			if(stdName.equals(studentList[i].getStdName())) {
				index = i;
				break;
			}
		}
		//학생이 없다면
		if(index==-1) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		//학생 배열에 수강 과목[]을 추가 -> 수강 과목의 객체를 생성
		System.out.println("수강신청 과목 > ");
		String name = scan.next();
		Subject s = new Subject(name);
		
		//Student클래스(수강신청을 한 학생)의 insertSubject 호출(해당 배열에 추가)
		studentList[index].insertSubject(s);
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("학생명 > ");
		String sName = scan.next();
		int index = -1; //학생의 번지를 저장하기 위한 변수
		
		//학생 위치 탐색
		for(int i=0; i<stdCnt; i++) {
			if(sName.equals(studentList[i].getStdName())) {
				index = i;
				break;
			}
		}
		//학생이 없다면
		if(index==-1) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		//학생 배열에 수강 과목[]을 추가 -> 수강 과목의 객체를 생성
		System.out.println("수강삭제 과목 > ");
		String name = scan.next();
		
		//해당 학생의 수강삭제 메서드 호출
		studentList[index].deleteSubject(name);
	}


	
	
}