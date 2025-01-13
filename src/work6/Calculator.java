package work6;

public class Calculator {
	 // 計算 x 的 y 次方
    public int powerXY(int x, int y) throws CalException {
        // 處理 x 和 y 同時為 0 的情況
        if (x == 0 && y == 0) {
            throw new CalException("x 和 y 同時為 0，無法計算次方！");
        }

        // 處理 y 為負數且結果不為整數的情況
        if (y < 0) {
            throw new CalException("y 不能為負數，否則結果不是整數！");
        }

        // 正常計算 x 的 y 次方
        return (int) Math.pow(x, y);
    }
}
