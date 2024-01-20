package b_interface;

import java.util.Scanner;

public class InGame_main {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("챔피언을 선택하세요 [1.가렌 | 2.티모]: ");
		a = sc.nextInt();
		
		if(a==1) {
			Champion user = new Grane();
			Champion.hello("가렌");
//			user.hello("가렌") 에러: static는 인터페이스 자체로만 사용함, 객체화 불가능
			user.sound();
			user.skilQ();
			user.skilE();
		} else {
			Champion user = new Grane();
			Champion.hello("티모");
			user.skilW();
			user.skilE();
		}
	}

}
