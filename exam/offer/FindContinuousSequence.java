package offer;

import java.util.ArrayList;

/**
 * Created by Xulong on 2017/4/4.
 */
public class FindContinuousSequence {
    public static void main(String[] args) {
        FindContinuousSequence fsc = new FindContinuousSequence();
        ArrayList<ArrayList<Integer>> arrayLists = fsc.FindContinuousSequence(4);
        for (ArrayList arrayList : arrayLists) {
            if (arrayList == null) continue;
            for (Object num : arrayList) {
                System.out.print((int) num + "  ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence ( int sum){
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
        if (sum < 2) return arrayLists;
        for (int i = sum; i > 1; i--) {
//            if (arrayLists.contains(findCS(sum, i)))
//                continue;
            ArrayList temp = findCS(sum, i);
            if (temp.size() == 0) continue;
            arrayLists.add(temp);
        }
//        if (arrayLists.contains(new ArrayList<>()))
//            arrayLists.remove(new ArrayList<>());
        return arrayLists;
    }

    public ArrayList<Integer> findCS ( int sum, int num){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (sum < 3) return arrayList;
//        if (sum == 3 && num == 2) {
//            arrayList.add(1);
//            arrayList.add(2);
//            return arrayList;
//        }
//        if (sum == 4 && num == 2) {  return arrayList; }
//        if (sum % 2 == 1 && num % 2 == 0) return arrayList; //奇数拆成偶数位
//        if (sum % 2 == 0 && num % 2 == 1) return arrayList; //偶数拆成奇数位
        int[] nums = new int[num];
        int ave = sum / num;
//        if (sum % 2 == 1) {
//            if (num % 2 == 1) {
//                if (ave - num / 2 <= 0) return arrayList;
//                for (int i = 0; i < num; i++) {
//                    nums[i] = ave - num / 2 + i;
//                    arrayList.add(nums[i]);
//                }
//            }
//            if (num == 2) {
//                arrayList.add(sum / 2);
//                arrayList.add(sum / 2 + 1);
//                return arrayList;
//            }
//        } else {
            if (num % 2 == 1) {
                if (ave - num / 2 <= 0) return arrayList;
                for (int i = 0; i < num; i++) {
                    nums[i] = ave - num / 2 + i;
                }
                if (sum(nums) == sum) {
                    for (int i = 0; i < num; i++) {
                        arrayList.add(nums[i]);
                    }
                }

            } else {
                if (ave - num / 2 + 1 <= 0) return arrayList;
                for (int i = 0; i < num; i++) {
                    nums[i] = ave - num / 2 + i + 1;
                }
                if (sum(nums) == sum) {
                    for (int i = 0; i < num; i++) {
                        arrayList.add(nums[i]);
                    }
                }
            }
//        }

        return arrayList;
    }

    public int sum(int[] a ) {
        int sum = 0;
        for (int i : a)
            sum += i;
        return sum;
    }
}
