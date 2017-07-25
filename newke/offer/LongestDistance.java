package newke.offer;
/*
��һ����Ϊn������A��������0��a��b<n��A[b]-A[a]�����ֵ��
��������A�����Ĵ�Сn���뷵������ֵ��
����������
[10,5],2
���أ�0
*/

public class LongestDistance {
	public static void main(String[] args) {
		 int[] A = {10, 5 };
		 System.out.println(new LongestDistance().getDis(A, A.length));
	}
	
	public int getDis(int[] A, int n) {
		/*int min = A[0];
		int minIndex = 0;
		int max = A[0];
		int maxIndex = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (min > A[i]) {
				min = A[i];
				minIndex = i;
			}
			if (max < A[i]) {
				max = A[i];
				maxIndex = i;
			}
		}
		
		if ( min >= max )
			return 0;
		*/
		
		/*int min = A[0];
		int max = A[0];
		int minIndex = 0; 
		int maxIndex = 0;
		
		int num = 0;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				if (num < A[j] - A[i])
					num = A[j] - A[i];
			}
		}
		
		return num;*/
		
		int i = 0 , j = 0;
		int num = 0;
		int index = i;
		
		for (i = 0; i <  A.length; i++) {
			/*index = i;
			while (i < j) {
				
				if ( ((index+1) < j)    && (A[index] > A[index++]))
					i++;
			}*/
			
			/*  lead to error
			 * if (((i+1)<A.length) && (A[i] < A[i+1]))
				continue;*/
			for (j = i; j < A.length; j++)  {
				if (num < A[j] - A[i])
					num = A[j] - A[i];
			}
		}
		return num;
		
	}
}
