package a_thread;

public class Z_thread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					int i = 1;
					while(true) {
						System.out.println("t1_thread: " + i);
						Thread.sleep(1000);
						i++; 
					}
				} catch(InterruptedException e) {
					System.out.println("!예외 발생!");
				} 
				System.out.println("스레드 종료.");
				
			}
			
		});
		
		t1.start();
		
		try {
			Thread.sleep(5000); // 5초 뒤 강제 종료
		} catch(Exception e) {
			System.out.println("강제 종료 에러");
		}
		t1.interrupt(); // 강제로 예외 종료 발생
		System.out.println("메인 종료");//예외발생보다 먼저 //위에꺼 없으면 출력되고도 스레드진행
	}

}
