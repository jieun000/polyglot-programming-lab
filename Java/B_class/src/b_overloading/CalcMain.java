package b_overloading;
// Ctrl + Shift + S => ��ü ����
// Ctrl + Shift + F => �ڵ� ����
public class CalcMain {

	public static void main(String[] args) {
		Calc calc = new Calc();

		System.out.println(calc.add(5, 10));
		
		System.out.println(calc.add(3.14, 12.12));
		calc.showInfo();
		System.out.println(calc.add("ù��°", "�ι�°"));
	}

}
