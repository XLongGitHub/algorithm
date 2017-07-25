package offer;

/**
 * Created by Xulong on 2017/4/19.
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class MovingCount {
    public static void main(String[] args ) {
        MovingCount mc = new MovingCount();
        int count = mc.movingCount(5,10,10);
        System.out.println(count);
    }

    /**
     *
     * @param threshold   位置限制
     * @param rows
     * @param cols
     * @return
     */
    public int movingCount(int threshold, int rows, int cols) {
        int[] count = {0};  //运用数组保存结果，因为递归函数中可以修改该变量值。
        int[] flag = new int[rows * cols];  //标记该点是否已经被访问过，防止重复访问
        move(threshold, rows, cols, 0, 0, count, flag);
        return count[0];
    }

    /**
     *
     * @param threshold
     * @param rows
     * @param cols
     * @param i 当前位置
     * @param j
     * @param count
     * @param flag
     */
    public static void move(int threshold, int rows, int cols , int i, int j,int[] count, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols) return;
        if (flag[index] == 1) return;
        if (sum(i, j) > threshold) return;
        flag[index] = 1;
        count[0]++;
        move(threshold, rows, cols, i - 1, j , count, flag);
        move(threshold, rows, cols, i + 1, j , count, flag);
        move(threshold, rows, cols, i, j - 1, count, flag);
        move(threshold, rows, cols, i, j + 1, count, flag);
    }

    public static int sum(int n1, int n2) {
        return sum(n1) + sum(n2);
    }

    public static int sum(int num) {
        String str = num + "";
        String[] strings = str.split("");
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && !(strings[i].equals("")))  //没有这一句话的时候，就出现java.lang.NumberFormatException: For input string: ""
            sum += Integer.parseInt(strings[i]);
        }
        return sum;
    }
}
