package c_recursion;
// ����Լ�(recursion): ���� �ܰ迡�� �ڽ��� �������ϴ� �Լ�
// �޼��� �ȿ��� �ڱ� �ڽŸ޼��带 ȣ��
public class Rec {
// 1���� X���� �հ踦 ���ϴ� �޼���
	public int rescursive_func(int num) {
		int i, sum = 0;
		for(i=0; i<=num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	
// ���丮�� ���_������ �Է¹޾� �Է¹��� ������ ���丮�� ���� ���
	public int fact(int num) {
		if(num != 1) System.out.print(num + " * ");
		if(num == 1) {
			System.out.print(num + " = ");
			return 1;
		}
		return num * fact(num-1);
	}
}
