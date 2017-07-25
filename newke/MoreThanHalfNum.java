
public class MoreThanHalfNum {
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,2,2,5,4,2};
		System.out.println(MoreThanHalfNum_Solution(arr));
	}

	public static int MoreThanHalfNum_Solution(int[] array) {
			int[] count = new int[11];
			
			for (int i=0; i<array.length; i++) {
				count[array[i]]++;
			}
			
			int j = 0;
			for (; j<count.length; j++) {
				//if(count[j] == 0) continue;
				if (count[j] > array.length/2)
					break;
			}
			if(j == 11) j = 0;
			return j;
	}
}
