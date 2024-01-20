package b_controlStatement;

public class D_Practice {

	public static void main(String[] args) {

// 소수인지 구하기
/*		
		int n, i, cnt = 0;
		
		System.out.print("정수를 입력: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			if(n % i == 0) {	// 소수는 0으로 나눠지는 것이 2개 뿐임
				cnt++;		}
		}
		if(cnt == 2) {
			System.out.println("입력받은 " + n + "은 소수입니다.");
		} else {
			System.out.println("입력받은 " + n + "은 소수가 아닙니다.");
		}														*/
		
		
// 1~100, 3의 배수이면서(&&) 2의 배수가 아닌(!=) 목록, 개수, 합개
		int i, sum = 0, cnt = 0;
		
		for(i=1; i<=100; i++) {
			if(i%3 == 0 && i%2 != 0) {
				cnt++;
				sum = sum + i;  // sum += 1;
				System.out.print(i + " ");
			}
		}
		System.out.println(); // 줄 바꿈을 위해 넣음
		System.out.println("개수: " + cnt);
		System.out.println("합계: " + sum);
		
	}

}
