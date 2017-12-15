//package leixin;
//
//import java.util.*;
//
//public class Main {
//    class Num {
//        public int val;
//        public int count;
//
//        public Num(int val, int count) {
//            this.val = val;
//            this.count = count;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] strings = input.split("-");
//        int[] nums = new int[(strings.length + 1) / 2];
//        int pos = 0;
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].equals("-")) continue;
//            nums[pos++] = Integer.parseInt(strings[i]);
//        }
//        Set set = new HashSet();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        int size = set.size();
//        int[] first = new int[size];
//        int[] second = new int[size];
//        int index = 0;
////        得到数组排序
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])) continue;
//            first[index++] = nums[i];
//        }
////
////        for (int j = )
//
//    }
//
//}
