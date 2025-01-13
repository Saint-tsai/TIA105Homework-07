package work6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
        // 創建 Calculator 物件
        Calculator calculator = new Calculator();
        
        // 創建 Scanner 物件以讀取使用者輸入
        Scanner scanner = new Scanner(System.in);
        
        try {
            // 輸入 x 和 y 的值
            System.out.print("請輸入 x 的值: ");
            int x = scanner.nextInt();
            System.out.print("請輸入 y 的值: ");
            int y = scanner.nextInt();

            // 呼叫 powerXY 計算 x 的 y 次方
            int result = calculator.powerXY(x, y);
            System.out.println(x + " 的 " + y + " 次方是: " + result);

        } catch (CalException e) {
            // 如果捕獲到 CalException，顯示錯誤訊息
            System.out.println("錯誤: " + e.getMessage());
        } catch (Exception e) {
            // 捕獲其他一般的錯誤
            System.out.println("發生錯誤: " + e.getMessage());
        } finally {
            // 關閉 scanner 物件
            scanner.close();
        }
    }
}
