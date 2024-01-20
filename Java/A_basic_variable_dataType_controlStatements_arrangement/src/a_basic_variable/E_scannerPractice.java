package a_basic_variable;

import java.util.Scanner;

public class E_scannerPractice {

	public static void main(String[] args) {

		String a;
		char b;
		int c;
		double d;
		
		Scanner sc = new Scanner(System.in);
		
/*		System.out.print("이름을 입력하세요: ");
		a = sc.nextLine();
		System.out.println("이름: " + a);
		
		System.out.print("성별을 입력하세요: ");
		b = sc.next().charAt(0);
		System.out.println("성별: " + b);
		
		System.out.print("나이를 입력하세요: ");
		c = sc.nextInt();
		System.out.println("나이: " + c);
		
		System.out.print("전화번호를 입력하세요: 010.");
		d = sc.nextDouble();
		System.out.println("전화번호: 010." + d);		*/
		
	
/*		String name; int age; char gender; String tel;
		
		System.out.print("이름을 입력: ");
		name = sc.nextLine();
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		System.out.print("성별 입력: ");
		gender = sc.next().charAt(0);
		System.out.print("전화번호 입력: ");
		tel = sc.next();
		
		System.out.println("===회원 정보===");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println("전화번호: " + tel);		*/
		
		
		// 문자열 경우의 차이
		int num1, num2;
		System.out.print("숫자 두 개를 입력: "); 
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("숫자: " + num1 + ", " + num2);
		
		String n1, n2;
		System.out.print("문자 두 개를 입력: ");
		n1 = sc.nextLine(); //next 아닌 nextLine 인쇄
		n2 = sc.nextLine();
		System.out.println("문자: " + n1 + ", " + n2);
		// " "내용부터 인쇄 후 스캔문 출력됨을 확인
		
	}

}
