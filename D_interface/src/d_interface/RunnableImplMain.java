package d_interface;

import java.util.ArrayList;
import java.util.List;

public class RunnableImplMain {

	public static void main(String[] args) {
		
		// �������̽��� ��ü ���� �Ұ���
		// Runnable run = new Runnable();
		
		// ������Ÿ���� �ٸ��� �� �ɱ�? ���� ��������������.
		// �θ� �ڽ� ��ü�� ���� �� �ִ�.
		Runnable run = new RunnableImpl();
		
		System.out.println(run.multiply()); // ���ڿ� + 11����
		
		List<Runnable> list = new ArrayList<>();
		for(int i=0; i<20; i++) {
			list.add(new RunnableImpl()); // 20�� �����Ǿ� ����Ʈ�� �߰���
		}
		
		int sum = 0;
		for(Runnable i : list) sum += i.multiply(); 
		// 20�� ���ڿ���  return�� 11������ ������
		System.out.println(sum);
		
	}

}
