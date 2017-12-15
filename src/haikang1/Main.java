package haikang1;

import java.util.Scanner;

/**
 * 公交车行驶时间计算
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String[] messages = message.split(",");
        int circle = Integer.parseInt(messages[0]);
        if (circle < 3)  {
            System.out.println("incorrect data");
        }  else {
            String[] starts = messages[1].split(" ");
            String[] ends = messages[2].split(" ");
//        一圈
            int circleTime = 45 * 60;
            int start = time(starts[1]);
            int end = time(ends[1]);
            if (start == -1 || end == -1) {
                System.out.println("incorrect data");
            } else {
                int circles = (end - start) / circleTime;  //计算圈数
                int other = (end - start) % circleTime;
                if (other == 0) {
                    System.out.println(circles + ";1-1");
                } else {
                    System.out.println((circles + 1) + ";" + pos(other));
                }

            }
        }
    }

    public static String pos(int other) {
        if (other >= 40 * 60) {
            return "1-1";
        } else if (other >= 30 * 60) {
            return "3-1";
        } else if (other >= 25 * 60) {
            return "3-3";
        } else if (other >= 15 * 60) {
            return "2-3";
        } else if (other >= 10 * 60) {
            return "2-2";
        } else {
            return "1-2";
        }
    }

    /**
     * 将时间化为秒
     * @param str
     * @return
     */
    public static int time(String str) {
        String[] strs = str.split(":");
        int[] times = new int[3];
        for (int i = 0; i < times.length; i++) {
            times[i] = Integer.parseInt(strs[i]);
        }

        if (isValidTime(times)) {
            int sum = times[0] * 60 * 60  + times[1] * 60 + times[2];
            return sum;
        } else {
            return -1;
        }
    }

    /**
     * 判断该时间是否合法
     * @param time
     * @return
     */
    public static boolean isValidTime(int[] time) {
        if (! (0 <= time[0] && time[0] < 23)) return false;
        if (! (0 <= time[1] && time[1] < 60)) return false;
        if (! (0 <= time[2] && time[2] < 60)) return false;
        return true;
    }
//    1;1-1
//    1;1-1
}
