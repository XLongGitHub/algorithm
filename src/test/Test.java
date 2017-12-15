package test;

import java.util.ArrayList;

public class Test {
    ArrayList al = new ArrayList();
    public static void main(String[] args) {
        int[]a[] = new int[10][];
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
//        b3=(b1+b2);
//        System.out.println(b3+b6);
//        test();
        Test t2 = new Test();
    }

    public static Test t1 = new Test();
    {
        System.out.println("blockA");
    }
    static
    {
        System.out.println("blockB");
    }

    public static void add(Byte b)
    {
        b = b++;
    }
    public static void test()
    {
        Byte a = 127;
        Byte b = 127;
//        add(++a);
//        ++a;
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }
}
