package a_basic_variable;

public class D_variableCalc {

	public static void main(String[] args) {

		int num1 = 20;
		double num2 = 6; // �Ҽ� ����
		
		System.out.println("�� �� ��: " + (num1 + num2));
		System.out.println("�� �� ��: " + (num1 - num2));
		System.out.println("�� �� ��: " + (num1 * num2));
		System.out.println("�� �� ����: " + (num1 / num2));
		System.out.println("�� �� ���� ������: " + (num1 % num2));
		System.out.println(""); // �� �� ����� ���� ����
		
		// 10 % 3 :  10 ������ 3�� �������� ���
		int a = 10, b = 3;
		System.out.println("�� �� ���� ������: " + (a % b));
		
		// �ڷ��� ��ȯ-> ����� ����ȯ (����-> �Ǽ��� ���� ��ȯ)
		System.out.println("���� ���: " + (a / (double)b));
		System.out.println("�� �� ��: " + (a + b)); // �ٽ� �� ����
		
	}

}
