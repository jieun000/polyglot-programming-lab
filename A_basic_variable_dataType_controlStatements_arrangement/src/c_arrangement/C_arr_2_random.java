package c_arrangement;

public class C_arr_2_random {

	public static void main(String[] args) {

// ���� ��� (���� ����)	>0 <1
//		System.out.println( Math.random() );
// ���� ��� (���� ����)	1~10����	>0	<10
//		System.out.println( Math.random() * 10 );
// ���� ��� (���� ����)	10���� ������
//		System.out.println((int)( Math.random() * 10 ) + 1 );
		
		
// �ζ� ��ȣ ������. 6ĭ(1~6) ����� ���� ����ֱ�.
//		int[] arr = new int[6];
//		int i;
//		
//		for(i=0; i<6; i++) {
//			arr[i] = ((int)( Math.random() * 6 ) + 1);
//		}
//		for(i=0; i<6; i++) { // �迭 ������ �ݺ���
//			System.out.print(arr[i] + " ");
//		}
//		for(int j : arr) System.out.print(j + " ");
		
		
// �ζ� ��ȣ ������_ ���� 45����
//		int[] arr = new int[6];
//		int i;
//		for(i=0; i<6; i++) {
//			arr[i] = ((int)( Math.random() * 45 ) + 1);
//		}
//		for(int j : arr) System.out.print(j + " ");
		
		
// �ζ� ��ȣ ������_ ���� 45���� _Book
//		int[]lotto = new int[6];
//		int idx = 0;
//		
//		while(true) {
//			int number = (int)( Math.random() * 45 + 1);
//			boolean insert = true; // ����ġ�� ����
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
//			if(idx == 6) {	// ������ if�� �����ݷ�(;) �� ��
//				break;
//			}
//		}
//		for(int i=0; i<6; i++) {
//			System.out.print(lotto[i] + " ");
//		}
		
		
// �ζ� ��ȣ ������_ ���� 45���� _ T.ver
		int[] lotto = new int[6];
		int i,j;
		
		for(i=0; i<6; i++) {
			lotto[i] = (int)( Math.random() * 45 + 1);
			
			for(j=i-1; 0<=j ; j--) {
				if(lotto[i] == lotto[j]) {
					i--; // i�� �ٽ� 1 �ٿ��� ���� �ֱ�
					break;
				}
			}
		}
		for(i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
	
	}

}
