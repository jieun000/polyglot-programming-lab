package e_abstractClass;
	// �߻�Ŭ����
public abstract class Robot {
	private String name;
	
	// ���Ͱ� ���� ���� ��ü�� ������ �� ���� �ָ� ��������� �����ǰ� �ؼ���.
	public Robot(String name) { this.name = name; }
	public String getName() { return this.name; }
	
	// �߻�޼���
	public abstract void attack();
	public abstract void move();
}
