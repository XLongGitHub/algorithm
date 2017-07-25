package algorithm4.chapterOne;

public class FixedCapacityStackOfStrings<Item> {
	/*public static final int N = 100;
	private String[] str = new String[N];
	*/
	
	private Item[] a;
	private int N = 0;
	
	public FixedCapacityStackOfStrings(int cap) {
		a = (Item[]) new Object[cap];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public boolean isFull() {
		return N == a.length;
	}
	
	public int size() {
		return N;
	}
	/**
	 * 利用目前的大小来确定新的位置
	 * @param item
	 */
	public void push(Item item) {
		if (N == a.length) resize(2*a.length);
		a[N++] = item;
	}
	
	public Item pop() {
		Item item = a[--N]; 
		a[N] = null;//避免对象游离
		if (N>0 && N == a.length / 4) resize(a.length / 2);
		return item;
	}

	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for (int i=0; i<N; i++)
			temp[i] = a[i];
		a = temp;
	}
	
	                                   
	
	public static void main(String[] args) {

	}

}
