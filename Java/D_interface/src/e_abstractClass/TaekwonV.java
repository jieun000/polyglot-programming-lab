package e_abstractClass;

public class TaekwonV extends Robot {

	public TaekwonV(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("�̻��� ����");
	}

	@Override
	public void move() {
		System.out.println("�ɾ �̵�");
	}

}
