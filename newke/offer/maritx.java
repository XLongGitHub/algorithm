package newke.offer;
import java.util.ArrayList;
import java.util.Iterator;

public class maritx {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int [][] matrix1 = {{1,2},{3,4}};
		
		int [][] matrix2 = {{1},{2},{3},{4},{5}};
		int [][] matrix3 = {{1,2},{3,4},{5,6},{7,8},{9,10}};
		
		System.out.println(matrix3.length);
		System.out.println(matrix3[0].length+"dfd");
		
		//int[][] matrix = {1,2,3,4;5,6,7,8,9,10,11,12;13,14,15,16};
		//ArrayList<Integer> arrlist = new maritx().printMatrix(matrix1);
		ArrayList<Integer> arrlist = new maritx().printMatrix(matrix3);
		/*Iterator<Integer> ll = arrlist.iterator();
		while (ll.hasNext()) 
			System.out.println(ll.next().toString());*/
		for (int i=0; i<arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
	}

	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        int width = matrix[0].length;
	        int length = matrix.length;
	        
	        //int[][] matrix2 = new int[width][length];
	        int[][] matrix2 = new int[length][width];
	        int row = 0;
	        int clo = 0;
	        
	        if (width == 1 && length == 1)  {
	              arrlist.add(matrix[0][0]);
	              return arrlist;
	        }
	        
	        if (length == 1 && width != 1) {
	        	for (int i=0; i<width; i++) {
	        		arrlist.add(matrix[0][i]);
	        	}
	        	return arrlist;
	        }
	        
	        if (width == 1 && length != 1) {
	        	for (int i=0; i<length; i++)
	        	arrlist.add(matrix[i][0]);
	              return arrlist;
	        }
	        
	        
	        
	        
	        for (int i=0; i<length; i++) {
	            for (int j=0; j<width; j++) {
	                matrix2[i][j] = 0;
	            }
	        }
	        
	        while(arrlist.size() < width * length) {
	           for ( ; matrix2[row][clo] == 0 ; clo++) {
	               arrlist.add(matrix[row][clo]);
	               matrix2[row][clo] = 1;
	               if (clo == width-1) {
	            	   clo++;
	            	   break;
	               }
	           }
	           clo--;
	           row++;
	           
	           for (; matrix2[row][clo] == 0; row++) {
	        	   arrlist.add(matrix[row][clo]);
	        	   matrix2[row][clo] = 1;
	        	   if (row == length-1) {
	        		   row++;
	        		   break;
	        	   }
	        		   
	           }
	           row--;
	           clo--;
	           for (; matrix2[row][clo] == 0; clo--) {
	        	   arrlist.add(matrix[row][clo]);
	        	   matrix2[row][clo] = 1;
	        	   if (clo == 0) {
	        		   clo--;
	        		   break;
	        	   }
	           }
	           clo++;
	           row--;	           
	           for (; matrix2[row][clo] == 0; row--) {
	        	  // arrlist.add(matrix[clo][row]);
	        	   arrlist.add(matrix[row][clo]);
	        	   matrix2[row][clo] = 1;
	           }
	           row++;
	           clo++;
	        }
	        
		return arrlist;
	}
}
