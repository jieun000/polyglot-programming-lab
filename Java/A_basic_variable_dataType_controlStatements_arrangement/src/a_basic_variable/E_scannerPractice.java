package a_basic_variable;

import java.util.Scanner;

public class E_scannerPractice {

	public static void main(String[] args) {

		String a;
		char b;
		int c;
		double d;
		
		Scanner sc = new Scanner(System.in);
		
/*		System.out.print("�̸��� �Է��ϼ���: ");
		a = sc.nextLine();
		System.out.println("�̸�: " + a);
		
		System.out.print("������ �Է��ϼ���: ");
		b = sc.next().charAt(0);
		System.out.println("����: " + b);
		
		System.out.print("���̸� �Է��ϼ���: ");
		c = sc.nextInt();
		System.out.println("����: " + c);
		
		System.out.print("��ȭ��ȣ�� �Է��ϼ���: 010.");
		d = sc.nextDouble();
		System.out.println("��ȭ��ȣ: 010." + d);		*/
		
	
/*		String name; int age; char gender; String tel;
		
		System.out.print("�̸��� �Է�: ");
		name = sc.nextLine();
		System.out.print("���� �Է�: ");
		age = sc.nextInt();
		System.out.print("���� �Է�: ");
		gender = sc.next().charAt(0);
		System.out.print("��ȭ��ȣ �Է�: ");
		tel = sc.next();
		
		System.out.println("===ȸ�� ����===");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + gender);
		System.out.println("��ȭ��ȣ: " + tel);		*/
		
		
		// ���ڿ� ����� ����
		int num1, num2;
		System.out.print("���� �� ���� �Է�: "); 
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("����: " + num1 + ", " + num2);
		
		String n1, n2;
		System.out.print("���� �� ���� �Է�: ");
		n1 = sc.nextLine(); //next �ƴ� nextLine �μ�
		n2 = sc.nextLine();
		System.out.println("����: " + n1 + ", " + n2);
		// " "������� �μ� �� ��ĵ�� ��µ��� Ȯ��
		
	}

}
