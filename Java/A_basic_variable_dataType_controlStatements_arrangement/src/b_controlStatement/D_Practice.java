package b_controlStatement;

public class D_Practice {

	public static void main(String[] args) {

// �Ҽ����� ���ϱ�
/*		
		int n, i, cnt = 0;
		
		System.out.print("������ �Է�: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			if(n % i == 0) {	// �Ҽ��� 0���� �������� ���� 2�� ����
				cnt++;		}
		}
		if(cnt == 2) {
			System.out.println("�Է¹��� " + n + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println("�Է¹��� " + n + "�� �Ҽ��� �ƴմϴ�.");
		}														*/
		
		
// 1~100, 3�� ����̸鼭(&&) 2�� ����� �ƴ�(!=) ���, ����, �հ�
		int i, sum = 0, cnt = 0;
		
		for(i=1; i<=100; i++) {
			if(i%3 == 0 && i%2 != 0) {
				cnt++;
				sum = sum + i;  // sum += 1;
				System.out.print(i + " ");
			}
		}
		System.out.println(); // �� �ٲ��� ���� ����
		System.out.println("����: " + cnt);
		System.out.println("�հ�: " + sum);
		
	}

}
