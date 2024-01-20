package a_basic_variable;

public class D_printF {

	public static void main(String[] args) {

		int a = 123;
		int b = 54321;
							
		System.out.printf("%5d\n", a);
		System.out.printf("\"%3d\"\n", b); // (")을 출력하기 위한 (\")표기
		
		double c = 3.12345;
		double d = 123.123456789;
		
		System.out.printf("%.2f\n", c); // 소수점(숫자)까지 소수
		System.out.printf("%.3f\n", d);
		
	}

}
