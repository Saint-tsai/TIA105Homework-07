package work2;

public class LetterPyramid {
	public static void main(String[] args) {
        
		 // 循環從 A 開始
        char letter = 'A';
        
        // 外層循環控制行數
        for (int i = 1; i <= 6; i++) {
            // 內層循環控制每行字母的重複次數
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
            }
            // 換行
            System.out.println();
            // 更新字母到下一個
            letter++;
        }
    }

}
