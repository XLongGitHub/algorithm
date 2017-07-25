package toutiao;

import java.util.*;

/**
 * Created by Xulong on 2017/4/18.
 */
public class Main2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//      //  Set set = new HashSet();
//        Set set = new LinkedHashSet();
//        String str = "";
//        while (true) {
//            str = sc.nextLine();
//            if (str.equals("0")) break;
//            set.add(str);
//        }
//        System.out.print(set.size());
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map map = new HashMap();
        String str = "";
        while (true) {
            str = sc.nextLine();
            if (str.equals("0")) break;
          //  set.add(str);
            map.put(str, 1);
        }
        System.out.print(map.size());

    }
}
