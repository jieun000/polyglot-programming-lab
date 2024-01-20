package c_interface;

public class MineralCalculator {
	int value = 0;
	
	void add(Mineral m) {
		value = value + m.getValue();
	}
	
	void mius(Mineral m) {
		value = value - m.getValue();
	}
	
	int getValue() { return value; }
}
