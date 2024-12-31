package work1;
              //圓計算
public class CircleCalculation {
	
	public static void main(String[] args) {
		
		// 定義常數 PI 為圓周率 3.1415
		double PI = 3.1415;

		// 半徑為 5
		double radius = 5;

		// 計算圓面積: 面積公式 A = π * r^2
		double area = PI * radius * radius;

		// 計算圓周長: 周長公式 C = 2 * π * r
		double circumference = 2 * PI * radius;

		// 輸出結果
		System.out.println("半徑為 " + radius + " 的圓的面積是: " + area);
		System.out.println("半徑為 " + radius + " 的圓的周長是: " + circumference);
	}
}
