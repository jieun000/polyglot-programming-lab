package b_Set;

import java.util.Arrays;
import java.util.TreeSet;

public class B_TreeSet_1 {
// set: ����� ���� ����X, �ߺ� ����X
	public static void main(String[] args) {

		// TreeSet: �����Ͱ� ���ĵ� ���·� ����Ǵ� ���� �˻� Ʈ��(binary search tree)�� ���·� ��Ҹ� ����.
		// 			���� �˻� Ʈ���� �����͸� �߰��ϰų� �����ϴ� ���� �⺻ ���� �ð��� �ſ� ����.
		TreeSet ts = new TreeSet(Arrays.asList(4, 5, 10, 2, 7));
		System.out.println(ts);	//[2, 4, 5, 7, 10]
		
	}

}
