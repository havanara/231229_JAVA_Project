package day02;

public class MathClass {

	public static void main(String[] args) {
		/* Math.method
		 * Math.round(반올림) : 소수자리수는 무조건 0
		 * Math.ceil(올림) / Math.floor(버림)
		 * */
		
		double num = 3.14111;
		//반올림 하면 3, 올림하면 4, 버리면 3
		
		int roundNum = (int)Math.round(num); //return long
		System.out.println(roundNum);
		int ceilNum=(int)Math.ceil(num); //return double
		System.out.println(ceilNum);
		int floorNum = (int)Math.floor(num);
		System.out.println(floorNum);
		
		//Math.max(최대값), Math.min(최소값)
		System.out.println(Math.max(5,3));
		System.out.println(Math.min(5,3));
		System.out.println("------------------");
		
		//Math.random : 0과 1사이의 아무값을 출력(실행할때마다 값이 바뀜)
		//0.0<=Math.random()<1.0
		//System.out.println((int)(Math.random()*count(어떤숫자까지?))+start(어떤숫자부터?));
		//start부터 count까지의 랜덤수를 얻는 공식
		System.out.println(Math.random()); //0은 포함, 1은 미포함
		
		
		
	}

}
