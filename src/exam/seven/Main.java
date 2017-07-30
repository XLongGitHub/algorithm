package exam.seven;

import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int len = str.length();
		if (len <= 1) 
			System.out.println(0);
		if (len % 2 == 1) {
			str = str.substring(0, len - 1);
			len = len - 1;
		}
		
		for (int i = len / 2 + 1; i > 0; i-- ) {
			if (str.charAt(0) == str.charAt(i))
				continue;
				
		}
		
		
	}


}
