package d_constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student("��浿", 1);
		System.out.println(stu1.name + " " + stu1.gender);
		
		Student stu2 = new Student();
		System.out.println(stu2.name); // null
		System.out.println(stu2.grade);
		
		Student stu3 = new Student("���Ѹ�", 2, "����");
		System.out.println(stu3.name);
	}

}
