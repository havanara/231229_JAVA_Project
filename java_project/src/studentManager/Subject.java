package studentManager;

//수강과목 정보를 저장하는 class
public class Subject {
	
	//멤버변수
	private String subCode;   //과목코드
	private String subName;   //과목명
	private int subNum;       //학점
	private String teacher;   //교수명
	private int season;       //학기
	private String classroom; //강의장
	private boolean pass;     //pass 여부
	
	//기본생성자
	
	
	//생성자
	public Subject(String subName) {
		this.subName = subName;
		
		
	}
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	//toString()
	@Override
	public String toString() {
		return "[수강과목]"+ subName;
	}
	
	//getter/setter
	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubNum() {
		return subNum;
	}

	public void setSubNum(int subNum) {
		this.subNum = subNum;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		if(pass) {
			this.pass = true;
		}else if(!pass) {
			this.pass = false;
		}
	}
	
	

}
