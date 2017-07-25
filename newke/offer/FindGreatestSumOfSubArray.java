package newke.offer;

/**
 * Created by Xulong on 2017/3/25.
 * 连续子数组的最大和
 */
public class FindGreatestSumOfSubArray {

    public static void main(String[] args) {
        FindGreatestSumOfSubArray fgss = new FindGreatestSumOfSubArray();
        int[] array = {6, -3, -2,43,  7, -15, 1, 2, 2};
         int max = fgss.FindGreatestSumOfSubArray(array);
         System.out.println(max);
    }

    public int FindGreatestSumOfSubArray(int[] array) {
        // 数组元素全为负或0，直接返回其中的最大值
        if (isLow(array)) return maxInArr(array);
        //数组元素全为正或0，返回数组元素和
        if (isUp(array)) return sumArr(array);

        //构造一个临时数组，将数组中的连续的符号相同的元素合并，并将值存入临时数组当中
        int[] arr  =  new int[array.length];
        int p1 = 0;
        int p2 = 0;
        //去除数组开头为负的元素
        while (array[p1++] < 0);
        p1 -=  1;
        //构建临时数组
        for (int i = p1; i < array.length; i++) {
            if (array[i]>0) {
                arr[p2] += array[i];
            } else {
                arr[p2] += array[i];
            }
            if ((i+1) < array.length && ((array[i] > 0 && array[i+1] <0) || array[i] < 0 && array[i+1] > 0))
                p2++;
        }
        //当数组中只有一正一负两个元素时，返回第一个元素
        if (p2 == 2) return arr[0];

        return findMax(arr); //三个元素为一个基本组，进行遍历判断
    }
    //数组元素是否为负
    public boolean isLow (int [] arr) {
        for (int i : arr)
            if (i > 0)
                return false;
        return true;
    }
    //数组元素否全为正
    public boolean isUp (int[] arr) {
        for (int i : arr)
            if ( i < 0 )
                return false;
        return true;
    }

    public void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
        System.out.println();
    }
    //返回数组中，按规则进行判断后得到的最大值
    public int findMax(int[] arr) {
        int max = arr[0];
        int maxs[]  = new int[4];
        for (int i = 0; i < arr.length-3; i++) {
            maxs[0] = arr[i];
            maxs[1] = arr[i+1];
            maxs[2] = arr[i+2];
            maxs[3] = arr[i] + arr[i+1] + arr[i+2];

            if (max < maxInArr(maxs))
                max = maxInArr(maxs);
        }

        return max;
    }
    //数组中的最大元素，用于数组元素全为负时
    public int maxInArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (max < arr[i]) max = arr[i];
        return max;
    }
    //数组元素全为正
    public int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }
}
