package Cinema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class User {
	
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
	
	//회원가입 정보 멤버변수
	private String name; //이름
	private int age; //나이
	private String id; //아이디
	private String pw; //패스워드
	private String genre; //선호하는 영화 장르
	
	//영화 티켓 예매 멤버변수
	private String movieName; //영화명
	private String movieDate; //예매일자
	private int year; //예매 월
	private int month; //예매 달
	private int date; //예매 일
	private int ea; //예매 인원
	private int price; //티켓 가격
	private int total; //총 티켓 가격
	private String seat; //좌석

	public User() {}
	public User(String name) throws ParseException {
		this.name = name;
		if(movieDate!=null) {
			SimpleDateFormat md = new SimpleDateFormat("yyyy-MM-dd");
			Date mvd = md.parse(movieDate);
			Calendar c = Calendar.getInstance(); //오늘 날짜 리턴
			this.year = c.get(Calendar.DAY_OF_YEAR);
			this.month = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
			if(year==c.get(Calendar.YEAR) && month==c.get(Calendar.MONTH)
					&& date>c.get(Calendar.DATE)+7) {
				System.out.println("예매는 오늘로부터 7일후까지만 가능합니다.");
			}else if(year!=c.get(Calendar.YEAR) || month!=c.get(Calendar.MONTH))
				System.out.println("예매는 오늘로부터 7일후까지만 가능합니다.");
		}

		this.movieName = movieName;
		if(age>=20) {
			this.price = 15000;
		}this.price = 10000;
		this.total = price*ea;
		this.seat = seat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}

	
	

}
