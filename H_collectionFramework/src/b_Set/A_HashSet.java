package b_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A_HashSet {
// set: ����� ���� ����X, �ߺ� ����X
	public static void main(String[] args) {
		
		// HashSet: �ؽ� �˰���(hash algorithm)�� ����Ͽ� �˻� �ӵ��� �ſ� ����.
		HashSet<String> set = new HashSet<>();
		
		set.add("Hello");
		set.add("Java");
		set.add("World");
		System.out.println("1: " + set);  // ����X
		
		// [ Java, CSS, Hello, JS, HTML, World ]
		// set.addAll(Arrays.asList("HTML", "CSS", "JS"));	
		set.addAll(Arrays.asList("HTML", "Java", "JS")); //�ߺ� �� ��, �ϳ��� �ΰ� ��������
		System.out.println("2: " + set);
		
		System.out.println(set.remove("Java")); // ���������� �������� true��ȯ
		System.out.println("3: " + set);

		
		// ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ����ž�?" + set);
		String a = sc.next();
		
		if(set.remove(a))		
			System.out.println("����");
		else
			System.out.println("����");
		
		System.out.println(set);
	}

}
