package newke.offer;

/**
 * Created by Xulong on 2017/3/26.
 * 把数组排成最小的数
 */
public class PrintMinNumber {

    public static void main(String[] args) {
        PrintMinNumber p = new PrintMinNumber();
        int [] nums = {3,32,321};
        System.out.println(p.PrintMinNumber(nums));
    }
    public String PrintMinNumber(int [] numbers) {
        String[] arrs = new String[numbers.length];

        for (int i = 0; i < arrs.length; i++)
            arrs[i] = "" + numbers[i];
        sort(arrs);

        String str = "";
        for (String s : arrs)
            str += s;
        return str;
    }

    public void sort(String[] arrs) {
        int len = arrs.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if ( (arrs[i] + arrs[j]).compareTo(arrs[j]+arrs[i]) < 0) {
                    String temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }


            }
        }
    }
}
