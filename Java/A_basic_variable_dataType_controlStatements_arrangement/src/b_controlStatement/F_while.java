package b_controlStatement;

import java.util.Scanner;

public class F_while {

	public static void main(String[] args) {
		
// while ���ǽ�
//		int sum = 0, i = 1;
//		while(i <= 100) {
//			sum = sum + i;
//			i++; // ��ġ �߿�
//		}
//		System.out.println(sum);
		
		
// ������ ��� 2�ܺ��� 5�ܱ���		
//		int i = 2, j;
//		
//		while(i <= 5) {
//			j = 1;
//			while(j <= 9) {
//				System.out.println(i + "*" + j + "=" + i*j);
//				j++; // ��ġ �߿�
//			}
//			i++;
//		}	
		
		
// �ϳ��� ������ �Է¹޾� 1���� N������ Ȧ���� ���հ� ����
//		Scanner sc = new Scanner(System.in);
//		int n, i=1, c=0, s=0;
//		System.out.print("���� �Է�: ");
//		n = sc.nextInt();
//		while(i<=n) {
//			if(i % 2 == 1) { // 2�� ������ 1�� ������ Ȧ��
//				c++;
//				s = s + i;
//			}
//			i++;
//		}
//		System.out.println("1���� n������ Ȧ���� ����: " + s);
//		System.out.println("1���� n������ Ȧ���� ����: " + c);
			
		
// N���� ������ �Է¹޾� �հ�� ���
//		Scanner sc = new Scanner(System.in);
//		int n, i=1, s=0, score;
//		double avg;
//		System.out.print("�ο����� �Է��Ͻÿ�: ");
//		n = sc.nextInt();
//		
//		while(i <= n) {
//			System.out.print(i + "��° �л� ���� �Է�: ");
//			score = sc.nextInt();
//			i++;
//			s = s + score;
//		}
//		avg = (double)s / n;
//		
//		System.out.println(n + "�� ������ �� �հ�: " + s);
//		System.out.println(n + "�� ������ �� ���: " + avg);

		
// ���� LOOP
//		Scanner sc = new Scanner(System.in);
//		for(;;) {
//			int a;
//			while(true) {
//				System.out.print("���� �Է�: ");
//				a = sc.nextInt();
//			}
//		}
//		Scanner sc = new Scanner(System.in);
//			int a;
//			while(true) {
//				System.out.print("���� �Է�: ");
//				a = sc.nextInt();
//			}
				
			
// ���� ���X ������ ó���� ���� do
// 		int i = 7;
//		while(i<=5) {
//			// System.out.println("�ݺ��� ���� �ڵ�"); // ����
//		}
//		do {
//			System.out.println("�ݺ��� ���� �ڵ�");
//		} while(i<=5);				
// 1���� 10������ �հ�
//		int i = 1, sum = 0;
//		do {
//			sum += 1;
//			i++;
//		} while(i <= 10);
//		System.out.println("����: " + sum);
		
		
// Ư�� ��Ȳ ���� ����. break; Ż��
//		Scanner sc = new Scanner(System.in);
//		int a;
//		while(true) {
//			System.out.print("���� �Է�: ");
//			a = sc.nextInt();
//			if(a == 0) 
//				break;
//		}													
		
// Ư�� ��Ȳ ���� �������� �Ѿ��. continue;
//		int i;
//		for(i=1; i<=10; i++) {
//			if(i % 2 == 1) // Ȧ����� 
//				continue;  // �װ͵��� �� ���� �Ѿ��
//			System.out.println(i);
//		}
		
		
	}

}
