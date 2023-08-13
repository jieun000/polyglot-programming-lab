package e_restrictor;
/*
 * public => 클래스, 변수(필드), 생성자, 메서드 -> 전부 접근 가능
 * default => 클래스, 변수(필드), 생성자, 메서드 -> 동일한 패키지 접근 가능
 * protect => 변수(필드), 생성자, 메서드 -> 다른 패키지만 접근X
 * private => 변수(필드), 생성자, 메서드 -> 모든 외부 클래스 접근 불가능
 */
public class Animal {
	
	private String name; // 보안, 은닉 목적
	public int age;
	
	// 생성자
	public Animal() {
		name = "애기";
		age = 6;
	}
	// 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() { return name; }
	// setter
	public void setName(String name) { this.name = name; }
	
}
