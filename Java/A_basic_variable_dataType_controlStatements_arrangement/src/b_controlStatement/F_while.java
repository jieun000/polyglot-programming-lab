package b_controlStatement;

import java.util.Scanner;

public class F_while {

	public static void main(String[] args) {
		
// while 조건식
//		int sum = 0, i = 1;
//		while(i <= 100) {
//			sum = sum + i;
//			i++; // 위치 중요
//		}
//		System.out.println(sum);
		
		
// 구구단 출력 2단부터 5단까지		
//		int i = 2, j;
//		
//		while(i <= 5) {
//			j = 1;
//			while(j <= 9) {
//				System.out.println(i + "*" + j + "=" + i*j);
//				j++; // 위치 중요
//			}
//			i++;
//		}	
		
		
// 하나의 정수를 입력받아 1부터 N까지의 홀수의 종합과 개수
//		Scanner sc = new Scanner(System.in);
//		int n, i=1, c=0, s=0;
//		System.out.print("정수 입력: ");
//		n = sc.nextInt();
//		while(i<=n) {
//			if(i % 2 == 1) { // 2로 나눠서 1이 남으면 홀수
//				c++;
//				s = s + i;
//			}
//			i++;
//		}
//		System.out.println("1부터 n까지의 홀수의 종합: " + s);
//		System.out.println("1부터 n까지의 홀수의 개수: " + c);
			
		
// N명의 성적을 입력받아 합계와 평균
//		Scanner sc = new Scanner(System.in);
//		int n, i=1, s=0, score;
//		double avg;
//		System.out.print("인원수를 입력하시오: ");
//		n = sc.nextInt();
//		
//		while(i <= n) {
//			System.out.print(i + "번째 학생 성적 입력: ");
//			score = sc.nextInt();
//			i++;
//			s = s + score;
//		}
//		avg = (double)s / n;
//		
//		System.out.println(n + "명 성적의 총 합계: " + s);
//		System.out.println(n + "명 성적의 총 평균: " + avg);

		
// 무한 LOOP
//		Scanner sc = new Scanner(System.in);
//		for(;;) {
//			int a;
//			while(true) {
//				System.out.print("점수 입력: ");
//				a = sc.nextInt();
//			}
//		}
//		Scanner sc = new Scanner(System.in);
//			int a;
//			while(true) {
//				System.out.print("점수 입력: ");
//				a = sc.nextInt();
//			}
				
			
// 조건 상관X 무조건 처음은 실행 do
// 		int i = 7;
//		while(i<=5) {
//			// System.out.println("반복문 내부 코드"); // 오류
//		}
//		do {
//			System.out.println("반복문 내부 코드");
//		} while(i<=5);				
// 1부터 10까지의 합계
//		int i = 1, sum = 0;
//		do {
//			sum += 1;
//			i++;
//		} while(i <= 10);
//		System.out.println("총합: " + sum);
		
		
// 특정 상황 오면 종료. break; 탈출
//		Scanner sc = new Scanner(System.in);
//		int a;
//		while(true) {
//			System.out.print("정수 입력: ");
//			a = sc.nextInt();
//			if(a == 0) 
//				break;
//		}													
		
// 특정 상황 오면 다음으로 넘어가기. continue;
//		int i;
//		for(i=1; i<=10; i++) {
//			if(i % 2 == 1) // 홀수라면 
//				continue;  // 그것들은 안 쓰고 넘어가기
//			System.out.println(i);
//		}
		
		
	}

}
