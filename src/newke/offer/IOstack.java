package offer;

/**
 * Created by Xulong on 2017/3/24.
 */
public class IOstack {
    public static void main(String[]args) {
        IOstack io = new IOstack();
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,1};

        System.out.println(io.IsPopOrder(pushA, popA));
    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int[] temp = new int[pushA.length];

        int val = pushA[0];
        int pos = 0;  //第一个相等数字的位置
        for (int i = 0; i < pushA.length; i++) {
            if (val == popA[i])
                break;
            pos++;

        }

        for (int i = 0; i < popA.length - pos; i++) {
            temp[i] = popA[i + pos];
        }

        for (int i = popA.length - pos, j = 0; i < popA.length; i++)
            temp[i] = popA[j++];

       return isEqual(pushA, temp);
    }

    public boolean isEqual(int[] a, int[] b ) {
        for (int i = 0; i < a.length; i++ )
            if (a[i] != b[i])
                return false;
        return true;
    }
}
