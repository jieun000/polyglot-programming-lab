package e_interface;

public class PunchStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("강한 펀치 공격");
	}

}
