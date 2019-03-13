package Algorithm.Nineteen;

/**
 * 杨辉三角
 * （1）一行的第一个元素是1，最后一个元素也是1。而我们打印这种金字塔系列的都会选择用数组进行排序打印，
 * 这里选择二维数组。
 * <p>
 * （2）发现从第3行开始中间的那个2是由上面那行的两个数相加得到，这个规律对第三行以下的所有都适用，如3=2+1,6=3+3。
 */
public class YangHuiTriangle {
    /**
     * 打印杨辉三角
     */
    public static void findNumber() {
        //设置杨辉三角的行数
        int row = 10;
        //设置二维数组存放杨辉三角
        int[][] yangHui = new int[row][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
        }
        //赋值
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                yangHui[i][0] = 1;//第i行
                yangHui[i][i] = 1;
                if (i > 1 && j > 0 && j < i) {
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i -1][j -1];
                }
            }
        }

        //打印

    }
}
