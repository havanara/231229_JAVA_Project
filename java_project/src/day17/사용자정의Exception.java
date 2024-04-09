package day17;

public class 사용자정의Exception {

	public static void main(String[] args) {
		/* passwordException
		 * 비밀번호는 null일 수 없음
		 * 비밀번호의 길이는 5자 이상
		 * 비밀번호는 문자로만 이루어지면 안됨(문자+숫자+특수문자...)
		 * */
		
		PasswordTest pt = new PasswordTest();
//		String Password = null;
//		String Password = "abc";
//		String Password = "abcdefg";
		String Password = "abcdefg1";
		try {
			pt.setPassword(Password);
			System.out.println(pt.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class PasswordTest{
	private String Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) throws PasswordException {
		//Exception 처리
		if(Password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}else if(Password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이여야 합니다.");
		}else if(Password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
			

		
		
		this.Password = Password;
	}
	
}