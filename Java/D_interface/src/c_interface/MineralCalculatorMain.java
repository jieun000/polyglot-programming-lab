package c_interface;

public class MineralCalculatorMain {

	public static void main(String[] args) {
		MineralCalculator mcl = new MineralCalculator();
		
		mcl.add(new Gold()); // �� gold��ü�� ���� mcl��ü�� add�޼��忡 �Ķ���ͷ� ������.
		mcl.add(new Silver());
		mcl.add(new Bronze());
		// System.out.println(mcl.getValue());
		System.out.println(mcl.value);
		
		mcl.mius(new Gold());
		mcl.mius(new Silver());
		mcl.mius(new Bronze());
		System.out.println(mcl.getValue());
	}

}
