package e_interface;

public class Client {

	public static void main(String[] args) {
		Robot atom = new Atom("아톰");
		Robot takwonV = new TaekwonV("태권브이");
		
		atom.setAttackStrategy(new PunchStrategy());
		atom.setMovingStrategy(new FlyingStrategy());
		System.out.println("내 이름은 "+atom.getName());
		atom.attack();
		atom.move();
		
		takwonV.setAttackStrategy(new MissileStrategy());
		takwonV.setMovingStrategy(new WalkingStrategy());
		System.out.println("내 이름은 "+takwonV.getName());
		takwonV.attack();
		takwonV.move();
		
	
	
	}

}
