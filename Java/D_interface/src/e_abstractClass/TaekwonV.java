package e_abstractClass;

public class TaekwonV extends Robot {

	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("미사일 공격");
	}

	@Override
	public void move() {
		System.out.println("걸어서 이동");
	}

}
