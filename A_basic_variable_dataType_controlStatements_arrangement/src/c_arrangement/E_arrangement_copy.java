package c_arrangement;

import java.util.Arrays;

public class E_arrangement_copy {

	public static void main(String[] args) {
// �迭 ���� 1��°
//		int[] arr1 = {1, 2, 3};
//		int[] arr2 = new int[5];
//		for(int i=0; i<3; i++) {	// ����
//			arr2[i] = arr1[i];
//		}
//		 for(int i : arr2) System.out.print(i + " ");

		
			
// �迭 ���� 2��°	System.arraycopy(�����ҹ迭, �����������, ���Ϲ迭, ������ġ, �迭1���������)
//		int[] arr1 = {1, 2, 3};
//		int[] arr2 = new int[5];
//					// �����Ұ�, �����������, ���ϰ�, ������ġ, arr1���������
//		System.arraycopy(arr1, 0, arr2, 2, 3);
//		
//		 for(int i : arr2) System.out.print(i + " ");
		 
		 
// �迭 ���� 3��°	Arrays.copyOf(�����ҹ迭, ��ĭ¥�� �������);
		int[] arr1 = {1, 2, 3};
		int[] arr2 = null;
						// �����Ұ�, ��ĭ¥�� �������
		arr2 = Arrays.copyOf(arr1, 5); // ����: Ctrl + Space	
		
		for(int i : arr2) System.out.print(i + " ");
	
	}

}
