package work4;

public class AverageAbove {
	public static void main(String[] args) {
        // 給定的一維陣列
        int[] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        
        // 計算陣列元素的總和
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // 計算平均值
        double average = (double) sum / numbers.length;
        
        // 輸出平均值
        System.out.println("陣列所有元素的平均值: " + average);
        
        // 輸出大於平均值的元素
        System.out.print("大於平均值的元素: ");
        boolean first = true;
        for (int num : numbers) {
            if (num > average) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(num);
                first = false;
            }
        }
        System.out.println();
    }
}
