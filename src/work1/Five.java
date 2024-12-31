package work1;

public class Five {
	
	public static void main(String[] args) {
       
		// 5 + 5: 兩個整數相加，結果是整數
        System.out.println(5 + 5);  // 輸出結果: 10
        
        // 5 + '5': 5 是整數，'5' 是字符型別，字符 '5' 的 ASCII 值是 53
        // 因此，5 + '5' 等於 5 + 53，結果是 58
        System.out.println(5 + '5');  // 輸出結果: 58
        
        // 5 + "5": 5 是整數，"5" 是字串，Java 中 "+" 運算子會將整數轉為字串進行串接
        // 所以 5 + "5" 會將 5 轉為字串並與 "5" 串接，結果是 "55"
        System.out.println(5 + "5");  // 輸出結果: "55"
    }

}
