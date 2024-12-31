package work2;

public class SquaresOutput {//Square 平方,方塊
	
	public static void main(String[] args) {
        
		// 輸出 1 到 10 的平方數
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i);
            if (i < 10) {
                System.out.print(" "); // 加空格分隔數字
            }
        }
        System.out.println(); // 換行
    }
}
