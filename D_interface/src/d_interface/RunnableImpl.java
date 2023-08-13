package d_interface;
/* Impl = implements 약자 */
public class RunnableImpl implements Runnable {

	@Override
	public int multiply() {
		System.out.println("runnable 추상메서드 오버라이딩");
		return 11;
	}

}
