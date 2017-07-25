package algorithm4.other;
public class ClassString {
	public static boolean inPalindrome(String s) {
		int N = s.length();
		for (int i=0; i<N/2; i++) 
			if (s.charAt(i) != s.charAt(N-i-1))
				return false;
		return true;
	}
	
	public boolean isSorted(String[] a) {
		for (int i=1; i<a.length; i++) {
			if (a[i-1].compareTo(a[i])>0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
	}
}
