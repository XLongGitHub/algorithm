package offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Xulong on 2017/4/20.
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
public class PopOrder {

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4, 5, 3, 2,1};
        PopOrder po = new PopOrder();
        System.out.println(po.IsPopOrder(pushA, popA));
    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayList<Integer> arrayList;
        if (pushA.length == 0) return false;
        if (pushA.length != popA.length) return false;

        for (int i = 0; i < popA.length; i++) {
            arrayList  = new ArrayList<Integer>();
            arrayList.add(popA[i]);
            for (int j = i; j < popA.length; j++) {
                if (popA[i] > popA[j])
                    arrayList.add(popA[j]);
            }
            if (!isSort(arrayList))
                return false;
        }
        Arrays.sort(pushA);
        Arrays.sort(popA);
        for (int i = 0; i < pushA.length; i++) {
            if (popA[i] != pushA[i])
                return false;
        }
        return true;
    }

    public static boolean isSort(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if ((int)arrayList.get(i) < (int)arrayList.get(i+1))
                return false;
        }
        return true;
    }
}
