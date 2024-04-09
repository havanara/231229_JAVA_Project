package stdManager;
/* StudentMain class : 객체를 생성하고 화면에 출력하는 클래스
 * menu : 1. 학생등록 | 2. 학생리스트출력 | 3. 학생검색(학생정보,수강정보) 4. 수강신청 5. 수강철회 6. 종료
 * Student[] 멤버변수에 포함
 * 객체를 생성하는 것은 항상 미리 해놓고 메서드 호출
 * */

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StudentManager sm = new StudentManager(); //manager를 호출하기 위한 객체
		int menu = 0;
		do {
			//메뉴넣기
			System.out.println();
			System.out.println(" > > > > > [ menu ] > > > > > ");
			System.out.println();
			System.out.println("      ※ menu를 선택하세요.");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃ 1.학생등록 2.학생출력 3.학생검색 ┃");
			System.out.println("┃ 4.수강신청 5.수강철회 6.종료    ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 분기 구현
			switch(menu) {
			case 1 : sm.insertStudent(scan); break;
			case 2 : sm.printStudent(); break;
			case 3 : sm.searchStudent(scan); break;
			case 4 : sm.registerSubject(scan); break;
			case 5 : sm.deleteSubject(scan); break;
			case 6 : break;
			default : System.out.println("잘못된 메뉴입니다."); 
			}
		}while(menu!=6);
		System.out.println("종료합니다.");
		
		
		scan.close();
	

	}
}
