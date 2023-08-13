package d_constructor1;

public class CarMain {

	public static void main(String[] args) {
		
		Car ray = new Car("레어","흰색",100,150);
		ray.showInfo();
		
		ray.color = "금색";
		ray.showInfo();
		
	}

}
