package work2;

public class LotteryNumbers {
	public static void main(String[] args) {
        int count = 0; // 記錄可選擇的數字總數

        System.out.print("阿文可以選擇的數字有: ");
        for (int i = 1; i <= 49; i++) {
            // 排除包含數字4的數字
            if (String.valueOf(i).contains("4")) {
                continue;
            }
            System.out.print(i + " ");
            count++;
        }

        System.out.println(); // 換行
        System.out.println("總共有 " + count + " 個數字可選擇。");
    }

}
