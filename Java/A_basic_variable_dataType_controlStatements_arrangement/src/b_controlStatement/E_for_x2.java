package b_controlStatement;

import java.util.Scanner;

public class E_for_x2 {

	public static void main(String[] args) {
		
// ���� for��
/*		int i, j;
		
		for(j=1; j<=3; j++) {
			for(i=1; i<=5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}										*/

		
// ������ ��� 2�ܺ��� 9�ܱ��� 
//		int i, j;
//		
//		for(i=2; i<=9; i++) {
//			for(j=1; j<=9; j++) {
//				System.out.print(i + " * " + j + " = " + i*j + " ");
//			}
//			System.out.println();
//		}										
				
// �ܸ��� �Ʒ��� �޿�~
//		int i, j;
//		
//		for(i=1; i<=9; i++) {
//			for(j=2; j<=9; j++) {
//				System.out.printf("%1d*%d=%2d ", j, i,  j * i);
//				// System.out.print(j + "*" + i + "=" + i*j + " ");
//			}
//			System.out.println();
//		}										
		
		
// �Է¹��� ������ŭ *�� ����Ͻÿ�
//		Scanner sc = new Scanner(System.in);
//		int n, i, j;
//		System.out.print("���� �Է�: ");
//		n = sc.nextInt();
//		
//		for(i=1; i<=n; i++) {
//			for(j=1; j<=n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}										
		
		
//// �� ���� ���̱�
//		Scanner sc = new Scanner(System.in);
//		int n, i, j;
//		System.out.print("���� �Է�: ");
//		n = sc.nextInt();
//		for(i=1; i<=n; i++) {
//			for(j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
				
//// �� ���� ���̱�	
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++) {
			for(j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=n+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
	}

}
