package c_arrangement;

public class A_arrangement {

	public static void main(String[] args) {

		// �迭 ����(�ʱ�ȭ)
		int[] num =  new int[5];
		
		num[0] = 10; // ������ 0, 0�� index
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);	
	
		System.out.println("=====�ݺ������� �� �ֱ�=====");
		
		int i, a = 10;
		for(i=0; i<=4; i++) {
			num[i] = a;
			a += 1; // ���� 10���� ���ڰ� 4�� �ö󰡴� a�� �迭�� �־��ְ�
		}
		for(i=0; i<=4; i++) {
			System.out.println(num[i]); // �迭�� �ϳ��� ���
		}
		
	}

}
