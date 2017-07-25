package algorithm4.chpaterThree;

import java.util.HashMap;
import java.util.Map;

import edu.princeton.cs.algs4.StdOut;

public class Hash {
	public static void main(String [] args) {
		String str = "abc";
		Map map = new HashMap<>();
		
		int hash = 0;
//		for (int i = 0; i < str.length(); i++)
//			hash = (R * hash + str.charAt(i)) % M;
		StdOut.print(str.hashCode()+ "dfd");
	}
}
