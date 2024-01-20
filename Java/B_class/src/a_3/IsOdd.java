package a_3;

public class IsOdd {
// 01
	public void isOdd1(int num) {
		if(num%2==1) System.out.println("홀수입니다.");
		else System.out.println("짝수입니다.");
	}
	
// 02
	public boolean isOdd2(int num) {
		if(num%2==1) return true;
		else return false;
	}
	
}
