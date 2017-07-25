package newke.offer;
import java.util.ArrayList;

public class GetLeastNumbers {

	public static void main(String[] args) {

	}
	public static ArrayList<Integer> GetLeastNumbers_Solution( int [] input, int k) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		if (k > input.length) return arraylist;
		
		for(int i=0; i<k; i++) {
			int k1 = i, temp;
			for (int j=i; j<input.length; j++) {
				if (input[k1] > input[j]) {
					k1 = j;
				}
/*				
				temp = input[k1];
				input[k1] = input[j];
				input[j] = temp;*/		
			}
			temp = input[k1];
			input[k1] = input[i];
			input[i] = temp;
		}
		
		for(int i=0; i<k; i++) {
			arraylist.add(input[i]);
		}
		
		return arraylist;
		
	}
}
