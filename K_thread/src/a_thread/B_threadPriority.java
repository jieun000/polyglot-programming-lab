package a_thread;

public class B_threadPriority {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {	//괄호 주의
			public void run() {
				System.out.println("t 스레드");
				for(int i=0; i<10; i++) {
					System.out.println("t: " + i);
				}
			}
		});
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("r 스레드");
				for(int i=0; i<10; i++) {
				System.out.println("r: " + i );
				}
			}
		};
		Thread t2 = new Thread(r);
		
		//우선순위 설정: 중간세팅 5
		t1.setPriority(1);		
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
	
}
