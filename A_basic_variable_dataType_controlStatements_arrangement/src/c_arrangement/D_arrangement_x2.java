package c_arrangement;

public class D_arrangement_x2 {

	public static void main(String[] args) {
// 2���� �迭
		// �迭 ���� and �ʱⰪ ����
		int[] arr1 = {1, 2, 3, 4, 5};
		// 2���� �迭
		int[][] arr2 = {
				{1, 2, 3, 4, 5},
				{7, 8, 9, 10, 11},
				{3, 4, 5, 6, 7}
		};

		// 2���� �迭 ����
		int[][] arr = new int[5][5];	// [��][��] // arr[0][0] = 1;
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
