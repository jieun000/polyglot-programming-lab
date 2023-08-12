package c_arrangement;

import java.util.Arrays;

public class B_arrangementPrint {

	public static void main(String[] args) {

		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		int i;
		System.out.println(week.length); // ==> 7 나옴
		
// 그냥 for문
		for(i=0; i<week.length; i++) {
			System.out.print(week[i]);
		}
		System.out.println(); // 줄 바꿈용
	 

// 향상된 for문
		for(String w : week) {
			System.out.print(w);
		}
		System.out.println(); // 줄 바꿈용
		
// Arrays (import)
		System.out.println(Arrays.toString(week)); //print여도 결과 같음
		// [월, 화, 수, 목, 금, 토, 일]
		
	}

}
