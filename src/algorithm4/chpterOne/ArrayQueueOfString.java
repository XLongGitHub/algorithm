package algorithm4.chpterOne;

import edu.princeton.cs.algs4.StdOut;

public class ArrayQueueOfString {
	public static int cap = 5;   //队列容量
	public static int first = 0; //队首
	public static int last = 0;  //队尾
	public static int[] queue = new int[cap];  //定义实现队列的数�?
	public static int  N = 0;   //队列中含有元素的个数
	/**
	 * 返回当前队列中含有元素个�?
	 * @return
	 */
	public int size() {
		return N;
	}
	
	public void resize() {
		
	}
	
	public static boolean isEmpty() {
		return N == 0;
	}
	
	public static boolean isFull() {
		return N == cap;
	}
	/**
	 * 入队
	 * @param i
	 */
	public static void enqueue(int i) {
		if (isFull()) return;
		queue[last] = i;
		last = (last +1) % cap;
		N++;
		
	}
	/**
	 * 出队
	 * @return
	 */
	public static int dequeue() {
		if (isEmpty()) return -11111;
		else {
			N--;
			int temp = first;
			first = (first + 1) % cap ;
			return queue[temp];
		}
	}
	
	
	public static void main(String[] args) {
		ArrayQueueOfString aqs = new ArrayQueueOfString();
		ArrayQueueOfString.enqueue(5);
		StdOut.println(ArrayQueueOfString.dequeue());
	}
	
	

}
