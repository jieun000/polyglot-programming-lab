package a_3;

import java.util.Scanner;

public class IsOddMain {

	public static void main(String[] args) {
// Ŭ�����̸� ��ü�̸� = new ��ü�̸�();
		
// 01
		IsOdd io = new IsOdd();
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("���ڸ� �Է��ϼ���: ");
		num = sc.nextInt();
		io.isOdd1(num);
		
// 02
		System.out.print("���ڸ� �Է��ϼ���: ");
		num = sc.nextInt();
		if(io.isOdd2(num)) System.out.print("Ȧ����.");
		else System.out.print("¦����.");
		
	}

}
