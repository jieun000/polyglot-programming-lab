package b_controlStatement;

import java.util.Scanner;

public class C_if_Practice3_alarm {

	public static void main(String[] args) {
		
		int h, m;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==45�� ���� �˶� �����ϱ�==");
		
		System.out.print("�˶� ���� �ð� �Է�: ");
		h = sc.nextInt();
		System.out.print("�˶� ���� �� �Է�: ");
		m = sc.nextInt();
		
		m = m - 45;
		
		if(m < 0) {
			m = 60 + m;
			h--; 		// h = h - 1;
			
			if(h < 0) {
				h = 24 + h;
			}
		}
		System.out.print("�˶� �ð��� " + h +"��" + m + "�� �Դϴ�.");
		
	}

}
