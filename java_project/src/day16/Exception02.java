package day16;

import javax.management.RuntimeErrorException;

public class Exception02 {

	public static void main(String[] args) {
		/* ArithmeticException : 0으로 나누었을 때 발생하는 Exception
		 * 하단에서 만든 메서드 실행
		 * 예외처리
		 * */
		
		try {
			re(5, 3, '+');
			re(5, 3, '-');
			re(5, 3, '*');
			re(5, 0, '/');
			re(5, 3, '%');
			re(5, 3, '#');
		}catch(Exception e){
			//예외 처리 작성
			System.out.println(e.getMessage()); //메시지의 String을 출력
		}
		re(5, 3, '+');
		re(5, 3, '-');
	}

	/*예외 발생시키기 throw new를 발생 시킬 수 있음
	 * throw : 예외 떠넘기기
	 * 예외를 발생시키게 되면 메서드 선언부 끝 부분에 throws를 적고
	 * 발생할 수 있는 예외를 반드시 적어줘야함
	 * throws는 RuntimeException만 예외적으로 생략 가능
	 * */
	
	//기능 : 두 수를 입력받고, 연산자를 입력받아 +,-,*,/,% 연산의 결과를 리턴하는 메서드
	//매개변수 : int num1, int num2, char op
	//연산자가 / 이거나 % 인 경우 num2가 0이면 예외 발생
	
	public static void re(int num1, int num2, char op) throws RuntimeException{ //throws RuntimeException 생략가능
		
		if((op=='/' || op=='%') && num2==0) {
			throw new RuntimeException("예외 발생!");
		}
		switch(op) {
		case '+' : System.out.println(num1+"+"+num2+"="+(num1+num2)); break; 
		case '-' : System.out.println(num1+"-"+num2+"="+(num1-num2)); break; 
		case '*' : System.out.println(num1+"*"+num2+"="+(num1*num2)); break;
		case '/' : System.out.println(num1+"/"+num2+"="+(num1/num2)); break;
		case '%' : System.out.println(num1+"%"+num2+"="+(num1%num2)); break; 
		default : throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
	}
	
	
}
