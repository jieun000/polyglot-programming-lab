package a_3;

import java.util.Scanner;

public class IsOddMain {

	public static void main(String[] args) {
// 클래스이름 객체이름 = new 객체이름();
		
// 01
		IsOdd io = new IsOdd();
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		io.isOdd1(num);
		
// 02
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		if(io.isOdd2(num)) System.out.print("홀수다.");
		else System.out.print("짝수다.");
		
	}

}
