package b_controlStatement;

import java.util.Scanner;

public class B_for_3_if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
/*		int n1, n2, i, sum = 0;
		
		System.out.print("���� �� �� �Է�: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 < n2) {
			for(i=n1; i<=n2; i++) {
				sum = sum + i;
			}
			System.out.println(n1 + "���� " + n2 + "������ ��: " + sum);
		} else {
			for(i=n2; i<=n1; i++) {
				sum = sum + i;
			}
			System.out.println(n2 + "���� " + n1 + "������ ��: " + sum);
		}															*/	
		
		
		// temp �̿� + ������ ����
/*		int n1, n2, i, sum = 0;
		int cnt = 0, temp;
		
		System.out.print("���� �� �� ���: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2) { // n2�� ū ���ڸ� ��������
			temp = n1;
			n1 = n2;
			n2 = temp;
		} 
		for(i=n1; i<=n2; i++) {
			sum = sum +i;
			cnt++; // ���� ���ϱ�
		}
		System.out.print(n1 + "���� " + n2 + "������ ���� " + sum);
		System.out.println(", ������ " + cnt + "�Դϴ�.");
																	*/			

		// ũ�� ��
		int num1, num2, num3;
		
		System.out.print("3�� ���� �Է�: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
			if(num1 > num2 && num1 > num3) {
				System.out.println("���� ū ��: " + num1);
			} else if(num2 > num1 && num2 > num3) {
				System.out.println("���� ū ��: " + num2);
			} else {
				System.out.println("���� ū ��: " + num3);
			}
		
	}

}
