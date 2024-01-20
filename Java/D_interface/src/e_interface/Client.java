package e_interface;

public class Client {

	public static void main(String[] args) {
		Robot atom = new Atom("����");
		Robot takwonV = new TaekwonV("�±Ǻ���");
		
		atom.setAttackStrategy(new PunchStrategy());
		atom.setMovingStrategy(new FlyingStrategy());
		System.out.println("�� �̸��� "+atom.getName());
		atom.attack();
		atom.move();
		
		takwonV.setAttackStrategy(new MissileStrategy());
		takwonV.setMovingStrategy(new WalkingStrategy());
		System.out.println("�� �̸��� "+takwonV.getName());
		takwonV.attack();
		takwonV.move();
		
	
	
	}

}
