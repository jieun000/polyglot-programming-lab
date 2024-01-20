package e_restrictor;
/*
 * public => Ŭ����, ����(�ʵ�), ������, �޼��� -> ���� ���� ����
 * default => Ŭ����, ����(�ʵ�), ������, �޼��� -> ������ ��Ű�� ���� ����
 * protect => ����(�ʵ�), ������, �޼��� -> �ٸ� ��Ű���� ����X
 * private => ����(�ʵ�), ������, �޼��� -> ��� �ܺ� Ŭ���� ���� �Ұ���
 */
public class Animal {
	
	private String name; // ����, ���� ����
	public int age;
	
	// ������
	public Animal() {
		name = "�ֱ�";
		age = 6;
	}
	// ������
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() { return name; }
	// setter
	public void setName(String name) { this.name = name; }
	
}
