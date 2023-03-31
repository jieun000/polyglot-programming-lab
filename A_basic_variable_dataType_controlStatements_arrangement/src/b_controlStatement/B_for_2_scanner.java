package b_controlStatement;

import java.util.Scanner;

public class B_for_2_scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1, n2, i, sum = 0;
		
		System.out.print("정수 두 개 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		for(i=n1; i<=n2; i++) {
			sum = sum + i;
		}
		System.out.println(n1 + "부터 " + n2 + "까지의 합: " + sum);
		
	}

}
