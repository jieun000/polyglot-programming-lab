package d_constructor1;

public class Car {
	String name;
	String color;
	int horsePower;
	int speed;
	
	// ������ �ڵ�����: ����Ű, source, generator constructor using field
	public Car(String name, String color, int horsePower, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.horsePower = horsePower;
		this.speed = speed;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + color);
		System.out.println("����: " + horsePower);
		System.out.println("�ӵ�: " + speed);
	}
}
