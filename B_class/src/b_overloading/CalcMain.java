package b_overloading;
// Ctrl + Shift + S => 전체 저장
// Ctrl + Shift + F => 자동 정렬
public class CalcMain {

	public static void main(String[] args) {
		Calc calc = new Calc();

		System.out.println(calc.add(5, 10));
		
		System.out.println(calc.add(3.14, 12.12));
		calc.showInfo();
		System.out.println(calc.add("첫번째", "두번째"));
	}

}
