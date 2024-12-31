package work2;

public class WhileCalculation {
	public static void main(String[] args) {
		// 儲存連乘積
		long product = 1; // 使用 long 型別以防止溢出

		// 計算 1 到 10 的連乘積
		int i = 1;
		while (i <= 10) {
			product *= i;
			i++;
		}

		System.out.printf("1到10的連乘積為: %d\n", product);
	}
}
