package b_controlStatement;

import java.util.Scanner;

public class E_for_x2 {

	public static void main(String[] args) {
		
// 이중 for문
/*		int i, j;
		
		for(j=1; j<=3; j++) {
			for(i=1; i<=5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}										*/

//??		
// 구구단 출력 2단부터 9단까지 
//		int i, j;
//		
//		for(i=2; i<=9; i++) {		// 열이 구구단 앞자리!
//			for(j=1; j<=9; j++) {
//				System.out.print(i + " * " + j + " = " + i*j);
//			}
//			System.out.println();
//		}										
		
		
// 단마다 옆으로 쭈욱~
/*		int i, j;
		
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.print(i + "*" + j + " = " + i*j + " ");
			}
			System.out.println();
		}										*/
		
//??		
// 단마다 아래로 쭈욱~
/*		int i, j;
		
		for(i=1; i<=9; i++) {
			for(j=2; j<=9; j++) {
				System.out.printf("%1d*%d=%2d ", j, i,  j * i);
				System.out.print(j + "*" + i + "=" + i*j + " ");
			}
			System.out.println();
		}										*/
		
		
// 입력받은 정수만큼 *을 출력하시오
		Scanner sc = new Scanner(System.in);
		int n, i, j;
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}										
			
System.out.println("=====");		
// 별 개수 늘이기
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
System.out.println("=====");			
// 별 개수 줄이기		
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
