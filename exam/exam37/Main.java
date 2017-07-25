package exam.exam37;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		Main first = new Main();
//		int[] ans = new int[2];
//		ans[0] = 0;
//		ans[1] = 1;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = first.ans(num);
		if (ans == -1) {
			System.out.println("No");
		} else {
			int count = 0;
			int sum = 1;
			for (int i = 0; i < num; i++) {
				sum *= ans;
				count ++;
				if (sum == num)
					break;
			}
			
			System.out.println(ans+" "+count);	
		}
	}
	
	
	public int ans(int num) {
//				int[] ans = new int[2];
//				ans[0] = 0;
//				ans[1] = 1;
		int lone = 0;
				int num1 = (int) Math.sqrt(num);
				
				for (int i = 2; i <= num1; i++) {
					
					if (!isLone(i)) continue;
					int sum = 1;
					int count = 0;
					
					while (sum < num) {
						sum *= i;
						count++;
						if (sum == num) {
//							ans[0] = i;
//							ans[1] = count;
							lone = i;
							return i;
						}
					}
				}
//				ans[0] = -1;
//				ans[1] = -1;
				return -1;
			}
	
//	public int[] ans(int num) {
//
//		int[] ans = new int[2];
//		ans[0] = 0;
//		ans[1] = 1;
//		int num1 = (int) Math.sqrt(num);
//		
//		for (int i = 2; i <= num1; i++) {
//			
//			if (!isLone(i)) continue;
//			int sum = 1;
//			int count = 0;
//			
//			while (sum < num) {
//				sum *= i;
//				count++;
//				if (sum == num) {
//					ans[0] = i;
//					ans[1] = count;
//					return ans;
//				}
//			}
//		}
//		ans[0] = -1;
//		ans[1] = -1;
//		return ans;
//	}
	
	public boolean isLone(int num) {
		
		int a = (int) Math.sqrt(num);
		
		for (int i = 2; i <= a ; i++) {
			int c = num / i;
			if (c * i == num)
				return false;
		}
		return true;
	}

}
