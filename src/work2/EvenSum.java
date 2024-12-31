package work2;
             //偶數和
public class EvenSum {  
	      
	public static void main(String[] args) {
		
		// 宣告偶數和為Sum,還沒開始計算為0
		int sum = 0;

		// 計算1到1000的偶數和
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		} //sum = sum + i  
                   
		          //%d: 表示格式化為整數（decimal integer）
		System.out.printf("1到1000的偶數和為: %d\n", sum);
	}                            //\n: 表示換行符號

}
