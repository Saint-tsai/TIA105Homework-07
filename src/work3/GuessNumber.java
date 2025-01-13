package work3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		// 創建 Scanner 物件來讀取使用者輸入
		Scanner scanner = new Scanner(System.in);

		// 隨機產生一個 0 到 9 的數字
		Random random = new Random();
		int targetNumber = random.nextInt(10); // 產生 0 到 9 的隨機數字

		// 變數來追蹤是否猜對
		boolean guessedCorrectly = false;

		// 開始遊戲
		System.out.println("歡迎來到猜數字遊戲！請猜一個 0 到 9 之間的數字：");

		// 遊戲循環，直到猜對
		while (!guessedCorrectly) {
			// 讀取使用者的猜測
			System.out.print("請輸入你的猜測：");
			int userGuess = scanner.nextInt();

			// 判斷猜測是否正確
			if (userGuess == targetNumber) {
				// 猜對了，顯示成功訊息並結束遊戲
				System.out.println("恭喜你，猜對了！正確數字是 " + targetNumber);
				guessedCorrectly = true;
			} else {
				// 猜錯了，顯示錯誤訊息
				System.out.println("猜錯了，請再試一次！");
			}
		}

		// 關閉 scanner
		scanner.close();
	}
}
