package a_0;

public class Animal_main {

	public static void main(String[] args) {
// cat, dog-> �ִϸ� Ŭ������ ��ü�� [�ִϸ��� �ν��Ͻ���-> cat, dog] ��ü=�ν��Ͻ�
		Animal cat = new Animal();
		Animal dog = new Animal();
		// 1) Ŭ������ ��������� ����
		cat.name = "�ֱ�";
		cat.age = 7;
		dog.name = "����";
		dog.age = 18;
		System.out.println("�̸�: " + cat.name + ", ����: " + cat.age);
		System.out.println("�̸�: " + dog.name + ", ����: " + dog.age);
		
		
		// method class ���ο� ���ǵ� �� �޼ҵ�, �� �ܴ� �Լ�	
		cat.sayHello();
		// setter�� ���� ����
		cat.setName("�ֱ��");
		cat.sayHello();
		
	}

}
