package algorithm4.chpterOne;

import edu.princeton.cs.algs4.StdOut;

public class testDelete {
	private Node first;
	private int N;

	public testDelete() {
		first = new Node(0);
		N = 0;
	}

	private class Node {
		int data;
		Node next;
		
		public Node() {}
		public Node(int data) {
			this.data = data;
		}
	}
	
	public int max() {
		Node head = first;
		if (head == null) return 0;
		int max = head.data;
		while(head != null) {
			if (head.data > max) 
				max = head.data;
			head = head.next;
		}
		return max;
	}
	
	public int size() {
		return N;
	}
	
	/**
	 * 保存�?后一个节点的前一个节点，令其next为null
	 */
	public void deleteTail() {
		Node head = first;
		Node secTail = null;
		if (head == null) return;
		//head.next = null;
		/*if (head.next == null) {
			first = null;
			return;
		} 
		if (head.next.next == null) {
			head.next = null;
		}*/
		while (head.next != null) {
			secTail = head;
			head = head.next;
		}
		secTail.next = null;
		/*StdOut.println(head == null);
		StdOut.println(head.data);
		head = null;
		StdOut.println(head == null);
		StdOut.println(head.data);*/
		
	}
	
	public void traverseList() {
		Node head = first;
		if (head == null) return;
		while(head!=null) {
			StdOut.print(head.data+" ");
			head = head.next;
		}
		StdOut.println();
	}
	
	public void delete(int pos) {
		if (pos > N)
			return;
		Node head = first;
		for (int i = 0; i < pos - 1; i++) {
			head = head.next;
		}
		head.next = head.next.next;
	}

	public void append(int data) {
		Node head = first;
		if (head == null) {
			head.data = data;
			return;
		}

		while (head.next != null) {
			head = head.next;
		}

		head.next = new Node();
	}

	public void insert(int pos, int data) {

	}
	
	private void createList() {
		Node p, q;
		p = first;
		q = new Node(1);
		p.next = q;
		p = q;
		q = new Node(2);
		p.next = q;
		p = q;
		q = new Node(3);
		p.next = q;
		p = q;
		q = new Node(12);
		p.next = q;
		p = q;
		q = new Node(4);
		p.next = q;
		p = q;
		q = new Node(5);
		p.next = q;
		p = q;
		q = new Node(6);
		p.next = q;
		p = q;
		q = new Node(7);
		p.next = q;
		p = q;
	}

	public static void main(String[] args) {
		testDelete td = new testDelete();
		td.createList();
		td.traverseList();
		td.deleteTail();
		td.traverseList();
		StdOut.println(td.max());
	}

}
