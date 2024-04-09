package std;
import java.util.ArrayList;
import java.util.HashMap;
//3
import java.util.Scanner;

public class StdManager implements StdProgram{

	//학생 리스트 생성 후 StdProgram 메서드 구현
	private ArrayList<Student> StudentList = new ArrayList<>();
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	@Override
	public void printStd() {
		System.out.println("--학생리스트--");
		for(Student st : StudentList) {
			System.out.println(st.toString());
			st.printSubject();
		}
	}

	@Override
	public void addStd(Scanner scan) {
		System.out.println("--학생 추가--");
		System.out.println("추가할 학생 이름 > ");
		String name = scan.next();
		System.out.println("추가할 학생 나이 > ");
		int age = scan.nextInt();
		System.out.println("추가할 학생 연락처 > ");
		String phone = scan.next();
		
		StudentList.add(new Student (name,age,phone));
		System.out.println(name+" 학생 추가완료!");
	}

	@Override
	public void modStd(Scanner scan) {
		System.out.println("--학생 수정--");
		System.out.println("수정할 학생 이름 검색 > ");
		String n = scan.next();
		for(Student s : StudentList) {
		if(s.getName().equals(n)) {
			StudentList.remove(s);
			System.out.println("학생 이름 > ");
			String name = scan.next();
			System.out.println("학생 나이 > ");
			int age = scan.nextInt();
			System.out.println("학생 연락처 > ");
			String phone = scan.next();
			StudentList.add(new Student (name,age,phone));
			System.out.println(name+" 학생 수정완료!");
			return;
			}
		}
		System.out.println("수정할 학생이 없습니다.");
	}

	@Override
	public void delStd(Scanner scan) {
		System.out.println("--학생 삭제--");
		System.out.println("삭제할 학생 이름 > ");
		String name = scan.next();
		boolean result = StudentList.remove(new Student(name));
		if(!result) {
			System.out.println("삭제할  학생이 없습니다.");
			return;
		}
		System.out.println(name+" 학생 삭제완료!");
//		for(Student s : StudentList) {
//		if(s.getName().equals(name)) {
//			StudentList.remove(s);
//			System.out.println(name+" 학생 삭제완료!");
//			return;
//		}
//		}
	}

	@Override
	public void searchStd(Scanner scan) {
		System.out.println("--학생 검색--");
		System.out.println("검색할 학생 이름 > ");
		String name = scan.next();
		for(Student s : StudentList) {
			if(s.getName().equals(name)) {
				System.out.println(s.toString());
				return;
			}
		}
		System.out.println("검색된 학생이 없습니다.");
	}

	@Override
	public void addSub(Scanner scan) {
		System.out.println("--점수 추가--");
		System.out.println("점수 추가할 학생 이름 > ");
		String name = scan.next();
		for(Student s : StudentList) {
			if(s.getName().equals(name)) {
					System.out.println("추가할 과목명 > ");
					String subject = scan.next();
					System.out.println("추가할 점수 > ");
					int num = scan.nextInt();
					s.addMap(subject, num);
					System.out.println("점수 추가 완료");
					return;
			}
		}
		System.out.println("학생이 없습니다.");
	}

	@Override
	public void modSub(Scanner scan) {
		System.out.println("--점수 수정--");
		System.out.println("점수 수정할 학생 이름 > ");
		String name = scan.next();
		for(Student s : StudentList) {
			if(s.getName().equals(name)) {
					System.out.println("수정할 과목명 검색 > ");
					String subject = scan.next();
					s.removeMap(subject);
					System.out.println("수정할 과목명 > ");
					String subject1 = scan.next();
					System.out.println("수정할 점수 > ");
					int num1 = scan.nextInt();
					s.addMap(subject1, num1);
					return;
			}
		}
		System.out.println("수정할 과목이 없습니다.");
	}

	@Override
	public void delSub(Scanner scan) {
		System.out.println("--점수 삭제--");
		System.out.println("점수 삭제할 학생 이름 > ");
		String name = scan.next();
		for(Student s : StudentList) {
			if(s.getName().equals(name)) {
					System.out.println("삭제할 과목명 > ");
					String subject = scan.next();
					s.removeMap(subject);
					System.out.println(subject+" 점수 삭제완료!");
					return;
			}
		}
		System.out.println("삭제할 과목이 없습니다.");
	}
	
}