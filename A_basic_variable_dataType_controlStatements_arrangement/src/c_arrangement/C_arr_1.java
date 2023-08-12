package c_arrangement;

import java.util.Scanner;

public class C_arr_1 {

	public static void main(String[] args) {
// 최대 최소
// 5칸짜리 배열 생성, 숫자 5개 입력받아 최대값&&최소값 출력 [1~100까지만 입력]		
//		int[] n = new int[5];
//		int i, min = 101, max = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력: ");
//		for(i=0; i<5; i++) {	// i=1;(최소값 0뜸), i<=5일 때 안 됨
//			n[i] = sc.nextInt();
//		}
//		
//		for(i=0; i<5; i++) {
//			if(max < n[i]) {
//				max = n[i];						
//			}
//			if(min > n[i]) {
//				min = n[i];
//			}
//		}
//		System.out.println("최소값: " + min);
//		System.out.println("최대값: " + max);
		
		
// 크기순 정렬 [5, 3, 10, 1, 8]
		int[] arr = {5, 3, 10, 1, 8};
		int i, j, temp;	// temp(임시 저장 변수)
		
		for(i=1; i<=4; i++) { // 0번은 어차피 안 쓰기에 1부터 시작
			for(j=0; i<=i; j++) {		// j <= i-1
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
