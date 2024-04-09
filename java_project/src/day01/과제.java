package day01;

public class 과제 {

	public static void main(String[] args) {
		// 카페에 제출
		/* 국어, 영어, 수학의 점수 합계와 평균 출력
		 * 평균은 소수점을 살려서 출력
		 * 조건선택 연산자를 이용하여 평균이 80이상이면 합격, 아니면 불합격 표기
		 */
		
		int kor = 90, eng = 80, math = 81;
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		System.out.println("합계:"+sum+"평균:"+avg);
		System.out.println("결과:"+(avg>=80? "합격":"불합격"));
		
		/*System.out.println(sum);
	    *System.out.println(sum/3.0);
	    System.out.println((80<(sum/3.0))? "합격":"불합격");
	    System.out.println("합계:"+sum+"점");
	    System.out.println("평균:"+(sum/3.0)+"점");
	    System.out.println((80<=sum/3.0)? "합격":"불합격");
	     */
		
		/*조건선택 연산자 -> if문으로 변경
		 * if(조건식) <
		 * 처리문;
		 * }else {
		 * 처리문;
		 * }
		 */
		
		if(avg>=80) {
			System.out.println("결과:합격");
		}else {
			System.out.println("결과:불합격");
		}
		
		
	    

	}

}
