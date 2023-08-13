package a_0;

public class Animal_main {

	public static void main(String[] args) {
// cat, dog-> 애니멀 클래스의 객체명 [애니멀의 인스턴스들-> cat, dog] 객체=인스턴스
		Animal cat = new Animal();
		Animal dog = new Animal();
		// 1) 클래스의 멤버변수에 저장
		cat.name = "애기";
		cat.age = 7;
		dog.name = "강지";
		dog.age = 18;
		System.out.println("이름: " + cat.name + ", 나이: " + cat.age);
		System.out.println("이름: " + dog.name + ", 나이: " + dog.age);
		
		
		// method class 내부에 정의된 건 메소드, 그 외는 함수	
		cat.sayHello();
		// setter로 새로 저장
		cat.setName("애기냥");
		cat.sayHello();
		
	}

}
