package offer;

/**
 * Created by Xulong on 2017/4/20.
 */
public class JumpFloor {
    public static void main(String[]args) {
        JumpFloor jf = new JumpFloor();
        int method = jf.JumpFloor(3);
        System.out.println(method);
    }

    public int JumpFloor(int number) {
        if (number <= 0 ) return 0;
        if (number == 1) return 1;
        if (number == 2) return 2;
        return JumpFloor(number - 1) + JumpFloor(number - 2);
    }

//    public int JumpFloor(int target) {
//        int[] arr = {0};
//        JumpFloor(target, arr);
//        return arr[0];
//    }
//
//    public void JumpFloor(int target, int[] arr) {
//        if (target <= 0) return;
//            arr[0]++;
//        JumpFloor(target - 1, arr);
//        JumpFloor(target - 2, arr);
//    }
}
