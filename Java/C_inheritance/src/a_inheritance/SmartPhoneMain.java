package a_inheritance;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		 sp.name = "������"; // sp��ü�� �θ�Ŭ���� �������
		 sp.color = "����";
		 sp.company = "�Ｚ";
		 
		 System.out.println(sp.name + " " + sp.color + " " + sp.company);
		 
		 sp.call(); // PhoneŬ����
		 sp.receive();
		 sp.installApp(); // SmartPhoneŬ����
		 
	}

}
