package a_thread;

public class B_threadPriority {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {	//��ȣ ����
			public void run() {
				System.out.println("t ������");
				for(int i=0; i<10; i++) {
					System.out.println("t: " + i);
				}
			}
		});
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("r ������");
				for(int i=0; i<10; i++) {
				System.out.println("r: " + i );
				}
			}
		};
		Thread t2 = new Thread(r);
		
		//�켱���� ����: �߰����� 5
		t1.setPriority(1);		
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
	
}
