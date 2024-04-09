package studentManager;

import java.util.Arrays;

//학생 정보를 저장하는 class
	public class Student {
		
		//멤버변수
		private String num ;        //학번
		private String name;     //이름
		private int age;         //나이
		private String subject;         //수강과목
		private Subject[] sub = new Subject[5]; //수강과목 저장 배열
		private String phone;       //연락처
		private String address;  //주소
		private int cnt = 0;
		
		//기본생성자
		public Student() {}
		
		//생성자
		public Student(String num, String name, int age, String phone, String address) {
			this.num = num;
			this.name = name;
			this.age = age;
			this.phone = phone;
			this.address = address;
		}
		
		

		
		
		//학생정보 출력 메서드
		public void printStudent() {
			Student s = new Student();
			System.out.println(s.toString());
		}
		
		//수강과목 추가 메서드
		public void subAdd(Subject subject) {
			if(cnt==sub.length) {
				Subject[] temp = new Subject[sub.length];
				for(int i=0; i<sub.length; i++) {
				temp[i] = sub[i];
			}
				sub = temp;
			}
			sub[cnt] = subject;
			cnt++;
		}
		
		//수강과목 삭제 메서드

		
		//수강과목 출력 메서드
		public void printSub() {
			System.out.println(name+ "학생이 수강하는 과목");
			for(int i=0; i<cnt; i++) {
				System.out.println(sub[i].toString());
			}
		}
		
		//getter/setter
		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
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

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		public Subject[] getSub() {
			return sub;
		}

		public void setSub(Subject[] sub) {
			this.sub = sub;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		//toString()
				@Override
				public String toString() {
					return "[학생정보] 학번 : " + num + " | 이름 : " +name + " | 나이 : " + age + "세"+
							 "| 연락처 : " + phone + " | 주소 : " + address;
				}

		
}
