package a_interface;

public class ComplexerMain {

	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		
		// 인터페이스의 변수를 참조하는 클래스에서 사용 가능
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		
		com.print();
		com.scan();
		com.send("010-1234-5678");
		com.receive("010-5678-1234");
		
		
		// 인터페이스를 객체 구현하고자한다면 추상메서드의 구체화가 필요하다.
		Fax fax = new Fax() {
			
			@Override
			public void send(String tel) {
				System.out.println("익명 구현 객체의 send()");
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("익명 구현 객체의 receive()");
			}
		}; // !
		fax.send("010-1234-5678");
		fax.receive("010-1234-5678");
		
	}

}
