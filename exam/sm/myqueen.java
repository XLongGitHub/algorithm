package sm;

/**
 * Created by Xulong on 2017/4/17.
 */
public class myqueen {
    private int count; //次数
    public static final int MAX = 8;
    int[] array = new int[MAX];  //该数组保存结果，第一个皇后摆在array[0]列，第二个摆在array[1]列

    public void check(int n) {
        if (n == MAX) {
            count++;
            return;
        }
        for (int i = 0; i < MAX; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n+1);
            }
        }
    }

    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        myqueen myqueen = new myqueen();
        myqueen.check(0);
        System.out.println(myqueen.count);
    }
}
