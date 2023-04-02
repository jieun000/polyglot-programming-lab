package b_controlStatement;

import java.util.Scanner;

public class B_if_Practice1_deliveryFee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("개당 12000원 입니다.");
		
		final int PRICE = 12000; // final[상수 (변수변경없음)]
		int a; // 주문수량
		int b; // 주문금액
		
		System.out.print("주문 수량을 입력: ");
		a = sc.nextInt();
		
		b = a * PRICE;
		
		if(b <= 15000) {
			System.out.println("배달비: 3000원");
		} else if(b <= 30000) {
			System.out.println("배달비: 1500원");
		} else {
			System.out.println("배달비: 무료");
		}
		
	}

}
