package a_0;
// �ڹٴ� ������ ObjectŬ������ ��ӹ޴´�. 
public class Animal {
	// �������
	String name;
	int age;
	
	// setter: 
	// public void setName(String n) { name = n; }
	// this.: Ŭ���� �ڽ��� ��ü ����� ������ �� �ִ� Ű���� 
	// 			- �Ű������� �ʵ���� ������ ��쿡 �� ���� �����ϱ� ���� �����
	public void setName(String n) { this.name = n; }
	
	public void sayHello() {
		System.out.println(name + " �ȳ��ϼ���.");
	}
	
}
// getter�� setter�� ����ϸ� ��ü�� private�ʵ带 ��ȸ�ϰų� ������ �� �ִ�.
// �޼��� �̸� ��Ģ get(set)+ ù���ڴ빮�ڷ� �ʵ��̸�
// getter: �ܺο��� ��ü�� private�� �ʵ带 ���� �� ����Ѵ�. 
// setter: �ܺο��� ��ü�� private�� �ʵ带 ������ �� ����Ѵ�. 
