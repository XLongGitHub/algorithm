package algorithm4.chpterOne;
/**
 * @author Xulong
 * 用数组来模拟栈
 */
public class FixedCapacityStackOfStrings<T> {
    private T[] strings;   //用数组模拟栈
    private int N;      //栈的深度
    private int pos;    //
    private int count;  //栈元素多少

    FixedCapacityStackOfStrings(int N) {
        this.N = N;
        this.pos = 0;
        this.count = 0;

//        strings = new T[N];
        strings = (T[]) new Object[N];
    }


    public boolean push(T string) {
        if ((count + 1) > N) return false;
        strings[count++] = string;
        return true;
    }

    public T pop() {
        if ( (count - 1) < 0) return null;
        T tmp = strings[count - 1];
        strings[count - 1] = null;
        count = count - 1;
        return tmp;
    }

    public T peek() {
        if (count - 1 < 0) return null;
        return strings[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings<Integer> fcsos = new FixedCapacityStackOfStrings(6);
        String str = "hope is a good thing . try your best";
        String[] strs = str.split(" ");
//        for (String string : strs) {
//            fcsos.push(string);
//        }
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : ints) {
            fcsos.push(i);
        }
        while (!fcsos.isEmpty()) {
            System.out.println(fcsos.pop());
        }
    }
}
