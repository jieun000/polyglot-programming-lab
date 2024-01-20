package d_constructor1;

public class Car {
	String name;
	String color;
	int horsePower;
	int speed;
	
	// 생성자 자동생성: 우측키, source, generator constructor using field
	public Car(String name, String color, int horsePower, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.horsePower = horsePower;
		this.speed = speed;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("색상: " + color);
		System.out.println("마력: " + horsePower);
		System.out.println("속도: " + speed);
	}
}
