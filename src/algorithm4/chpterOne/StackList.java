package algorithm4.chpterOne;

/**
 * 链表实现栈
 * @param <T>
 */
public class StackList<T> {
    private Node<T> first;
    private int N;

    private class Node<T> {
        private T t;
        private Node<T> next;

        Node(T t) {
            this.t = t;
        }
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(T t) {
        Node oldFirst = first;
        Node first = new Node(t);
        first.next = oldFirst;
        N++;
    }

    public T pop() {
        T t  = first.t;
        first = first.next;
        N--;
        return t;
    }

    public static void main(String[] args) {

    }

}
