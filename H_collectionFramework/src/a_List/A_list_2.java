package a_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class A_list_2 {

	public static void main(String[] args) {
		
// Arrays.asList(arr) �迭�� ����Ʈ�� �ٲ�
		String[] arr = {"��浿", "���Ѹ�", "�����"};
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));		
		System.out.println(list1);
		
		
// Arrays.asList( , , ) ��Ҹ� ����Ʈ�� �ٲ�
//		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("��","��","��"));  	
//		System.out.println(list2);
		
// String.join("/",list2) ���� ���� ��,List 
//		System.out.println( String.join("/",list2) );	
		
		
// ����
// �������Ҹ���Ʈ.sort(Comparator.naturalOrder())
// �������Ҹ���Ʈ.sort(Comparator.reverseOrder()) ������
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList("��","��","��"));

		list3.sort(Comparator.naturalOrder());
		System.out.println(list3);

		list3.sort(Comparator.reverseOrder());
		System.out.println(list3);
		
	}

}
