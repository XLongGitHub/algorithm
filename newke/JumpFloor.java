import java.util.ArrayList;

public class JumpFloor {

	public static void main(String[] args) {
	}
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        int [] have = new int[k];
        //int [] input2 =  input;
        int [] input2 = new int[input.length];
        
        for(int i=0; i<input.length; i++) {
        	input2[i] = input[i];
        }
        
        for(int i=0; i<k; i++) {
            int min = input[i];
            for (int j=0; j<input.length; j++) {
                if ( min > input[j]) {
                    min = input[j];
                    have[i] = j;
                }
            }
            arrlist.add(input2[have[i]]);
            
            if (i<k-1) {
                input[have[i]] = 2034343;
            }
        }
        
        return arrlist;
    }
}
