package c_arrangement;

import java.util.Arrays;

public class B_arrangementPrint {

	public static void main(String[] args) {

		String[] week = {"��", "ȭ", "��", "��", "��", "��", "��"};
		int i;
		System.out.println(week.length); // ==> 7 ����
		
// �׳� for��
		for(i=0; i<week.length; i++) {
			System.out.print(week[i]);
		}
		System.out.println(); // �� �ٲ޿�
	 

// ���� for��
		for(String w : week) {
			System.out.print(w);
		}
		System.out.println(); // �� �ٲ޿�
		
// Arrays (import)
		System.out.println(Arrays.toString(week)); //print���� ��� ����
		// [��, ȭ, ��, ��, ��, ��, ��]
		
	}

}
