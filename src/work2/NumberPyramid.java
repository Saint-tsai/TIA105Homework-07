package work2;

public class NumberPyramid { //Pyramid金字塔
	public static void main(String[] args) {
		// 輸出數字金字塔
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // 換行
		}
	}

}
