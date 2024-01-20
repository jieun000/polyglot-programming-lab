package a_thread;

public class ThreadExtend extends Thread{
	
	public void run() {
		System.out.println("Thread »ó¼Ó");
		for(int i=0; i<5; i++) { System.out.println("Thread: " + i); }
	}
	
}
