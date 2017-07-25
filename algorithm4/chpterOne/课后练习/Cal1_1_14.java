import java.util.Scanner;

/**
 * Created by Xulong on 2016/11/19.
 */
public class Cal1_1_14 {
    static int num = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(lg(N));
    }

    public static int lg(int N) {
//        int num = 0;
        int i = 0;
        for(;;) {

            if (! ( (i*i<N) &&( (i+1)*(i+1)>N) )) {
                i++;
            } else {
                num = i;
                break;
            }

        }
        return num;
//        return 1;
    }
}
