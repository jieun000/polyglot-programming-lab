package b_overloading2;

public class Car {
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
	
	Car(int a) {
		System.out.println("������ �Ű����� �ϳ��� ������ ȣ��: a: " + a);
	}
	Car(int age, String manu, int price) {
		this.age = age;
		this.manufacture = manu;
		this.price = price;
	}
	Car(int age, String manu, int price, int cnt) {
		this.age = age;
		this.manufacture = manu;
		this.price = price;
		System.out.println("���: "+age+", ������: "+manu+", price: "+price+", Ƚ��: "+cnt+"�� ȣ��Ǿ����.");
	}
	Car(){
		System.out.println("�⺻ ������(default constructor)�� ȣ��Ǿ����.");
	} // ������ �����ε�
	
}
