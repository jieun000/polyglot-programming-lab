package a_1;

public class CarMain {

	public static void main(String[] args) {
	// 참조타입  객체명 = 새로운 객체생성();
		Car tico = new Car();
		Car pride = new Car();
		
		// 멤버변수의 접근자가 private가 아니라서 가능
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		tico.name = "티코";
		System.out.println("이름: " + tico.name);
		System.out.println("색: " + tico.color);
		System.out.println("회사: " + tico.company);
		System.out.println("타입: " + tico.type);

		pride.type = "경차";
		if(pride.type == tico.type) System.out.println("타입이 같다.");
		else System.out.println("타입이 다르다.");
		pride.type = "트럭";
		if(pride.type == tico.type) System.out.println("타입이 같다.");
		else System.out.println("타입이 다르다.");
		
		pride.printColor(); // null
		tico.printColor();
		
		tico.name = "말티즈";
		tico.go();
		tico.back();
	}

}
