package a_thread;

public class A_thread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {	//��ȣ ����
			public void run() {
				System.out.println("t ������");
				for(int i=0; i<50; i++) {
					System.out.println("t: " + i);
				}
			}
		});

		Runnable r = new Runnable() {
			public void run() {
				System.out.println("r ������");
				for(int i=0; i<50; i++) {
				System.out.println("r" + i );
				}
			}
		};
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}
	
}
