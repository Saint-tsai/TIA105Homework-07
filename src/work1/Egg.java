package work1;

    public class Egg {
	
	    public static void main(String[] args) {
            
	    	int totalEggs = 200;  // 總共的蛋數
            
	    	int eggsPerDozen = 12; // 每打的蛋數
        
                 // 計算打數
            int dozens = totalEggs / eggsPerDozen;
                 
                 // 計算剩下的蛋數
            int 餘數 = totalEggs % eggsPerDozen;
        
                 // 顯示結果
            System.out.println(totalEggs + " 顆蛋相當於 " + dozens + " 打 " + 餘數 + " 顆蛋");
}

}
