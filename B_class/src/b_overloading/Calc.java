package b_overloading;

public class Calc {
	// �����ε�: �ż������ ������ �Ű�����(�Ķ���� ��)�̳� ��ȯŸ���� �ٸ�
	public int add(int num1, int num2) {
		System.out.println("�������� �հ�: ");
		showInfo(); // �� �Լ� �־����.
		return num1 +  num2;
	}
	public void showInfo() {
		System.out.println("�����ε� ������");
	}
	
	public double add(double num1, double num2) {
		System.out.println("�Ǽ����� �հ�: ");
		return num1 + num2;
	}
	
	public String add(String num1, String num2) {
		System.out.println("���ڿ����� �հ�: ");
		 return num1 + num2;
	}
	
}
