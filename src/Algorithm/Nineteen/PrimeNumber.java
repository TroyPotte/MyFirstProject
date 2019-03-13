package Algorithm.Nineteen;

/**
 * 质数
 */
public class PrimeNumber {
    /**
     * 寻找给定1到给定数字之间的所有质数
     * @param maxNumber 最大区间
     */
    public static void findPrimeNumber(int maxNumber) {
        int tmpNumber = 0;
        //1不是质数，所以从2开始
        for (int i = 2; i < maxNumber; i++) {
            boolean tmp = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    tmp = false;
                    break;
                }
            }
            if (tmp == true) {
                tmpNumber++;
                System.out.println(i);
            }
        }
        System.out.println("总共有质数：" + tmpNumber + "个。");
    }

    public static void main(String[] args) {
        findPrimeNumber(1000);
    }
}
