package a_2;
/* ���������� ����Ÿ�� �޼����̸�(�Ű�����,�Ű�����) {
 * 		�۾��� �ڵ�
 * 		����Ÿ���� void�� ������ �ٸ� ��
 * 		return ��ȯ��ų ��;
 *  }
 * 	����Ÿ��: void, int, double, char, String
 */
public class Calc {
// 01
	// �������� �ǵ�����
	public int add(int num1, int num2) {
		System.out.print("���ϱ� ����� ó���մϴ�. ");
		return num1 + num2;
	}
	
	public int mius(int num1, int num2) {
		System.out.print("���� ����� ó���մϴ�. ");
		return num1 + num2;
	}
	
	public int mul(int num1, int num2) {
		System.out.print("���ϱ� ����� ó���մϴ�. ");
		return num1 + num2;
	}
	
	public int div(int num1, int num2) {
		System.out.print("������ ����� ó���մϴ�. ");
		return num1 + num2;
	}
	
	
// 02
	String add;
	String mius;
	String mul;
	String div;
	public void go() {
		System.out.print("����� ó���� ��� ���� [1.���ϱ� | 2.���� | 3.���ϱ� | 4.������ | �� �ܴ� ���� ]");
	}
	
}
