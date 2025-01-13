package work5;

import java.util.Scanner;

public class StarRectangle {
	 // 定義 starSquare 方法來印出長方形
    public static void starSquare(int width, int height) {
        // 外層迴圈控制列數
        for (int i = 0; i < height; i++) {
            // 內層迴圈控制每列的星號數
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            // 換行
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // 建立 Scanner 物件以獲取使用者輸入
        Scanner scanner = new Scanner(System.in);
        
        // 請使用者輸入長方形的寬度與高度
        System.out.print("請輸入長方形的寬度: ");
        int width = scanner.nextInt();
        
        System.out.print("請輸入長方形的高度: ");
        int height = scanner.nextInt();
        
        // 呼叫 starSquare 方法來印出對應的長方形
        starSquare(width, height);
        
        // 關閉 Scanner 物件
        scanner.close();
    }
}
