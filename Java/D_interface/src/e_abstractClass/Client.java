package e_abstractClass;

public class Client {

	public static void main(String[] args) {
		Robot takwonV = new TaekwonV("�±Ǻ���");
		Robot atom = new Atom("����");
		
		System.out.println("�� �̸��� "+takwonV.getName());
		takwonV.attack();
		takwonV.move();
		
		System.out.println("�� �̸��� "+atom.getName());
		atom.attack();
		atom.move();
	}

}
// ������? �±Ǻ��� ����� �پ�ٴϴ� �ɷ� �ٲٷ��� �±Ǻ���Ŭ������ ���� ���θ� ���ľ���
// �׷��� ��Ʈ������ ������ �Ϸ��� �������̽���(����� �ܺο��� ���� �־�����)

