package huya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] dir = {"中国", "直播", "游戏", "游戏直播", "综艺娱乐", "互动直播平台"};
        String[] strings = string.split("");
        for (int i = 0; i < strings.length -1; i++) {
            String s = strings[i] + strings[i + 1];
            if (s.equals(dir[0]))
                System.out.print(dir[0]);
            if (s.equals(dir[1]))
                System.out.print(dir[1]);
            if (s.equals(dir[2]))
                System.out.print(dir[2]);
        }
    }
}
