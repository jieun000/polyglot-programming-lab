package b_overloading;

public class Calc {
	// 오버로딩: 매서드명은 같으나 매개변수(파라미터 값)이나 반환타입이 다름
	public int add(int num1, int num2) {
		System.out.println("정수들의 합계: ");
		showInfo(); // 밑 함수 있어야함.
		return num1 +  num2;
	}
	public void showInfo() {
		System.out.println("오버로딩 연습중");
	}
	
	public double add(double num1, double num2) {
		System.out.println("실수들의 합계: ");
		return num1 + num2;
	}
	
	public String add(String num1, String num2) {
		System.out.println("문자열들의 합계: ");
		 return num1 + num2;
	}
	
}
