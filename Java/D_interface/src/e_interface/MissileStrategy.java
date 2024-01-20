package e_interface;

public class MissileStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("미사일 공격");
	}

}
