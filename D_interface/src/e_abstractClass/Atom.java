package e_abstractClass;

public class Atom extends Robot {

	public Atom(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("강력한 펀치 공격");
	}

	@Override
	public void move() {
		System.out.println("날아서 이동");
	}

}
