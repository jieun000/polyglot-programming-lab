package b_controlStatement;

import java.util.Scanner;

public class A_switchPractice {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);

		// ��� ã��
		int n;
		
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		
		switch(n % 5) {
		case 0:
			System.out.println("�Է¹��� " + n + "�� 5�� ����Դϴ�.");
			break;
		default:
			System.out.println("�Է¹��� " + n + "�� 5�� ����� �ƴմϴ�.");
		}
		
		
		// ����ġ_ �����Է�
		System.out.print("���� �Է�: ");
		char gender;
		gender = sc.next().charAt(0);
		
		switch(gender) {
		case 'm':
		case 'M':
			System.out.println("�����Դϴ�.");
			break;
		case 'f':
		case 'F':
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		// ����ġ_����
		int n1, n2; char c; int result;
		
		System.out.print("���� �� �� �Է�: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("������ �Է�: ");
		c = sc.next().charAt(0);
		
		switch(c) {
		case '+': 
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case '-': 
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case '*': 
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case '/': 
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		case '%': 
			System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
			break;
		default: 
				System.out.println("���� ����� �߸� �Է��ϼ̽��ϴ�.");
		}
		
	}

}
