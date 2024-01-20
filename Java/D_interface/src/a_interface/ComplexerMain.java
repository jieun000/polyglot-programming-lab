package a_interface;

public class ComplexerMain {

	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		
		// �������̽��� ������ �����ϴ� Ŭ�������� ��� ����
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		
		com.print();
		com.scan();
		com.send("010-1234-5678");
		com.receive("010-5678-1234");
		
		
		// �������̽��� ��ü �����ϰ����Ѵٸ� �߻�޼����� ��üȭ�� �ʿ��ϴ�.
		Fax fax = new Fax() {
			
			@Override
			public void send(String tel) {
				System.out.println("�͸� ���� ��ü�� send()");
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("�͸� ���� ��ü�� receive()");
			}
		}; // !
		fax.send("010-1234-5678");
		fax.receive("010-1234-5678");
		
	}

}
