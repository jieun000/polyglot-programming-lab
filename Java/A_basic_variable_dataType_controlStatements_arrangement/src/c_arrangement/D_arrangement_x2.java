package c_arrangement;

public class D_arrangement_x2 {

	public static void main(String[] args) {
// 2차원 배열
		// 배열 선언 and 초기값 지정
		int[] arr1 = {1, 2, 3, 4, 5};
		// 2차원 배열
		int[][] arr2 = {
				{1, 2, 3, 4, 5},
				{7, 8, 9, 10, 11},
				{3, 4, 5, 6, 7}
		};

		// 2차원 배열 선언
		int[][] arr = new int[5][5];	// [행][열] // arr[0][0] = 1;
		int i, j, num = 1;
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
