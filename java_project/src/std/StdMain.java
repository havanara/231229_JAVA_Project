package std;

import java.util.Scanner;

//2
public class StdMain {

	public static void main(String[] args) {
		// 메뉴구성
		/* 1.학생추가 2.학생리스트 3.학생검색
		 * 4.학생수정 5.학생삭제
		 * 6.점수추가 7.점수수정 8.점수삭제 9.종료
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		StdManager s = new StdManager();
		int close = 0;
		do {
			System.out.println("      > >   MENU   > >     ");
			System.out.println(" ① 학생추가  ② 학생리스트  ③ 학생검색  ");
			System.out.println(" ④ 학생수정  ⑤ 학생삭제  ⑥ 점수추가 ");
			System.out.println(" ⑦ 점수수정  ⑧ 점수삭제  ⑨ 종료 ");
			System.out.println("      ▷ MENU를 선택하세요.");
			
			close = scan.nextInt();
			
			switch(close) {
			case 1 : s.addStd(scan); break;
			case 2 : s.printStd(); break;
			case 3 : s.searchStd(scan); break;
			case 4 : s.modStd(scan); break;
			case 5 : s.delStd(scan); break;
			case 6 : s.addSub(scan); break;
			case 7 : s.modSub(scan); break;
			case 8 : s.delSub(scan); break;
			case 9 : break;
			default : System.out.println("잘못 입력된 값입니다."); break;
			}		
		}while(close!=9);
		System.out.println("종료합니다.");
			
		scan.close();
	}

}