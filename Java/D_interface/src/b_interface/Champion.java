package b_interface;

public interface Champion {
	// �߻�޼���
	void skilQ();
	void skilW();
	void skilE();
	void skilR();
	
	default void sound() { System.out.println("�⺻ è�Ǿ� ����"); }
	
	static void hello(String name) { 
		System.out.println(name + "�� ��ȯ���� ��� ���� ���� ȯ���մϴ�."); 
		}
}
