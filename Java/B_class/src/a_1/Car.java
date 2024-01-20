package a_1;

public class Car {
	String color;
	String company;
	String type;
	String name;
	
	public void printColor() { System.out.println(color); }
	
	public void go() {
		System.out.println(name + " 앞으로 전진");
	}
	public void back() {
		System.out.println(name + " 뒤로 후진");
	}
}
