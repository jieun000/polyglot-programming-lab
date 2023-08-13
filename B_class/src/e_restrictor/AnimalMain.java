package e_restrictor;

public class AnimalMain {

	public static void main(String[] args) {

		Animal cat = new Animal();

// private - 접근 제한 오류
//		System.out.println(cat.name);
//		cat.name = "애기냥";

// public -  접근 가능
		System.out.println(cat.age); // 기본 생성자의 값 가져옴
		System.out.println(cat.getName());

		cat.setName("고냠미"); // setter
		System.out.println(cat.getName()); // getter

	}

}
