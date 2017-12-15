package exam.test;

class Parent {
    static {
        System.out.print("1");
    }

    {
        System.out.print("2");
    }

    public Parent() {
        System.out.print("3");
    }

}

class Son extends Parent{
    static {
        System.out.print("4");
    }

    {
        System.out.print("5");
    }

    public Son() {
        System.out.print("6");
    }
}
public class ExecuteStatic {

    {
        System.out.print(8);
    }


    static  {
        System.out.print(9);
    }
    public static void main(String[] args) {
        Parent p = new Son();
        System.out.print("7");
    }
}