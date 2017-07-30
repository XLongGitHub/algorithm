package exam.baidu;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/27.
 */

class Node {
    String color;
    int x;
    int y;
    int z;

    public Node(String color, int x, int y, int z) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class Main2 {
    public static int[] xyz;
    public static String[] rgb;
    public static Node[] nodes;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        xyz = new int[3*N];
        rgb = new String[N];
        String line = "";
        String[] strings;

        for (int i = 0; i < N; i++) {
            line = sc.nextLine();
            strings = line.split(" ");
            rgb[i] =  strings[0];
            xyz[ 3 * i] = Integer.parseInt(strings[1]);
            xyz[3 * i + 1] = Integer.parseInt(strings[2]);
            xyz[3 * i + 2] = Integer.parseInt(strings[3]);
            nodes[i] = new Node(rgb[0], xyz[3 * i], xyz[3*i+1], xyz[3*i+2]);
        }
    }

//    public static double squre(Node n1, Node n2, Node n3) {
//
//    }
}
