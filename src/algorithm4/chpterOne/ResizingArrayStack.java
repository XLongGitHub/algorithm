package algorithm4.chpterOne;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {
    public Item[] items = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        if (N == items.length) resize(2 * items.length);
        items[N++] = item;
    }

    public Item pop() {
        Item item = items[--N];
        items[N] = null; //清除游离元素
        if (N > 0 && N == items.length / 4) resize(items.length / 2);
        return item;
    }

    public void resize(int length) {
        Item[] newItems = (Item[]) new Object[length];
        for (int i = 0; i < N; i++) {
            newItems[i] = items[i];
        }

        items = newItems;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return items[--i];
        }
    }

    public static void main(String[] args) {
        ResizingArrayStack ras = new ResizingArrayStack<Integer>();

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : ints) {
            ras.push(i);
        }
        while (!ras.isEmpty()) {
            System.out.println(ras.pop());
        }
    }
}
