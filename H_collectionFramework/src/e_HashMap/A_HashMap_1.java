package e_HashMap;

import java.util.HashMap;

public class A_HashMap_1 {
	// Map 인터페이스는 Collection 인터페이스와는 다른 저장 방식.
	// Map 인터페이스를 구현한 Map 컬렉션 클래스들은 키와 값을 하나의 쌍으로 저장하는 방식(key-value 방식.
	// 여기서 키(key)란 실질적인 값(value)을 찾기 위한 이름의 역할.
	
	// 요소의 저장 순서X
	// 키는 중복을 허용X, 값의 중복O ( 중복된 키X, 하지만 같은 값을 다른 키로 저장하는 것은 가능. )
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		// map.put() map추가
		hm.put(1001,"고길동");	//[키(주소), 값]
		hm.put(1002,"공둘리");
		hm.put(1003,"도우너");
		
		System.out.println(hm);
		
		for(int key : hm.keySet())
			System.out.println(key + "/" + hm.get(key));
		
		System.out.println( hm.get(1002) );	// 공둘리
		hm.remove(1002);
		
		for(int key : hm.keySet())
			System.out.println(key + "/" + hm.get(key));
		
	}

}
