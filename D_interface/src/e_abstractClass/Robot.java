package e_abstractClass;
	// 추상클래스
public abstract class Robot {
	private String name;
	
	// 세터가 없는 것은 객체가 생성할 때 값을 주면 멤버변수가 생성되게 해서임.
	public Robot(String name) { this.name = name; }
	public String getName() { return this.name; }
	
	// 추상메서드
	public abstract void attack();
	public abstract void move();
}
