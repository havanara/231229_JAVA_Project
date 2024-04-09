package day17;

public class PasswordException extends IllegalAccessException{

	private static final long serialVersionUID = 1L;
	
	/* 사용자 정의 Exception 생성할 때 조건
	 * IllegalAccessException 사용자 정의 Exception 정의 시 상속
	 * */
	
	public PasswordException(String message) {
		super(message);
	}

}
