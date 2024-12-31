package work3;

import java.util.Scanner;

public class TriangleType {
	public static void main(String[] args) {
		// 創建 Scanner 物件來讀取使用者輸入
		Scanner scanner = new Scanner(System.in);

		// 輸入三個數字
		System.out.print("請輸入第一個數字（邊長a）：");
		int a = scanner.nextInt();
		System.out.print("請輸入第二個數字（邊長b）：");
		int b = scanner.nextInt();
		System.out.print("請輸入第三個數字（邊長c）：");
		int c = scanner.nextInt();

		// 判斷三角形成立條件
		if (a + b > c && a + c > b && b + c > a) {
			// 如果是三角形，判斷其類型
			if (a == b && b == c) {
				System.out.println("這是一個正三角形。");
			} else if (a == b || a == c || b == c) {
				System.out.println("這是一個等腰三角形。");
			} else {
				System.out.println("這是一個其它三角形。");
			}
		} else {
			System.out.println("這些數字無法形成三角形。");
		}

		// 關閉 Scanner
		scanner.close();
	}
}
