package c_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Iterator_1 {

	public static void main(String[] args) {

		   ArrayList list = new ArrayList();
		   list.add(1);
		   list.add(2);
		   list.add(3);
		   
		   // 무엇인가 반복할 때 사용하는 객체: iterate(반복하다.)
		   Iterator iter = null;
		   
		   iter = list.iterator();
		   
		   while(iter.hasNext()) {
			   System.out.print(iter.next() + " "); // 1 2 3 
		   }
		   
	}

}
