package e_abstractClass;

public class Atom extends Robot {

	public Atom(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("������ ��ġ ����");
	}

	@Override
	public void move() {
		System.out.println("���Ƽ� �̵�");
	}

}
