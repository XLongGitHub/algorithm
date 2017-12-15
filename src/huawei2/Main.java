package huawei2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * IP是否覆盖
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String ip1 = sc.nextLine();
        String ip2 = sc.nextLine();
        String ip3 = sc.nextLine();
        String ip4 = sc.nextLine();
        String[] ip1s = ip1.split(".");
        String[] ip2s = ip2.split(".");
        String[] ip3s = ip3.split(".");
        String[] ip4s = ip4.split(".");
        for (int i = 0; i < ip1s.length; i+=2) {
            if (!isOver(Integer.parseInt(ip1s[i]), Integer.parseInt(ip2s[i]), Integer.parseInt(ip3s[i]), Integer.parseInt(ip4s[i]))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Overlap IP");
        } else {
            System.out.println("No Overlap IP");
        }
    }

    /**
     * 判断是否相交
     * @param ip1
     * @param ip2
     * @param ip3
     * @param ip4
     * @return
     */
    public static boolean isOver(int ip1, int ip2, int ip3, int ip4) {
        int[] first = {ip1, ip2};
        int[] second = {ip3, ip4};
        Arrays.sort(first);
        Arrays.sort(second);
//        if (first[0] > second[1]) return false;
//        if (first[1] < second[0]) return false;
//        return true;
        if (first[0] <= second[0] && first[1] >= second[0]) return true;
        if (first[0] <= second[1] && first[1] >= second[1]) return true;
        return false;
    }
}
