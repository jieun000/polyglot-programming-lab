package a_basic_variable;

import java.util.Scanner;

public class E_scanner {

	public static void main(String[] args) {

		int a; 		// 변수 선언들
		double b;
		char c;
		String d;

		Scanner sc = new Scanner(System.in); // 스캐너 준비
		
		// nextLine() 먼저
		System.out.print("이름을 입력: "); 
		d = sc.nextLine(); // sc.next(); (라인 대문자 시작)
		System.out.println("안녕하세요!" + d + "님");
		
		System.out.print("숫자를 입력하세요: ");
		a = sc.nextInt();
		System.out.println("입력한 숫자는 " + a);
		
		System.out.print("실수를 입력하세요: ");
		b = sc.nextDouble();
		System.out.println("입력한 실수는 " + b);
		
		System.out.print("문자를 입력하세요: ");
		c = sc.next().charAt(0); // 0이 첫번째 (1이 아님)
		System.out.println("입력한 문자는 " + c);
		
	}

}
