package studentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		StudentManager main = new StudentManager();
		
		int a;
		do {
		System.out.println("      ※ menu를 선택하세요.");
		System.out.println("  > > > > > menu > > > > > ");
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃ 1.학생등록 2.학생출력 3.학생검색 ┃");
		System.out.println("┃ 4.수강신청 5.수강철회 6.종료    ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		
		a = scan.nextInt();
		int cnt = 0;
		
		switch(a) {
		case 1 : System.out.println("--------학생등록--------");
		main.insertStudent(scan);
		break;
		
		case 2 : System.out.println("--------학생출력--------");
		main.printStudent();
		break;
		
		case 3 : System.out.println("--------학생검색--------");
		main.searchStudent(scan);
		break;
		
		case 4 : System.out.println("--------수강신청--------");
		main.registerSubject(scan);
		break;
		
		case 5 : System.out.println("--------수강철회--------");

		break;
		
		case 6 : System.out.println("종료합니다.");
		break;
		
		default : System.out.println("잘못된 입력값입니다.");
		break;
		}
		
		
		}while(a !=6);
		
		scan.close();
		}
	

	

	

	

}
