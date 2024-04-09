package day07;

public class StrignEx01 {

	public static void main(String[] args) {
		/* file에 저장 되어있는 문자를 파일명과 확장자로 분리하여 출력
		 * 파일명 : 이것이자바다
		 * 확장자 : java
		 * */
		
		String file = "이것이자바다.java";
		System.out.println("파일명 : "+file.substring(0,file.indexOf(".")));
		System.out.println("확장자 : "+file.substring(file.indexOf(".")+1));

	}

}
