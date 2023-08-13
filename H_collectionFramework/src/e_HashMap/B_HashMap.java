package e_HashMap;
// list보다 중요하다! key와 value를 쌍으로 저장하는 Map
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
		
		// mapB_Car에 B_Car객체를 5개 저장 (멤버변수 값도 저장), 출력
		Map<String, B_Car> mapB_car = new HashMap<>();
		for(int i=0; i<5; i++) {
			mapB_car.put("" + i, new B_Car((int)(Math.random()*3), "홍길동"+i, (int)(Math.random()*100)));
		}

		for(String i : mapB_car.keySet()) {
			// System.out.print("년식: " + mapB_Car.get(i).getAge() + "\t");
			// System.out.print("가격: " + mapB_Car.get(i).getPrice() + "\t");
			// System.out.println("제조사: " + mapB_Car.get(i).getManufacture() + "\t");
		}

		
		// 마지막 문제		
		Map<String, List<B_Car>> listOfB_car = new HashMap<>();
		List<B_Car> B_cars = new ArrayList<>();
		for(int i=0; i<5; i++) {
			B_cars.add(new B_Car(i, "sadfsaf", i));
			listOfB_car.put("a"+i, B_cars);
		}
		
		// 출력
		for(String i : listOfB_car.keySet()) {
			System.out.println(listOfB_car.get(i));
		}
		
	}

}
