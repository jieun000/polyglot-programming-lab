package b_interface;

public class Teemo implements Champion {

	@Override
	public void skilQ() {
		System.out.println("티모 Q사용");
	}

	@Override
	public void skilW() {
		System.out.println("티모 W사용");
	}

	@Override
	public void skilE() {
		System.out.println("티모 E사용");
	}

	@Override
	public void skilR() {
		System.out.println("티모 R사용");
	}

}
