package exam37;

public class Three {
	
	 public int RectCover(int target) {
			if (target <= 1) {
	            return 1;
	        } else if (target == 2) {
	            return 1;
	        } else {
	            return RectCover(target-1) + RectCover(target-2);
	        }
	 }
	 
	public static void main(String[] args) {
		Three th = new Three();
		th.db(4, 0, 3, 0);
	}
	//A - 0 ; B - 1 
	public int db(int A, int B, int K, int count) {
		if (A == 0) 
			return 1;
		if (A > K) {
			A = A - K;
			B = B + K;
		} if (A < K) {
			A = K - A;
			B = B + K - A;
		} 
		count++;
		System.out.println(count);
		return count + db(A, B, K, count);
		
	}
}
