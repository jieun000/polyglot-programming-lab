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
		return "Car [����=" + age + ", ������=" + manufacture + ", ����=" + price + "]";
	}
	
	B_Car(int a) {
		System.out.println("������ �Ű����� �ϳ��� ������ ȣ��: a: " + a);
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
		System.out.println("���: "+age+", ������: "+manu+", price: "+price+", Ƚ��: "+cnt+"�� ȣ��Ǿ����.");
	}
	
	B_Car(){
		System.out.println("�⺻ ������(default constructor)�� ȣ��Ǿ����.");
	} // ������ �����ε�
	
	// d
	void run(int a) {
		System.out.println("Car Ŭ���� ������ run");
	}
	void run(float a) {
		System.out.println("�Ǽ��� run");
	}
}
