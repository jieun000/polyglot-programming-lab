package a_List;

import java.util.ArrayList;

public class A_list_1 {

	public static void main(String[] args) {
		// ArrayList(): ���������� �迭�� �̿��Ͽ� ��Ҹ� ������, ũ�� ���� �Ұ�
		ArrayList list = new ArrayList();
		
		// list�߰�
		list.add("��浿");
		list.add("���Ѹ�");
		list.add("�����");
		
		System.out.println(list);
					// ����: �迭�� length, ����Ʈ�� size
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); // list�迭�� '���' ������
		}
		
		list.add(0, "����");
		list.add(2, "Ÿ��ġ");
		
		System.out.println(list);
		
	}

}
// �÷��� �����ӿ�ũ(collection framework): 
// �ټ��� �����͸� ���� ȿ�������� ó���� �� �ִ� ǥ��ȭ�� ����� �����ϴ� Ŭ������ ������ �ǹ�.
// �����͸� �����ϴ� �ڷ� ������ �����͸� ó���ϴ� �˰����� ����ȭ�Ͽ� Ŭ������ ������ ���� ��.
// �ڹ��� �������̽�(interface)�� ����Ͽ� ������.