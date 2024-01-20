package b_controlStatement;

import java.util.Scanner;

public class A_switchPractice {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);

		// 배수 찾기
		int n;
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		switch(n % 5) {
		case 0:
			System.out.println("입력받은 " + n + "은 5의 배수입니다.");
			break;
		default:
			System.out.println("입력받은 " + n + "은 5의 배수가 아닙니다.");
		}
		
		
		// 스위치_ 성별입력
		System.out.print("성별 입력: ");
		char gender;
		gender = sc.next().charAt(0);
		
		switch(gender) {
		case 'm':
		case 'M':
			System.out.println("남자입니다.");
			break;
		case 'f':
		case 'F':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		// 스위치_계산기
		int n1, n2; char c; int result;
		
		System.out.print("정수 두 개 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.print("연산방법 입력: ");
		c = sc.next().charAt(0);
		
		switch(c) {
		case '+': 
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case '-': 
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case '*': 
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case '/': 
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		case '%': 
			System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
			break;
		default: 
				System.out.println("연산 방법을 잘못 입력하셨습니다.");
		}
		
	}

}
