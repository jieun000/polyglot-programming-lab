package b_controlStatement;

public class A_switch {

	public static void main(String[] args) {
		
		// ����
		int w = 1;	// 0(��) ~ 6(��) �� �ϳ� ��
		
		switch(w) {
			case 0: 
				System.out.println("0�� �Ͽ���");
				break; // break ������ �� ��µ�
			case 1: 
				System.out.println("1�� ������");
				break;
			case 2: 
				System.out.println("2�� ȭ����");
				break;
			default: 
				System.out.println("�������� ��~�����");
		}
		
		// ����
		char ch = 'a';// a, A �Է�
		
		switch(ch) {
		case 'a':
			System.out.println("�ҹ��� a");
			break;
		case 'A':
			System.out.println("�빮�� A");
			break;
		}
		
		// ���ڿ�
		String str = "1�г�"; int n = 10;
		
		switch(str) {
		case "1�г�":
			n = n + 1; // ���� �͵�: [n += 1] = [n++]	
			System.out.println("1�г� ������ ����: " + n);
			break;
		case "2�г�":
			n = n + 2;
			System.out.println("2�г� ������ ����: " + n);
			break;
		case "3�г�":
			n = n + 3;
			System.out.println("3�г� ������ ����: " + n);
			break;
		}
		
	}

}
