package e_restrictor;

public class AnimalMain {

	public static void main(String[] args) {

		Animal cat = new Animal();

// private - ���� ���� ����
//		System.out.println(cat.name);
//		cat.name = "�ֱ��";

// public -  ���� ����
		System.out.println(cat.age); // �⺻ �������� �� ������
		System.out.println(cat.getName());

		cat.setName("��ȹ�"); // setter
		System.out.println(cat.getName()); // getter

	}

}
