package b_interface;

import java.util.Scanner;

public class InGame_main {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("è�Ǿ��� �����ϼ��� [1.���� | 2.Ƽ��]: ");
		a = sc.nextInt();
		
		if(a==1) {
			Champion user = new Grane();
			Champion.hello("����");
//			user.hello("����") ����: static�� �������̽� ��ü�θ� �����, ��üȭ �Ұ���
			user.sound();
			user.skilQ();
			user.skilE();
		} else {
			Champion user = new Grane();
			Champion.hello("Ƽ��");
			user.skilW();
			user.skilE();
		}
	}

}
