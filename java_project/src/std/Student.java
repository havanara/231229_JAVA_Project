package std;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

//1
public class Student {
	
	//멤버변수 : 이름, 나이, 전화번호, map(과목,점수), 합계, 평균
	//멤버변수 private -> 데이터를 직접 접근하지 못하게 설정
	//멤버변수 public
	//클래스명은 대문자로 시작, 변수명, 메서드명은 소문자로 시작
	//변수명, 메서드명에 단어가 많아지면 다음 시작단어 대문자(카멜케이스 기법)
	//indent : 들여쓰기 잘 맞추기
	private String name;
	private int age;
	private String phone;	
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private int sum;
	private double avg;
	
	//생성자
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	//메서드 - 출력메서드(학생 정보, 과목 점수(성적표), 합계, 평균)
	//출력메서드(toString)
	@Override
	public String toString() {
		return "[학생정보] 이름 : " + name + " | 나이 : " + age + "세 | 연락처 : " + phone;
	}
	
	public void printSubject() {
		this.sum = 0;
		this.avg = 0;
		
		System.out.println("["+name+" 성적표]");
		for(String str : map.keySet()) {
			sum += map.get(str);
			avg = sum/(double)map.size();
			System.out.print(str +":"+map.get(str)+"점 / ");
		}
		if(sum==0 || avg==0) {
			System.out.println("점수가 없습니다.");
			System.out.print("--------------------------");
			return;
		}
		System.out.print("합계:"+sum+"점 / 평균:"+avg+"점");
		System.out.print("--------------------------");
	}
	
	//메서드 - map(과목,점수) 데이터를 추가 메서드
	public void addMap(String word, int num) {
		map.put(word, num);
	}
	
	//메서드 - map(과목,점수) 데이터를 삭제 메서드
	public void removeMap(String word) {
		if(map.remove(word) == null) {
			System.out.println("해당과목이 없습니다.");
			return;
		}map.remove(word);
	}
		
	//getter/setter
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, avg, map, name, phone, sum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // == 주소가 내 객체의 주소와 같다면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //클래스 정보가 다르다면 false
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name); //이름만 같다면 true
	}		
	
	

}