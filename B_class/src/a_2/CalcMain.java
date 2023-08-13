package a_2;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
// 01
		Calc calc = new Calc();
		
		System.out.println(calc.add(5, 3));
		System.out.println(calc.mius(10, 3));
		System.out.println(calc.mul(5, 10));
		System.out.println(calc.div(10, 3));
	
		
// 02
		Scanner sc = new Scanner(System.in);
		int select, num1, num2;
		while(true) {
			calc.go();
			select = sc.nextInt();
			switch(select) {
				case 1:
					System.out.println("계산할 숫자 두 개를 입력하세요.");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					System.out.println("결과: " + calc.add(num1, num2));
					break;
				case 2:
					System.out.println("계산할 숫자 두 개를 입력하세요.");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					System.out.println("결과: " + calc.mius(num1, num2));
					break;
				case 3:
					System.out.println("계산할 숫자 두 개를 입력하세요.");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					System.out.println("결과: " + calc.mul(num1, num2));
					break;
				case 4:
					System.out.println("계산할 숫자 두 개를 입력하세요.");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					System.out.println("결과: " + calc.div(num1, num2));
					break;
				default:
					System.out.println("프로그램을 종료합니다.");
			} // switch문 끝
			if(select >= 5) break;
		} // while문 끝
	}

}
