package c_arrangement;

public class C_arr_2_random {

	public static void main(String[] args) {

// 난수 출력 (랜덤 숫자)	>0 <1
//		System.out.println( Math.random() );
// 난수 출력 (랜덤 숫자)	1~10까지	>0	<10
//		System.out.println( Math.random() * 10 );
// 난수 출력 (랜덤 숫자)	10까지 정수로
//		System.out.println((int)( Math.random() * 10 ) + 1 );
		
		
// 로또 번호 생성기. 6칸(1~6) 만들어 난수 집어넣기.
//		int[] arr = new int[6];
//		int i;
//		
//		for(i=0; i<6; i++) {
//			arr[i] = ((int)( Math.random() * 6 ) + 1);
//		}
//		for(i=0; i<6; i++) { // 배열 생성용 반복문
//			System.out.print(arr[i] + " ");
//		}
//		for(int j : arr) System.out.print(j + " ");
		
		
// 로또 번호 생성기_ 숫자 45까지
//		int[] arr = new int[6];
//		int i;
//		for(i=0; i<6; i++) {
//			arr[i] = ((int)( Math.random() * 45 ) + 1);
//		}
//		for(int j : arr) System.out.print(j + " ");
		
		
// 로또 번호 생성기_ 숫자 45까지 _Book
//		int[]lotto = new int[6];
//		int idx = 0;
//		
//		while(true) {
//			int number = (int)( Math.random() * 45 + 1);
//			boolean insert = true; // 스위치용 변수
//			
//			for(int i=0; i<idx; i++) {
//				if(lotto[i] == number) {
//					insert = false;
//					break;
//				}
//			}
//			if(insert == true) {
//				lotto[idx] = number;
//				idx++;
//			}
//			if(idx == 6) {	// ※주의 if에 세미콜론(;) 안 씀
//				break;
//			}
//		}
//		for(int i=0; i<6; i++) {
//			System.out.print(lotto[i] + " ");
//		}
		
		
// 로또 번호 생성기_ 숫자 45까지 _ T.ver
		int[] lotto = new int[6];
		int i,j;
		
		for(i=0; i<6; i++) {
			lotto[i] = (int)( Math.random() * 45 + 1);
			
			for(j=i-1; 0<=j ; j--) {
				if(lotto[i] == lotto[j]) {
					i--; // i를 다시 1 줄여서 랜덤 넣기
					break;
				}
			}
		}
		for(i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
	
	}

}
