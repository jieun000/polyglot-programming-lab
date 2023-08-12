package c_arrangement;

public class A_arrangement {

	public static void main(String[] args) {

		// 배열 선언(초기화)
		int[] num =  new int[5];
		
		num[0] = 10; // 시작은 0, 0번 index
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);	
	
		System.out.println("=====반복문으로 값 넣기=====");
		
		int i, a = 10;
		for(i=0; i<=4; i++) {
			num[i] = a;
			a += 1; // 먼저 10부터 숫자가 4번 올라가는 a를 배열에 넣어주고
		}
		for(i=0; i<=4; i++) {
			System.out.println(num[i]); // 배열을 하나씩 출력
		}
		
	}

}
