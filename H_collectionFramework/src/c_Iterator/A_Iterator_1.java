package c_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class A_Iterator_1 {

	public static void main(String[] args) {

		   ArrayList list = new ArrayList();
		   list.add(1);
		   list.add(2);
		   list.add(3);
		   
		   // �����ΰ� �ݺ��� �� ����ϴ� ��ü: iterate(�ݺ��ϴ�.)
		   Iterator iter = null;
		   
		   iter = list.iterator();
		   
		   while(iter.hasNext()) {
			   System.out.print(iter.next() + " "); // 1 2 3 
		   }
		   
	}

}
