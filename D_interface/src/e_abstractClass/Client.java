package e_abstractClass;

public class Client {

	public static void main(String[] args) {
		Robot takwonV = new TaekwonV("태권브이");
		Robot atom = new Atom("아톰");
		
		System.out.println("내 이름은 "+takwonV.getName());
		takwonV.attack();
		takwonV.move();
		
		System.out.println("내 이름은 "+atom.getName());
		atom.attack();
		atom.move();
	}

}
// 문제는? 태권브이 기능을 뛰어다니는 걸로 바꾸려면 태권브이클래스에 가서 내부를 고쳐야함
// 그래서 스트래터지 패턴을 하려고 인터페이스함(기능을 외부에서 만들어서 넣어주자)

