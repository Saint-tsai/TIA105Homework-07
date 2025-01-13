package work3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LottoPicker {
	 public static void main(String[] args) {
	        // 建立 Scanner 物件來取得使用者輸入
	        Scanner scanner = new Scanner(System.in);
	        
	        // 輸入不想要的數字，並將其分割為數字陣列
	        System.out.print("請輸入不想要的數字 (1-9)，以逗號分隔: ");
	        String input = scanner.nextLine();
	        String[] unwantedStrings = input.split(",");
	        
	        // 將輸入的字符串轉換為數字並儲存於 Set 中
	        Set<Integer> unwantedNumbers = new HashSet<>();
	        for (String numStr : unwantedStrings) {
	            try {
	                int num = Integer.parseInt(numStr.trim());
	                if (num >= 1 && num <= 9) {
	                    unwantedNumbers.add(num);
	                }
	            } catch (NumberFormatException e) {
	                // 當無法解析為數字時，忽略該項
	            }
	        }

	        // 所有可能的數字 (1 到 49)
	        Set<Integer> allNumbers = new HashSet<>();
	        for (int i = 1; i <= 49; i++) {
	            allNumbers.add(i);
	        }

	        // 移除不想要的數字
	        allNumbers.removeAll(unwantedNumbers);

	        // 顯示可選擇的號碼
	        List<Integer> availableNumbers = new ArrayList<>(allNumbers);
	        Collections.sort(availableNumbers);
	        System.out.println("可以選擇的號碼: " + availableNumbers);
	        System.out.println("總共有 " + availableNumbers.size() + " 個號碼可以選擇。");

	        // 關閉 Scanner
	        scanner.close();
	    }
}
