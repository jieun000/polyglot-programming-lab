package b_controlStatement;

import java.util.Scanner;

public class C_if_Practice1_deliveryFee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 12000�� �Դϴ�.");
		
		final int PRICE = 12000; // final[��� (�����������)]
		int a; // �ֹ�����
		int b; // �ֹ��ݾ�
		
		System.out.print("�ֹ� ������ �Է�: ");
		a = sc.nextInt();
		
		b = a * PRICE;
		
		if(b <= 15000) {
			System.out.println("��޺�: 3000��");
		} else if(b <= 30000) {
			System.out.println("��޺�: 1500��");
		} else {
			System.out.println("��޺�: ����");
		}
		
	}

}
