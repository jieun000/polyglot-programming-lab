package b_controlStatement;

import java.util.Scanner;

public class C_if_Practice2_average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A; // ����
		int B; // ����
		int C; // ����
		double avg; // ���

		System.out.print("���� ������ �Է��Ͻÿ�: ");
			A = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�: ");
			B = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�: ");
			C = sc.nextInt();		
			
		avg = (A + B + C) / 3.0;	
		// �� ��ȯ: avg = (double)(A + B + C) / 3.0;
		
		if(avg >= 70) {
			if(A<60 || B<60 || C<60) {
				System.out.println("����");
			} else {
				System.out.println("�հ�");
			}
		} else {
			System.out.println("���հ�");
		}
		
	}
	
}
