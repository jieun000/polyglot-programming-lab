package a_basic_variable;

import java.util.Scanner;

public class E_scanner {

	public static void main(String[] args) {

		int a; 		// ���� �����
		double b;
		char c;
		String d;

		Scanner sc = new Scanner(System.in); // ��ĳ�� �غ�
		
		// nextLine() ����
		System.out.print("�̸��� �Է�: "); 
		d = sc.nextLine(); // sc.next(); (���� �빮�� ����)
		System.out.println("�ȳ��ϼ���!" + d + "��");
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.println("�Է��� ���ڴ� " + a);
		
		System.out.print("�Ǽ��� �Է��ϼ���: ");
		b = sc.nextDouble();
		System.out.println("�Է��� �Ǽ��� " + b);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		c = sc.next().charAt(0); // 0�� ù��° (1�� �ƴ�)
		System.out.println("�Է��� ���ڴ� " + c);
		
	}

}
