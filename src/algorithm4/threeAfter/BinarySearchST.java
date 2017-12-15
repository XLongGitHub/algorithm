package algorithm4.threeAfter;


import edu.princeton.cs.algs4.Queue;

/**
 * 二分查找，基于有序数组
 * @param <Key>
 * @param <Value>
 */
public class BinarySearchST<Key extends Comparable<Key>, Value> {
    private Key[] keys;
    private Value[] values;
    private int N;

    public BinarySearchST(int capacity) {
        keys = (Key[]) new Comparable[capacity];
        values = (Value[]) new Object[capacity];
    }

    public int size() {
        return N;
    }

    public Value get(Key key) {
        if (isEmpty()) return null;
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) return values[i];
        else  return  null;
    }

    private boolean isEmpty() {
        return N == 0;
    }

    /**
     * 返回元素位置
     * @param key
     * @return
     */
    public int rank(Key key) {
        int lo = 0, hi = N - 1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (keys[mid].compareTo(key) < 0) lo = mid + 1;
            else if (keys[mid].compareTo(key) > 0) hi = mid - 1;
            else return mid;
        }
//        return -1;
        return lo;
    }

    public void put(Key key, Value value) {
        int i = rank(key);
        if (i < N && keys[i].compareTo(key) == 0) {
            values[i] = value;
            return;
        }
        for (int j = N; j > i; j--) {
            keys[j] = keys[j - 1];
            values[j] = values[j - 1];
        }
        keys[i] = key;
        values[i] = value;
        N++;
    }

    public void delete(Key key) {
        int i = rank(key);
        if (i >= N || keys[i].compareTo(key) != 0) return; //不存在这个键
        //删除该键，后面的键前移
        if (i < N && keys[i].compareTo(key) == 0) {
            for (int j = i + 1; j < N; j++) {
                keys[j - 1] = keys[j];
                values[j - 1] = values[j];
            }
        }
    }

    public Key min() {
        return keys[0];
    }

    public Key max() {
        return keys[N - 1];
    }

    public Key select(int k) {
        return keys[k];
    }

    /**
     * 存在返回，不存在取附近
     * @param key
     * @return
     */
    public Key ceiling(Key key) {
        int i = rank(key);
        return keys[i];
    }
    public void show() {
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i] + "  " + values[i]);
        }
        System.out.println("end");
    }

//    public Iterable<Key> keys(Key lo, Key hi) {
//        Queue<Key> q = new Queue<Key>();
//        for (int i = rank(lo); i < rank(hi); i++)
//            q.enqueue(keys[i]);
//        if (contains(hi)) {
//            q.enqueue(keys[rank([hi])]);
//        }
//        return q;
//    }

    public static void main(String[] args) {
        BinarySearchST<String, Integer> bs = new BinarySearchST<String, Integer>(6);
        String[] strings = {"one", "two", "three", "four", "five", "six"};
        for (int i = 0; i < strings.length; i++)
            bs.put(strings[i], i);
        System.out.println("start");
//        for (int i= 0 ; i < strings.length; i++) {
        bs.show();
    }
}
