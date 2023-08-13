package c_recursion;
// 재귀함수(recursion): 정의 단계에서 자신을 재참조하는 함수
// 메서드 안에서 자기 자신메서드를 호출
public class Rec {
// 1부터 X까지 합계를 구하는 메서드
	public int rescursive_func(int num) {
		int i, sum = 0;
		for(i=0; i<=num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	
// 팩토리얼 계산_정수를 입력받아 입력받은 정수의 팩토리얼 값을 출력
	public int fact(int num) {
		if(num != 1) System.out.print(num + " * ");
		if(num == 1) {
			System.out.print(num + " = ");
			return 1;
		}
		return num * fact(num-1);
	}
}
