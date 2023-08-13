package e_interface;
// 추상클래스
public abstract class Robot {
	private String name;
	private AttackStrategy attackStrategy;
	private MovingStrategy movingStrategy;
	
	public Robot(String name) { this.name = name; }
	public String getName() { return this.name; }
	
	public void attack() { attackStrategy.attack(); }
	public void move() { movingStrategy.move(); }
	
	// Setter 
	void setAttackStrategy(AttackStrategy a) {
		this.attackStrategy = a;
	}
	void setMovingStrategy(MovingStrategy m) {
		this.movingStrategy = m;
	}
	// Getter
	public AttackStrategy getAttackStrategy() { return this.attackStrategy; }
	public MovingStrategy getMovingStrategy() { return this.movingStrategy; }
}
