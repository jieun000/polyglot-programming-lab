package a_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class B_lists_1 {

	public static void main(String[] args) {
		// ArrayList(): ���������� �迭�� �̿��Ͽ� ��Ҹ� ������, ũ�� ���� �Ұ�
		ArrayList listA = new ArrayList();
		// LinkedList(): ����� ��Ұ� ����������� �����Ǹ�,
		// 					�̷��� ��ҵ� ���̸� ��ũ(link)�� �����Ͽ� ����
		LinkedList listL = new LinkedList();
		for(int i=0; i<100000; i++) {
			listA.add(i);
			listL.add(i);
		}
		
		System.out.println("=== ArrayList ===");
		long start = System.currentTimeMillis();
		for(int i=0; i<listA.size(); i++)
			listA.get(i);
		long end = System.currentTimeMillis();
		System.out.println("runŸ��: " + (end-start));
		
		System.out.println("=== LinkedList ===");
		start = System.currentTimeMillis();
		for(int i=0; i<listA.size(); i++)
			listL.get(i);
		end = System.currentTimeMillis();
		System.out.println("runŸ��: " + (end-start));

	}

}
