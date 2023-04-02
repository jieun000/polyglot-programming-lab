package b_controlStatement;

import java.util.Scanner;

public class B_for_3_if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
/*		int n1, n2, i, sum = 0;
		
		System.out.print("정수 두 개 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 < n2) {
			for(i=n1; i<=n2; i++) {
				sum = sum + i;
			}
			System.out.println(n1 + "부터 " + n2 + "까지의 합: " + sum);
		} else {
			for(i=n2; i<=n1; i++) {
				sum = sum + i;
			}
			System.out.println(n2 + "부터 " + n1 + "까지의 합: " + sum);
		}															*/	
		
		
		// temp 이용 + 개수도 세기
/*		int n1, n2, i, sum = 0;
		int cnt = 0, temp;
		
		System.out.print("정수 두 개 출력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2) { // n2에 큰 숫자를 보내려함
			temp = n1;
			n1 = n2;
			n2 = temp;
		} 
		for(i=n1; i<=n2; i++) {
			sum = sum +i;
			cnt++; // 개수 구하기
		}
		System.out.print(n1 + "부터 " + n2 + "까지의 합은 " + sum);
		System.out.println(", 개수는 " + cnt + "입니다.");
																	*/			

		// 크기 비교
		int num1, num2, num3;
		
		System.out.print("3개 정수 입력: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
			if(num1 > num2 && num1 > num3) {
				System.out.println("가장 큰 수: " + num1);
			} else if(num2 > num1 && num2 > num3) {
				System.out.println("가장 큰 수: " + num2);
			} else {
				System.out.println("가장 큰 수: " + num3);
			}
		
	}

}
