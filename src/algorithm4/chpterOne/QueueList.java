package algorithm4.chpterOne;

public class QueueList<T> {
    private Node first;
    private Node last;
    private int N;

    private class Node<T> {
        public T val;
        public Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    /**
     * 入队
     * @param t
     */
    public void enqueue(T t) {
        Node oldLast = last;
        last = new Node();
        last.val = t;
        last.next = null;
        N++;
        //队列为空
        if (isEmpty()) first = last;
        else oldLast.next = last;
    }

    /**
     * 出队
     * @return
     */
    public T dequeue()  {
        Node oldFrist = first;
        if (isEmpty()) return null;
        N--;
        first = first.next;
        if (isEmpty()) last = null;  //只有一个节点
        return (T)oldFrist.val;
    }

    public static void main(String[] args) {
        QueueList ql = new QueueList();
        String string = "hope is a good thing";
        String[] strings = string.split(" ");
        for (String str : strings)
            ql.enqueue(str);
        while (!ql.isEmpty())
            System.out.println(ql.dequeue());
    }

}
