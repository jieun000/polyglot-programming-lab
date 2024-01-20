package d_constructor;
// 객체 지향 프로그래밍(OOP:objective-oriented programming)
public class Student {
	
	String name;
	int grade;
	String gender;
	
	// 생성자는 대문자 시작
	Student(String n, int g) {
		name = n;
		grade = g;
		gender = "남자";
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
