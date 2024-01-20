package c_arrangement;

import java.util.Arrays;

public class E_arrangement_copy {

	public static void main(String[] args) {
// 배열 복사 1번째
//		int[] arr1 = {1, 2, 3};
//		int[] arr2 = new int[5];
//		for(int i=0; i<3; i++) {	// 복붙
//			arr2[i] = arr1[i];
//		}
//		 for(int i : arr2) System.out.print(i + " ");

		
			
// 배열 복사 2번째	System.arraycopy(복사할배열, 복사범위시작, 붙일배열, 붙일위치, 배열1복사범위끝)
//		int[] arr1 = {1, 2, 3};
//		int[] arr2 = new int[5];
//					// 복사할거, 복사범위시작, 붙일곳, 붙일위치, arr1복사범위끝
//		System.arraycopy(arr1, 0, arr2, 2, 3);
//		
//		 for(int i : arr2) System.out.print(i + " ");
		 
		 
// 배열 복사 3번째	Arrays.copyOf(복사할배열, 몇칸짜리 만들건지);
		int[] arr1 = {1, 2, 3};
		int[] arr2 = null;
						// 복사할거, 몇칸짜리 만들건지
		arr2 = Arrays.copyOf(arr1, 5); // 참고: Ctrl + Space	
		
		for(int i : arr2) System.out.print(i + " ");
	
	}

}
