package a_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class B_lists_2 {

	public static void main(String[] args) {
		ArrayList listA = new ArrayList();
		LinkedList listL = new LinkedList();
		for(int i=0; i<10000; i++) {
			listA.add(i);
			listL.add(i);
		}
		
System.out.println("=== ArrayList ===");
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			listA.add(500, i); // ?
		long end = System.currentTimeMillis();
		System.out.println("run타임: " + (end - start));
		
System.out.println("=== LinkedList ===");
		start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			listL.add(500, i);
		end = System.currentTimeMillis();
		System.out.println("run타임: " + (end - start));
		
	}

}
