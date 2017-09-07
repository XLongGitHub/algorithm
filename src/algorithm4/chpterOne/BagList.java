package algorithm4.chpterOne;

import java.util.Iterator;

public class BagList<Item> implements Iterable {
    private Node first;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator<Item>();
    }

    private class Node<Item> {
        Item val;
        Node next;
    }

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.val = item;
        first.next = oldFirst;
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node current = first;   //建立自己的指针
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = (Item) current .val;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        BagList<String> bagList = new BagList<String>();
        String str = "hope is a good thing";
        String[] strs = str.split(" ");
        for (String string : strs) {
            bagList.add(string);
        }
        Iterator iterator = bagList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }

}
