package b_Set;

import java.util.Arrays;
import java.util.TreeSet;

public class B_TreeSet_1 {
// set: 요소의 저장 순서X, 중복 저장X
	public static void main(String[] args) {

		// TreeSet: 데이터가 정렬된 상태로 저장되는 이진 검색 트리(binary search tree)의 형태로 요소를 저장.
		// 			이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠름.
		TreeSet ts = new TreeSet(Arrays.asList(4, 5, 10, 2, 7));
		System.out.println(ts);	//[2, 4, 5, 7, 10]
		
	}

}
