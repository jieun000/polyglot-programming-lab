package b_Set;

import java.util.Arrays;
import java.util.HashSet;

public class C_retainRemove {

	public static void main(String[] args) {
		
		HashSet s1 = new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6));
		HashSet s2 = new HashSet(Arrays.asList(4, 5, 6, 7, 8, 9));
		
//		s1.retainAll(s2);
//		System.out.println("������(retainAll): " + s1);	//[4, 5, 6]
		
//		s1.addAll(s2);
//		System.out.println("������(addAll): " + s1);	//[1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		s1.removeAll(s2);
		System.out.println("��� ����� ()�� (removeAll): " + s2);	//[4, 5, 6, 7, 8, 9]

	}

}
