package e_HashMap;

public class B_Car {
	private int age;
	private String manufacture;
	private int price;
	
	int getAge() { return this.age; }
	String getManufacture( ) { return this.manufacture; }
	int getPrice() { return this.price; }
	
	void setAge(int age) { this.age = age; }
	void setManufacture(String manufacture) { this.manufacture = manufacture; }
	void setPrice(int price) { this.price = price; }
	
	@Override
	public String toString() {
		return "Car [연식=" + age + ", 제조사=" + manufacture + ", 가격=" + price + "]";
	}
	
	B_Car(int a) {
		System.out.println("정수형 매개변수 하나인 생성자 호출: a: " + a);
	}
	B_Car(int age, String manu, int price) {
		this.age = age;
		this.manufacture = manu;
		this.price = price;
	}
	B_Car(int age, String manu, int price, int cnt) {
		this.age = age;
		this.manufacture = manu;
		this.price = price;
		System.out.println("년식: "+age+", 제조사: "+manu+", price: "+price+", 횟수: "+cnt+"번 호출되었어요.");
	}
	
	B_Car(){
		System.out.println("기본 생성자(default constructor)가 호출되었어요.");
	} // 생성자 오버로딩
	
	// d
	void run(int a) {
		System.out.println("Car 클래스 정수형 run");
	}
	void run(float a) {
		System.out.println("실수형 run");
	}
}
