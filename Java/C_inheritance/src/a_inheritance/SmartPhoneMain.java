package a_inheritance;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		 sp.name = "갤럭시"; // sp객체의 부모클래스 멤버변수
		 sp.color = "검정";
		 sp.company = "삼성";
		 
		 System.out.println(sp.name + " " + sp.color + " " + sp.company);
		 
		 sp.call(); // Phone클래스
		 sp.receive();
		 sp.installApp(); // SmartPhone클래스
		 
	}

}
