
import edu.princeton.cs.algs4.StdOut;

public class ResizingArrayQueueOfString {
	public static int cap = 5;   //队列容量
	public static int first = 0; //队首
	public static int last = 0;  //队尾
	public static int[] queue = new int[cap];  //定义实现队列的数组
	public static int  N = 0;   //队列中含有元素的数
	
	/**
	 * 为满时增加，小于一半时减小
	 * 注意不要对内容进行覆盖
	 */
	public static void resize() {
		if (isFull()) {
			int oldFirst = first;
			int oldLast = last;
			int pos = first;
			int oldCap = cap;
			cap *= 2;
			int[] newQueue = new int[cap];
			newQueue[pos++] = queue[first];
			first  = (first+1) % oldCap;
			
			while (first != last) {
				newQueue[pos++] = queue[first];
				first  = (first+1) % oldCap;
			}
			first = oldFirst;
			last = oldFirst + N;
			queue = newQueue;
		} else {
			if (N < cap / 2) {
				/*while (!isEmpty()) {
				newQueue[pos++] = dequeue();   //两两函数相互调用，导致错误
				}*/
				int oldFirst = first;
				int oldLast = last;
				int pos = 0;
				int oldCap = cap;
				cap /= 2;
				int[] newQueue = new int[cap];
				newQueue[pos++] = queue[first];
				first  = (first+1) % oldCap;
				
				while (first != last) {
					newQueue[pos++] = queue[first];
					first  = (first+1) % oldCap;
				}
				first = 0;
				last = N;
				queue = newQueue;
			}
		}
	}
	
	
	public int size() {
		return N;
	}
	
	public static boolean isEmpty() {
		return N == 0;
	}
	public static boolean isFull() {
		return N == cap;
	}
	public static void enqueue(int i) {
		//if (isFull()) return;
		if (isFull()) resize();
		queue[last] = i;
		last = (last +1) % cap;
		N++;
		
	}
	
	public static int dequeue() {
		if (isEmpty()) return -11111;
		else {
			if (N < cap / 2) resize();
			N--;
			int temp = first;
			first = (first + 1) % cap ;
			return queue[temp];
		}
	}
	
	
	public static void main(String[] args) {
		ResizingArrayQueueOfString aqs = new ResizingArrayQueueOfString();
		for (int i=1; i<50; i++) {
			ResizingArrayQueueOfString.enqueue(i);
		}
		/*ResizingArrayQueueOfString.enqueue(5);
		ResizingArrayQueueOfString.enqueue(6);
		ResizingArrayQueueOfString.enqueue(1);
		ResizingArrayQueueOfString.enqueue(2);
		ResizingArrayQueueOfString.enqueue(3);
		ResizingArrayQueueOfString.enqueue(3);
		ResizingArrayQueueOfString.enqueue(4);
		ResizingArrayQueueOfString.enqueue(7);
		ResizingArrayQueueOfString.enqueue(3);
		ResizingArrayQueueOfString.enqueue(4);
		ResizingArrayQueueOfString.enqueue(7);
		ResizingArrayQueueOfString.enqueue(3);
		ResizingArrayQueueOfString.enqueue(4);
		ResizingArrayQueueOfString.enqueue(7);
		ResizingArrayQueueOfString.enqueue(3);
		ResizingArrayQueueOfString.enqueue(4);
		ResizingArrayQueueOfString.enqueue(7);
		ResizingArrayQueueOfString.enqueue(4);
		ResizingArrayQueueOfString.enqueue(7);*/
	//	ResizingArrayQueueOfString.enqueue(8);
		
		StdOut.println("cap = " + new ResizingArrayQueueOfString().cap);
		/*StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());*/
		for (int i=1; i<40; i++) {
			ResizingArrayQueueOfString.dequeue();
		}
		StdOut.println("cap = " + new ResizingArrayQueueOfString().cap);
		/*ResizingArrayQueueOfString.enqueue(5);
		ResizingArrayQueueOfString.enqueue(6);
		StdOut.println(ResizingArrayQueueOfString.dequeue());
		StdOut.println(ResizingArrayQueueOfString.dequeue());*/
	}
	

}
