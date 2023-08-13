package c_Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A_Iterator_2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i=1; i<=5; i++) {
			list.add(i);
			set.add(i+5);			
		}
		System.out.println("List: " + list);
		System.out.println("Set: " + set);
		
		Iterator it = null;
		System.out.println("=== Iterator(list) ===");
		it = list.iterator(); // list: [1, 2, 3, 4, 5]
		System.out.println(it); // java.util.ArrayList$Itr@2d363fb3
		iteratorPrint(it);
		System.out.println("\n=== Iterator(set) ===");
		it = set.iterator(); // set: [6, 7, 8, 9, 10]
		System.out.println(it); // java.util.HashMap$KeyIterator@7d6f77cc
		iteratorPrint(it);
	}

	private static void iteratorPrint(Iterator it) {
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
		   
	}

}
