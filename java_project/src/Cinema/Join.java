package Cinema;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1.회원가입(이름,생년월일,아이디,패스워드,선호장르선택)
		 * 2.로그인
		 * 3.예매
		 * 날짜선택(현재로부터 7일까지만 가능), 영화선택, 지역선택
		 * 성인,미성년자 선택(성인,미성년자 영화티켓값 다르게 지정)
		 * 매수 선택
		 * 좌석 선택(예매한 좌석은 선택못하게)
		 * 팝콘 추가? pass?
		 * 4. 메뉴
		 * 현재상영 리스트(제목,장르,등장인물,간단줄거리)
		 * 개봉예정 리스트
		 * 예매내역 조회
		 * 예매수정
		 * 예매취소
		 * 영화추천(회원가입 장르 토대로 랜덤)
		 * */
		CinemaManager m = new CinemaManager();
		int menu = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\r\n"
				+ " .--------------. || .--------------. || .--------------. || .--------------. |\r\n"
				+ " |  _________   | || |   ________   | || |  _________   | || | ____  _____  | |\r\n"
				+ " | |_   ___  |  | || |  |  __   _|  | || | |_   ___  |  | || ||_   \\|_   _| | |\r\n"
				+ " |   | |_  \\_|  | || |  |_/  / /    | || |   | |_  \\_|  | || |  |   \\ | |   | |\r\n"
				+ " |   |  _|  _   | || |     .'.' _   | || |   |  _|  _   | || |  | |\\ \\| |   | |\r\n"
				+ " |  _| |___/ |  | || |   _/ /__/ |  | || |  _| |___/ |  | || | _| |_\\   |_  | |\r\n"
				+ " | |_________|  | || |  |________|  | || | |_________|  | || ||_____|\\____| | |\r\n"
				+ " |              | || |              | || |              | || |              | |\r\n"
				+ " '--------------' || '--------------' || '--------------' || '--------------' |\r\n"
				+ "\r\n"
				+ " .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\r\n"
				+ " |     ______   | || |     _____    | || | ____  _____  | || |  _________   | || | ____    ____ | || |      __      | |\r\n"
				+ " |   .' ___  |  | || |    |_   _|   | || ||_   \\|_   _| | || | |_   ___  |  | || ||_   \\  /   _|| || |     /  \\     | |\r\n"
				+ " |  / .'   \\_|  | || |      | |     | || |  |   \\ | |   | || |   | |_  \\_|  | || |  |   \\/   |  | || |    / /\\ \\    | |\r\n"
				+ " |  | |         | || |      | |     | || |  | |\\ \\| |   | || |   |  _|  _   | || |  | |\\  /| |  | || |   / ____ \\   | |\r\n"
				+ " |  \\ `.___.'\\  | || |     _| |_    | || | _| |_\\   |_  | || |  _| |___/ |  | || | _| |_\\/_| |_ | || | _/ /    \\ \\_ | |\r\n"
				+ " |   `._____.'  | || |    |_____|   | || ||_____|\\____| | || | |_________|  | || ||_____||_____|| || ||____|  |____|| |\r\n"
				+ " |              | || |              | || |              | || |              | || |              | || |              | |\r\n"
				+ " '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\r\n");
		
		do {
			System.out.println("1.예매하기 2.예매조회 3.예매수정 4.예매취소 5.현재상영작 6.개봉예정작 7.영화추천 8.종료");
			System.out.println("메뉴 선택 > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : m.ticketAdd(scan); break;
			case 2 : m.ticketList(); break;
			case 3 : m.ticketMod(scan); break;
			case 4 : m.ticketDel(scan); break;
			case 5 : m.nowMovie(); break;
			case 6 : m.soonMovie(); break;
			case 7 : m.recomMovie(); break;
			case 8 : break;
			default : System.out.println("없는 메뉴입니다."); break;
			}
			
		}while(menu!=8);
		System.out.println("종료합니다.");
		
		scan.close();
		
	}
	


}
