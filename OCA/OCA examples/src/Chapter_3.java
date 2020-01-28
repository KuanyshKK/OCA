
public class Chapter_3 {
	public static void main(String args[]) {
		int[][] twoD = new int[3][2];
		for(int i = 0; i < twoD.length; i++) {
			for(int j = 0; j <  twoD[i].length;j++) {
				System.out.println(twoD[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int[] inner : twoD) {
			for (int num : inner) {
				System.out.println(num + " ");
			}
			System.out.println();
		}
		
	}
}
