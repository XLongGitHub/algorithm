package huawei3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 整型字符串排序
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String strPos = sc.nextLine();
//        int pos = Integer.parseInt(strPos);
        int pos = sc.nextInt();

        String[] strings = str.split(" ");
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        //位数数组
        int[] lastThree = new int[nums.length];
//        原数组索引
        int[] numIndex = new int[1000];
        for (int i = 0; i < numIndex.length; i++) {
            numIndex[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            lastThree[i] = nums[i] % 1000;
            if (numIndex[lastThree[i]] == -1) numIndex[lastThree[i]] = i; //记录位置
        }
        Arrays.sort(lastThree);
        int posNum = lastThree[pos - 1];
        int resultIndex = numIndex[posNum];
        int result = nums[resultIndex];
        System.out.println(result);



//        Map map = new HashMap();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(lastThree[i], nums[i]);
//        }
//        System.out.println(Arrays.toString(lastThree));
//        int result = (int) map.get(posNum);


        //********************************************
//        for (int i = 0; i < nums.length; i++) {
//            lastThree[i] = nums[i] % 1000;
//        }
//        Map map = new HashMap();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(lastThree[i], nums[i]);
//        }
//        Arrays.sort(lastThree);
//        int posNum = lastThree[pos - 1];
////        System.out.println(Arrays.toString(lastThree));
//        int result = (int) map.get(posNum);
//        System.out.println(result);
    }
}

//-1223 -22 -3232 -2016
//3