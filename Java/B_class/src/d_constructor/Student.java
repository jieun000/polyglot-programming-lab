package d_constructor;
// ��ü ���� ���α׷���(OOP:objective-oriented programming)
public class Student {
	
	String name;
	int grade;
	String gender;
	
	// �����ڴ� �빮�� ����
	Student(String n, int g) {
		name = n;
		grade = g;
		gender = "����";
	}
	Student() {
		grade = 5;
	}
	Student(String n, int g, String gen) {
		name = n;
		grade = g;
		gender = gen;
		System.out.println(name + grade + gender);
	}
 	
}
