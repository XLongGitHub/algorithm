package leetcode;

import java.util.*;

/**
 * Date 2017/12/18
 */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        if (candidates == null || candidates.length == 0) return result;
        Arrays.sort(candidates);
        findNum(candidates, target, 0, new ArrayList(), result, 0);
        return result;
    }

    public void findNum(int[] candidates, int target, int sum, List list, List<List<Integer>> lists, int pos) {
        if (sum > target) return;
        if (sum == target) {
            lists.add(new ArrayList(list));
            return;
        }
        for (int i = pos; i < candidates.length; i++) {
                List tmpList = new ArrayList(list);
                int num = sum + candidates[i];
                tmpList.add(candidates[i]);
                findNum(candidates, target, num, tmpList, lists, i);
                tmpList.remove(tmpList.size() - 1); //失败，移除最后一项数据
        }
    }

    class ListSort implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof List && o2 instanceof List) {
                if (((List) o1).size() > ((List) o2).size()) {
                    return -1;
                } else if (((List) o1).size() > ((List) o2).size()) {
                    return 0;
                } else {
                    return 1;
                }
            }
            return 0;
        }
    }


    public boolean isEqualList(List list1, List list2) {
        if (list1.size() != list2.size()) return false;
        int len = list1.size();
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = (int)list1.get(i);
            arr2[i] = (int)list2.get(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 7;
        CombinationSum cs = new CombinationSum();
        cs.combinationSum(candidates, target);
    }


}