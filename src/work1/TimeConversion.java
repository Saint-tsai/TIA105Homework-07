package work1;

public class TimeConversion { //Conversion 轉換
	public static void main(String[] args) {
		int totalSeconds = 256559; // 設定總秒數

		// 計算天數
		int days = totalSeconds / (24 * 3600);

		// 計算剩餘的秒數,remaining 其餘的
		int remainingSeconds = totalSeconds % (24 * 3600);

		// 計算小時數
		int hours = remainingSeconds / 3600;

		// 計算剩餘的秒數
		remainingSeconds = remainingSeconds % 3600;

		// 計算分鐘數
		int minutes = remainingSeconds / 60;

		// 剩餘的秒數
		int seconds = remainingSeconds % 60;

		// 輸出結果
		System.out.println(totalSeconds + " 秒相當於 " + days + " 天 " + hours + " 小時 " + minutes + " 分鐘 " + seconds + " 秒");
	}

}
