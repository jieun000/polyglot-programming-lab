package a_List;

import java.util.ArrayList;

public class A_list_1 {

	public static void main(String[] args) {
		// ArrayList(): 내부적으로 배열을 이용하여 요소를 저장함, 크기 변경 불가
		ArrayList list = new ArrayList();
		
		// list추가
		list.add("고길동");
		list.add("공둘리");
		list.add("도우너");
		
		System.out.println(list);
					// 길이: 배열은 length, 리스트는 size
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); // list배열의 '요소' 꺼내기
		}
		
		list.add(0, "고희동");
		list.add(2, "타또치");
		
		System.out.println(list);
		
	}

}
// 컬렉션 프레임워크(collection framework): 
// 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미.
// 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것.
// 자바의 인터페이스(interface)를 사용하여 구현됨.