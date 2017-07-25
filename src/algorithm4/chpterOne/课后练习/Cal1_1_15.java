package algorithm4.chpterOne.课后练习;
/**
 * Created by Xulong on 2016/11/19.
 */
public class Cal1_1_15 {

  public static void main(String args[]) {
  	int a[] = {1, 3, 6, 7, 9, 2, 5};
	int M = 10;

	histogram(a, M);
  }

  public static void histogram(int a[], int M) {

	int arr[] = new int[M];

	/*for (int i=0; i<M; i++) {
		int count = 0;

		for(int j=0; j<M; j++) {
			if (a[j] == i) 
				count++;
		}

		arr[i] = count;
	}
*/
	/*for (int i=0; i<M; i++) {
		System.out.println(arr[i]);
	}*/
	  String s1 = "sdsfd";
	int len = s1.substring(0,1).length();
	  System.out.println(s1.substring(0,1));
	  System.out.println(s1.length());
	System.out.println(len);
	  char [] arr1 = s1.toCharArray();
	  System.out.println(arr1[4]);
  }



}
