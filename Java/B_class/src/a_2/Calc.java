package a_2;
/* 접근제한자 리턴타입 메서드이름(매개변수,매개변수) {
 * 		작업할 코드
 * 		리턴타입이 void를 제외한 다른 것
 * 		return 반환시킬 값;
 *  }
 * 	리턴타입: void, int, double, char, String
 */
public class Calc {
// 01
	// 정수값을 되돌려줌
	public int add(int num1, int num2) {
		System.out.print("더하기 계산을 처리합니다. ");
		return num1 + num2;
	}
	
	public int mius(int num1, int num2) {
		System.out.print("빼기 계산을 처리합니다. ");
		return num1 + num2;
	}
	
	public int mul(int num1, int num2) {
		System.out.print("곱하기 계산을 처리합니다. ");
		return num1 + num2;
	}
	
	public int div(int num1, int num2) {
		System.out.print("나누기 계산을 처리합니다. ");
		return num1 + num2;
	}
	
	
// 02
	String add;
	String mius;
	String mul;
	String div;
	public void go() {
		System.out.print("계산을 처리할 방법 선택 [1.더하기 | 2.빼기 | 3.곱하기 | 4.나누기 | 그 외는 종료 ]");
	}
	
}
