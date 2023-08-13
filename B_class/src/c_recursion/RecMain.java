package c_recursion;

import java.util.Scanner;

public class RecMain {

	public static void main(String[] args) {
		Rec rec = new Rec();
		
		int result;
		result = rec.rescursive_func(5);
		System.out.println("결과: " + result);
		
		
//		Scanner sc = new Scanner(System.in);
//		int result, num;
//		System.out.print("정수 입력: ");
//		num = sc.nextInt();
//		result = rec.fact(num);
//		System.out.print("결과: " + result);
	}

}
