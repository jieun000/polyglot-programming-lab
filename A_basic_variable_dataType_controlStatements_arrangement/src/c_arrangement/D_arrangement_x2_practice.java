package c_arrangement;

public class D_arrangement_x2_practice {

	public static void main(String[] args) {
// ���� �Ʒ���
//		int[][] arr = new int[5][5];
//		int i, j, num = 1;
//		
//		for(i=0; i<5; i++) {
//			for(j=0; j<5; j++) {
//				arr[j][i] = num;
//				num++;
//			}
//		}
//		for(i=0; i<5; i++) {
//			for(j=0; j<5; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
// �Ʒ��� ���� �迭 �ø���
//		int[][] arr = new int[5][5];
//		int i, j, num = 1;
//		
//		for(i=0; i<5; i++) {
//			for(j=0; j<5; j++) {
//				arr[i][j] = num;
//				num++;
//			}
//		}
//		for(i=0; i<5; i++) {
//			for(j=0; j<=i; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	
		
// ������! ����
		int[][] arr = new int[5][5];
		int i, j; // �ݺ��� ����
		int num = 1; // �迭 �ȿ� ���� ����
		int x = 0, y = -1; // �迭�� ����
		int a = 5; // �� ���� �� �ʿ��� �ݺ� Ƚ��
		int s = 1; // ����ġ�� ����
		
		for(i=0; i<5; i++) {
			for(j=0; j<a; j++) {
				y = y + s;
				arr[x][y] = num;
				num++;
			}					// ù �� �ϼ�
			a--;
			
			for(j=0; j<a; j++) {
				x = x + s;
				arr[x][y] = num;
				num++;
			}
			s = s * -1;
		}
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
