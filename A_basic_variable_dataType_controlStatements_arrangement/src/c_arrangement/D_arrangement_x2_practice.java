package c_arrangement;

public class D_arrangement_x2_practice {

	public static void main(String[] args) {
// 숫자 아래로
//		int[][] arr = new int[5][5];
//		int i, j, num = 1;
//		
//		for(i=0; i<5; i++) {
//			for(j=0; j<5; j++) {
//				arr[j][i] = num;
//				num++;
//			}
//		}
//		for(i=0; i<5; i++) {
//			for(j=0; j<5; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
// 아래로 숫자 배열 늘리기
//		int[][] arr = new int[5][5];
//		int i, j, num = 1;
//		
//		for(i=0; i<5; i++) {
//			for(j=0; j<5; j++) {
//				arr[i][j] = num;
//				num++;
//			}
//		}
//		for(i=0; i<5; i++) {
//			for(j=0; j<=i; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	
		
// 달행이! 패턴
		int[][] arr = new int[5][5];
		int i, j; // 반복용 변수
		int num = 1; // 배열 안에 들어가는 숫자
		int x = 0, y = -1; // 배열방 변수
		int a = 5; // 값 넣을 때 필요한 반복 횟수
		int s = 1; // 스위치용 변수
		
		for(i=0; i<5; i++) {
			for(j=0; j<a; j++) {
				y = y + s;
				arr[x][y] = num;
				num++;
			}					// 첫 줄 완성
			a--;
			
			for(j=0; j<a; j++) {
				x = x + s;
				arr[x][y] = num;
				num++;
			}
			s = s * -1;
		}
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
