package day09;

import java.util.Scanner;

public class 과제 {
    public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 -> 배열로 랜덤 저장(중복 불가)
		 * (각 자리수는 1~9까지의 수)
		 * user가 3자리의 숫자를 맞추는 게임 -> 직접 입력(중복 불가)
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 맞지 않으면 out
		 * ex) 컴퓨터 생성 번호 : 1 2 3
		 *     사용자 생성 번호 : 1 7 8 -> 1strike
		 *     사용자 생성 번호 : 1 3 2 -> 1strike 2ball
		 *     사용자 생성 번호 : 7 8 9 -> out
		 *     사용자 생성 번호 : 1 2 3 -> 3strike 정답
		 * */
    	
        Scanner scan = new Scanner(System.in);
        
		System.out.println("야구 게임");
		System.out.println("1~9까지의 수(3개)와 자리를 맞추세요.");
		System.out.println("game start");      
        
		int user[] = new int[3];
		int com[] = new int[3];
		
        for(int i=0; i<3; i++) {
            while (true) {
                int random = (int)(Math.random()*9)+1;
                if(!checkArray(com,random)) {
                    com[i] = random;
                    break;
                }
            }
        }

        while (true) {

    		System.out.println("---사용자 생성 번호---");
            for(int i=0; i<3; i++) {
                user[i] = scan.nextInt();
            }

            int strike = 0;
            int ball = 0;
            
            for(int i = 0; i < 3; i++) {
                if(user[i] == com[i]) {
                	strike++;
                }else if (checkArray(com,user[i])) {
                    ball++;
                }
            }

            if(strike == 0 && ball == 0) {
                System.out.println("out");
            }else{
                System.out.println("-> "+strike+"strike -> "+ball+"ball");
                if(strike == 3) {
                    System.out.println("-> "+com[0]+" "+com[1]+" "+com[2]);
                    System.out.println("-> 3strike 정답");
                    break;
                }
            }
        }
        scan.close();
    }
  
    public static boolean checkArray(int array[], int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
