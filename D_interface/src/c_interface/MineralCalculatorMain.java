package c_interface;

public class MineralCalculatorMain {

	public static void main(String[] args) {
		MineralCalculator mcl = new MineralCalculator();
		
		mcl.add(new Gold()); // 새 gold객체를 만들어서 mcl객체의 add메서드에 파라미터로 보낸다.
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
