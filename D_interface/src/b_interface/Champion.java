package b_interface;

public interface Champion {
	// 추상메서드
	void skilQ();
	void skilW();
	void skilE();
	void skilR();
	
	default void sound() { System.out.println("기본 챔피언 사운드"); }
	
	static void hello(String name) { 
		System.out.println(name + "님 소환사의 협곡에 오신 것을 환영합니다."); 
		}
}
