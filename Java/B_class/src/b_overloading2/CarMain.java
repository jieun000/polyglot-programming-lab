package b_overloading2;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {

		// 1-1 ������ Ȱ��	
		Car car = new Car(20, "�λ�����", 50);
		Car car2 = new Car(200, "�ý�", 150);
		Car car3 = new Car(2000, "LG", 3);
		
		// 1-2 setter Ȱ��
		car.setAge(50);
		car.setManufacture("�λ�����");
		car.setPrice(1500);
		car2.setAge(50);
		car2.setManufacture("�Ｚ");
		car2.setPrice(1500);
		car3.setAge(50);
		car3.setManufacture("LG");
		car3.setPrice(1500);
		
		
		List<Car> cars = new ArrayList<>();
		cars.add(car);
		cars.add(car2);
		cars.add(car3);
		for(Car i : cars) System.out.println(i);
		
	}

}
