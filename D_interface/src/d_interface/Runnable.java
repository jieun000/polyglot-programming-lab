package d_interface;
/* mapper 이해를 위해!
 * 
 * 1) 추상메서드만 가지고 있는 클래스와 비슷한 대상
 * 2) 객체 생성 불가
 * 3) 반드시 클래스를 생성하여 객체를 생성해야함. 
 * 4) 클래스 생성시 implements하여 이곳에서 정의한
 * 5) 메서드를 오버라이딩 해야함.
 */
public interface Runnable {
	
	int multiply(); // 추상메서드
	
}
