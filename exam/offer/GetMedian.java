package offer;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by Xulong on 2017/4/19.
 */
public class GetMedian {
    private ArrayList list;

    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {

        int[] ints = new int[list.size()];
        int len = ints.length;
        if (len == 0) return 0.0;
        for (int i = 0; i < ints.length; i++)
            ints[i] = (int)list.get(i);
        Arrays.sort(ints);
        if (len % 2 == 1) {
            return (double)ints[len % 2];
        } else {
            return (double)(ints[len] + ints[len - 1]) / 2;
        }

    }

}
