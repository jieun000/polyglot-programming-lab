package a_1;

public class CarMain {

	public static void main(String[] args) {
	// ����Ÿ��  ��ü�� = ���ο� ��ü����();
		Car tico = new Car();
		Car pride = new Car();
		
		// ��������� �����ڰ� private�� �ƴ϶� ����
		tico.color = "ȭ��Ʈ";
		tico.company = "���";
		tico.type = "����";
		tico.name = "Ƽ��";
		System.out.println("�̸�: " + tico.name);
		System.out.println("��: " + tico.color);
		System.out.println("ȸ��: " + tico.company);
		System.out.println("Ÿ��: " + tico.type);

		pride.type = "����";
		if(pride.type == tico.type) System.out.println("Ÿ���� ����.");
		else System.out.println("Ÿ���� �ٸ���.");
		pride.type = "Ʈ��";
		if(pride.type == tico.type) System.out.println("Ÿ���� ����.");
		else System.out.println("Ÿ���� �ٸ���.");
		
		pride.printColor(); // null
		tico.printColor();
		
		tico.name = "��Ƽ��";
		tico.go();
		tico.back();
	}

}
