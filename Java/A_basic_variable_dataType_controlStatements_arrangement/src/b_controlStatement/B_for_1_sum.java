package b_controlStatement;

public class B_for_1_sum {

	public static void main(String[] args) {

		// 1~100���� ��
		int i, sum = 0;
		
		for(i=1; i<=100; i++) {
			sum = sum + i;
		} 
		System.out.println(sum);	
		
		// �Ҽ����� ��
		for(i=1; i<=100; i++) {
			if(i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
	}

}
