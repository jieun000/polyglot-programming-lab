package e_HashMap;

import java.util.HashMap;

public class A_HashMap_1 {
	// Map �������̽��� Collection �������̽��ʹ� �ٸ� ���� ���.
	// Map �������̽��� ������ Map �÷��� Ŭ�������� Ű�� ���� �ϳ��� ������ �����ϴ� ���(key-value ���.
	// ���⼭ Ű(key)�� �������� ��(value)�� ã�� ���� �̸��� ����.
	
	// ����� ���� ����X
	// Ű�� �ߺ��� ���X, ���� �ߺ�O ( �ߺ��� ŰX, ������ ���� ���� �ٸ� Ű�� �����ϴ� ���� ����. )
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		// map.put() map�߰�
		hm.put(1001,"��浿");	//[Ű(�ּ�), ��]
		hm.put(1002,"���Ѹ�");
		hm.put(1003,"�����");
		
		System.out.println(hm);
		
		for(int key : hm.keySet())
			System.out.println(key + "/" + hm.get(key));
		
		System.out.println( hm.get(1002) );	// ���Ѹ�
		hm.remove(1002);
		
		for(int key : hm.keySet())
			System.out.println(key + "/" + hm.get(key));
		
	}

}
