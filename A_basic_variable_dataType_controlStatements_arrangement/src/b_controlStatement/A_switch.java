package b_controlStatement;

public class A_switch {

	public static void main(String[] args) {
		
		// 숫자
		int w = 1;	// 0(일) ~ 6(토) 중 하나 들어감
		
		switch(w) {
			case 0: 
				System.out.println("0은 일요일");
				break; // break 없으면 다 출력됨
			case 1: 
				System.out.println("1은 월요일");
				break;
			case 2: 
				System.out.println("2은 화요일");
				break;
			default: 
				System.out.println("나머지는 수~토요일");
		}
		
		// 문자
		char ch = 'a';// a, A 입력
		
		switch(ch) {
		case 'a':
			System.out.println("소문자 a");
			break;
		case 'A':
			System.out.println("대문자 A");
			break;
		}
		
		// 문자열
		String str = "1학년"; int n = 10;
		
		switch(str) {
		case "1학년":
			n = n + 1; // 같은 것들: [n += 1] = [n++]	
			System.out.println("1학년 가산점 포함: " + n);
			break;
		case "2학년":
			n = n + 2;
			System.out.println("2학년 가산점 포함: " + n);
			break;
		case "3학년":
			n = n + 3;
			System.out.println("3학년 가산점 포함: " + n);
			break;
		}
		
	}

}
