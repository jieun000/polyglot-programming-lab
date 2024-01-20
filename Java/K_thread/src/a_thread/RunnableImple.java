package a_thread;

public class RunnableImple implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable »ó¼Ó");
		for(int i=0; i<5; i++) { System.out.println("Runnable: " + i); }
	}

}
