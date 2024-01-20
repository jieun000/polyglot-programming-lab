package b_controlStatement;

import java.util.Scanner;

public class C_if_Practice2_average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A; // 국어
		int B; // 영어
		int C; // 수학
		double avg; // 평균

		System.out.print("국어 점수를 입력하시오: ");
			A = sc.nextInt();
		System.out.print("영어 점수를 입력하시오: ");
			B = sc.nextInt();
		System.out.print("수학 점수를 입력하시오: ");
			C = sc.nextInt();		
			
		avg = (A + B + C) / 3.0;	
		// 형 변환: avg = (double)(A + B + C) / 3.0;
		
		if(avg >= 70) {
			if(A<60 || B<60 || C<60) {
				System.out.println("과락");
			} else {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}
		
	}
	
}
