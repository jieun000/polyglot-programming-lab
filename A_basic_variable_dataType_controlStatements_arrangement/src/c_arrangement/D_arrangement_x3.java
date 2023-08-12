package c_arrangement;

public class D_arrangement_x3 {
	
	public static void main(String[] args) {
		int[][][] arr = {
				{{1,2,3},{4,5,6}},
				{{11,12,13},{14,15,16}},
				{{21,22,23},{24,25,26}},
				{{31,32,33},{34,35,36}}
		};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
			}
		}
//		System.out.println(arr[0][1][2]); => 6
	}

}
