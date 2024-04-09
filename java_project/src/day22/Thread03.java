package day22;

class Thread03 extends Thread{
	
	int start;
	int end;
	int total;
	
	public Thread03(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			this.total += i;
		}
	}
	
	public static void main(String[] args) {
		
		// 1~50, 51~100까지의 합을 구하는 두개의 Thread를 생성
		// 그 결과를 확인
		
		/* 두개의 Thread가 실행되고 난 후
		 * thread1 1~50까지의 합계 출력
		 * thread2 51~100까지의 합계 출력
		 * thread1+thread2의 합계 출력
		 * */
		
		Thread03 thread1 = new Thread03(1, 50);
		Thread03 thread2 = new Thread03(51, 100);
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			Thread.sleep(500); //0.5초 기다렸다가 실행
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("thread1 합계:"+thread1.total);
		System.out.println("thread2 합계:"+thread2.total);
		
		int lastTotal = thread1.total+thread2.total;
		System.out.println("thread1+thread2:"+lastTotal);
		
	}
		
}
