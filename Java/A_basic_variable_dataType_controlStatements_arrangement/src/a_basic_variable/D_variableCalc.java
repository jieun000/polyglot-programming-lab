package a_basic_variable;

public class D_variableCalc {

	public static void main(String[] args) {

		int num1 = 20;
		double num2 = 6; // 소수 주의
		
		System.out.println("두 수 합: " + (num1 + num2));
		System.out.println("두 수 차: " + (num1 - num2));
		System.out.println("두 수 곱: " + (num1 * num2));
		System.out.println("두 수 나눔: " + (num1 / num2));
		System.out.println("두 수 나눈 나머지: " + (num1 % num2));
		System.out.println(""); // 한 줄 띄움을 위해 넣음
		
		// 10 % 3 :  10 나누기 3의 나머지를 계산
		int a = 10, b = 3;
		System.out.println("두 수 나눈 나머지: " + (a % b));
		
		// 자료형 변환-> 명시적 형변환 (정수-> 실수로 강제 변환)
		System.out.println("나눈 결과: " + (a / (double)b));
		System.out.println("두 수 합: " + (a + b)); // 다시 원 상태
		
	}

}
