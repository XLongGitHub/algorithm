package exam37;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Second second = new Second();
		int[] ans = new int[100]; 
		for (int i = 0; i < ans.length; i++)
			ans[i] = 0;
		
		int N = 0;
		int L = 0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		L = sc.nextInt();
//		System.out.println(N);
//		System.out.println(L);
		
		ans = second.find(N, L);
		if (ans[0] != -1) {
			for (int i = 0; i < 100; i++) {
				if (ans[i]  == 0)
					break;
				System.out.print(ans[i] +" ");
			}
		} else {
			System.out.print("No");	
		}
		
	}
	
	public int[]  find(int N, int L) {
		int[] ans = new int[100];
		for (int i = 0; i < ans.length; i++)
			ans[i] = 0;
		int index = 0;
		for (int i = L ; i <= 100; i++) {
			if (i == 2) i++; 
			
			if (i % 2 != 0) {
				int a = N / i;
				if (a - i / 2 <= 0)
					break;
				for (int j = a - i/2; j <= a+i/2; j++) {
					ans[index++] = j;
				}
				return ans;
			} else {
				int a = N / i;
				if (a - i / 2 +1 <= 0) break;
				for (int j = a - i/2+1; j <= a+i/2; j++) {
					ans[index++] = j;
				}
				return ans;
			}
		}
		ans[0] = -1;
		return ans;
	}
	
	
}
