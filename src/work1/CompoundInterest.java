package work1;

           //CompoundInterest 複利
public class CompoundInterest {
	
	public static void main(String[] args) {
		
		// 初始本金 ; principal,本金,主要的
		double principal = 1500000;
		
		// 年利率 ; interestRate,利率
		double interestRate = 0.02;
		
		// 投資年數
		int years = 10;

		// 計算10年後的本金加利息總額
		for (int i = 0; i < years; i++) {
			principal += principal * interestRate;
		} //principal = principal + (  principal * interestRate )  

		System.out.printf("10年後的本金加利息為: %.2f元\n", principal);
	}
}
