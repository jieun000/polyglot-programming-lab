package a_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class B_lists_1 {

	public static void main(String[] args) {
		// ArrayList(): 내부적으로 배열을 이용하여 요소를 저장함, 크기 변경 불가
		ArrayList listA = new ArrayList();
		// LinkedList(): 저장된 요소가 비순차적으로 분포되며,
		// 					이러한 요소들 사이를 링크(link)로 연결하여 구성
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
		System.out.println("run타임: " + (end-start));
		
		System.out.println("=== LinkedList ===");
		start = System.currentTimeMillis();
		for(int i=0; i<listA.size(); i++)
			listL.get(i);
		end = System.currentTimeMillis();
		System.out.println("run타임: " + (end-start));

	}

}
