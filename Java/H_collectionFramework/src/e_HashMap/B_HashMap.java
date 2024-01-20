package e_HashMap;
// list���� �߿��ϴ�! key�� value�� ������ �����ϴ� Map
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		for(int i=0; i<5; i++) map.put("a"+(i+1), 5*(i+1));
		
		for(String i : map.keySet()) {
			// System.out.println(map.get(i));
		}
		
		// mapB_Car�� B_Car��ü�� 5�� ���� (������� ���� ����), ���
		Map<String, B_Car> mapB_car = new HashMap<>();
		for(int i=0; i<5; i++) {
			mapB_car.put("" + i, new B_Car((int)(Math.random()*3), "ȫ�浿"+i, (int)(Math.random()*100)));
		}

		for(String i : mapB_car.keySet()) {
			// System.out.print("���: " + mapB_Car.get(i).getAge() + "\t");
			// System.out.print("����: " + mapB_Car.get(i).getPrice() + "\t");
			// System.out.println("������: " + mapB_Car.get(i).getManufacture() + "\t");
		}

		
		// ������ ����		
		Map<String, List<B_Car>> listOfB_car = new HashMap<>();
		List<B_Car> B_cars = new ArrayList<>();
		for(int i=0; i<5; i++) {
			B_cars.add(new B_Car(i, "sadfsaf", i));
			listOfB_car.put("a"+i, B_cars);
		}
		
		// ���
		for(String i : listOfB_car.keySet()) {
			System.out.println(listOfB_car.get(i));
		}
		
	}

}
