package leetcode;

public class MultiplyStrings {

    public  String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();

        int[] arr1 = strToNum(num1);
        int[] arr2 = strToNum(num2);
        //存放计算结果
        int[] mul = new int[len1 + len2 + 1];
        // 存放临时计算结果
        int[] tmp = new int[len1 + 1];
        int[] two = new int[2];

        for (int i =  len2 - 1; i >= 0; i-- ) {
//            每次移动一位时，清空数组
            for (int k = 0; k < tmp.length; k++) {
                tmp[k] = 0;
            }
            for (int j = len1 - 1; j >= 0; j--) {
                int mulNum  =  arr1[j] * arr2[i];
                two[0] = mulNum / 10;
                two[1] = mulNum % 10;
                tmp[j + 1] += two[1];
                tmp[j] = two[0];
            }

            // mul[len1 + len2 - i - j] += 
            // 得到第二个数中的一位乘第一个数的结果
            for (int k = len1; k >= 0; k--) {
                mul[i + k + 1] += tmp[k];
            }
        }
//        String s = new String(mul);
        StringBuilder sb = new StringBuilder();
        int pos = 1;
        if (mul[1] == 0) pos++;
        for (; pos < mul.length; pos++) {
            sb.append(mul[pos]);
        }
        String s = sb.toString();
//        System.out.println(s);
        return s;
    }

    /**
     * 
     */
    public int[] strToNum(String str) {
        int len = str.length();
        int[] nums = new int[len];
        for(int i = 0; i < len; i++) {
            nums[i] = str.charAt(i) - '0';
        }
        return nums;
    } 

    public static void main(String[] args) {
//        System.out.println("start");
        MultiplyStrings ms = new MultiplyStrings();
        String s1 = "5";
        String s2 = "5";
        String s = ms.multiply(s1, s2);
        System.out.println(s);
    }
}