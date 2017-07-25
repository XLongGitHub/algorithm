package algorithm4.chapterOne;

import edu.princeton.cs.algs4.StdOut;

public class CircularRotation {
	/*public static boolean circular(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		int len = s1.length();
		int pos = 0;
		char[] ss1 = s1.toCharArray();
		char[] ss2 = s2.toCharArray();
		
		for (int i=0; i<len; i++) {
			pos = i;
			for (int j=0; j<=len; j++) {
				if (j == len) 
					return true;
				
				if (ss1[pos++] != ss2[j])
					break;
				pos %= ss1.length;
			}
		}
		return false;
	}
	*/
	
	public static boolean circular(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		/*char c = s1.charAt(0);
		int pos = s1.indexOf(c);*/
		for (int pos=0; pos<s1.length(); pos++) {
			String ss1 = s1.substring(0, pos+1);
			String ss2 = s1.substring(pos+1, s1.length());
			String s3 = ss2.concat(ss1);
			if (s3.equals(s2))
				return true;
		}
		return false;
	}
	
	
	public static void mycontact(String s1) {
		char c = s1.charAt(0);
		for (int i=0; i<s1.length(); i++) {
			int pos = s1.indexOf(c);
			StdOut.println(pos);
		}
	}
	
	public static String mystery(String s) {
		int N = s.length();
		if (N<=1) return s;
		String a = s.substring(0, N/2);
		String b = s.substring(N/2,N);
		return mystery(b) + mystery(a);
	}
	public static void main(String[] args) {
		String s = "abcd";
		String t = "caeb";
		StdOut.println(circular(s, t));
		//mycontact("asdfgdaghfhfaahgfgdhgghsggjhdgjhfjahajahjh");
		
		StdOut.println(mystery("abds"));
		
	}
}
