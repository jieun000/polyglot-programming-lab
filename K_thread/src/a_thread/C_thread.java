package a_thread;

public class C_thread {

	public static void main(String[] args) {
		
		ThreadExtend t1 = new ThreadExtend();
//		Runnable t2 = new RunnableImple();
//		Thread tt2 = new Thread(t2);
		Thread tt2 = new Thread(new RunnableImple());
		
		t1.start();
		tt2.start();
		
	}
	
}
