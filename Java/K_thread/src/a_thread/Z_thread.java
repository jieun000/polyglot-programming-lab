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
					System.out.println("!���� �߻�!");
				} 
				System.out.println("������ ����.");
				
			}
			
		});
		
		t1.start();
		
		try {
			Thread.sleep(5000); // 5�� �� ���� ����
		} catch(Exception e) {
			System.out.println("���� ���� ����");
		}
		t1.interrupt(); // ������ ���� ���� �߻�
		System.out.println("���� ����");//���ܹ߻����� ���� //������ ������ ��µǰ� ����������
	}

}
