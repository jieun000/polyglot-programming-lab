package b_controlStatement;

import java.util.Scanner;

public class C_if_Practice3_alarm {

	public static void main(String[] args) {
		
		int h, m;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==45분 일찍 알람 설정하기==");
		
		System.out.print("알람 설정 시간 입력: ");
		h = sc.nextInt();
		System.out.print("알람 설정 분 입력: ");
		m = sc.nextInt();
		
		m = m - 45;
		
		if(m < 0) {
			m = 60 + m;
			h--; 		// h = h - 1;
			
			if(h < 0) {
				h = 24 + h;
			}
		}
		System.out.print("알람 시간은 " + h +"시" + m + "분 입니다.");
		
	}

}
