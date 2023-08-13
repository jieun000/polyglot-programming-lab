package a_0;
// 자바는 무조건 Object클래스를 상속받는다. 
public class Animal {
	// 멤버변수
	String name;
	int age;
	
	// setter: 
	// public void setName(String n) { name = n; }
	// this.: 클래스 자신의 객체 멤버를 참조할 수 있는 키워드 
	// 			- 매개변수와 필드명이 동일한 경우에 이 둘을 구분하기 위해 사용함
	public void setName(String n) { this.name = n; }
	
	public void sayHello() {
		System.out.println(name + " 안녕하세요.");
	}
	
}
// getter와 setter를 사용하면 객체의 private필드를 조회하거나 수정할 수 있다.
// 메서드 이름 규칙 get(set)+ 첫글자대문자로 필드이름
// getter: 외부에서 객체의 private한 필드를 읽을 때 사용한다. 
// setter: 외부에서 객체의 private한 필드를 수정할 때 사용한다. 
