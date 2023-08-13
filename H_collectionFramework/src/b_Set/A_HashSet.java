package b_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A_HashSet {
// set: 요소의 저장 순서X, 중복 저장X
	public static void main(String[] args) {
		
		// HashSet: 해시 알고리즘(hash algorithm)을 사용하여 검색 속도가 매우 빠름.
		HashSet<String> set = new HashSet<>();
		
		set.add("Hello");
		set.add("Java");
		set.add("World");
		System.out.println("1: " + set);  // 순서X
		
		// [ Java, CSS, Hello, JS, HTML, World ]
		// set.addAll(Arrays.asList("HTML", "CSS", "JS"));	
		set.addAll(Arrays.asList("HTML", "Java", "JS")); //중복 안 됨, 하나만 두고 지워버림
		System.out.println("2: " + set);
		
		System.out.println(set.remove("Java")); // 성공적으로 지워지면 true반환
		System.out.println("3: " + set);

		
		// 응용
		Scanner sc = new Scanner(System.in);
		System.out.println("뭘 지울거얌?" + set);
		String a = sc.next();
		
		if(set.remove(a))		
			System.out.println("지움");
		else
			System.out.println("없음");
		
		System.out.println(set);
	}

}
