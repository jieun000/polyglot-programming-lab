package c_arrangement;

import java.util.Scanner;

public class C_arr_1 {

	public static void main(String[] args) {
// �ִ� �ּ�
// 5ĭ¥�� �迭 ����, ���� 5�� �Է¹޾� �ִ밪&&�ּҰ� ��� [1~100������ �Է�]		
//		int[] n = new int[5];
//		int i, min = 101, max = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �Է�: ");
//		for(i=0; i<5; i++) {	// i=1;(�ּҰ� 0��), i<=5�� �� �� ��
//			n[i] = sc.nextInt();
//		}
//		
//		for(i=0; i<5; i++) {
//			if(max < n[i]) {
//				max = n[i];						
//			}
//			if(min > n[i]) {
//				min = n[i];
//			}
//		}
//		System.out.println("�ּҰ�: " + min);
//		System.out.println("�ִ밪: " + max);
		
		
// ũ��� ���� [5, 3, 10, 1, 8]
		int[] arr = {5, 3, 10, 1, 8};
		int i, j, temp;	// temp(�ӽ� ���� ����)
		
		for(i=1; i<=4; i++) { // 0���� ������ �� ���⿡ 1���� ����
			for(j=0; i<=i; j++) {		// j <= i-1
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
