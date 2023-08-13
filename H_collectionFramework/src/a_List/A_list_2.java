package a_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class A_list_2 {

	public static void main(String[] args) {
		
// Arrays.asList(arr) 배열을 리스트로 바꿈
		String[] arr = {"고길동", "공둘리", "도우너"};
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));		
		System.out.println(list1);
		
		
// Arrays.asList( , , ) 요소를 리스트로 바꿈
//		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("가","나","당"));  	
//		System.out.println(list2);
		
// String.join("/",list2) 구분 넣을 것,List 
//		System.out.println( String.join("/",list2) );	
		
		
// 정렬
// 순정렬할리스트.sort(Comparator.naturalOrder())
// 역정렬할리스트.sort(Comparator.reverseOrder()) 역정렬
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList("가","다","나"));

		list3.sort(Comparator.naturalOrder());
		System.out.println(list3);

		list3.sort(Comparator.reverseOrder());
		System.out.println(list3);
		
	}

}
