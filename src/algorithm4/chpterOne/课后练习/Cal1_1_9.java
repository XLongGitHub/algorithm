package algorithm4.chpterOne.课后练习;
/**
 * Created by Xulong on 2016/11/19.
 */
import java.util.Scanner;

public class Cal1_1_9 {
	
	public static void  print(Object o) {
		System.out.println(o);
	}

	public static void main(String args[]){
		String s="";
		Scanner sc = new Scanner(System.in);
		int n =	sc.nextInt();
		
		for ( ; n>0; n/=2) {
			s = n%2 + s;
		}
		print(s);
	}
}
