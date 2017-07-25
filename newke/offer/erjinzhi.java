package newke.offer;

public class erjinzhi {
	
	public static void main(String []args ) {
		//shiToEr(8);
		System.out.println("\n"+rshiToEr(16807));
		System.out.println("\n"+rshiToEr(282475249));
		
		//System.out.println(countBitDiff(1999 ,2299));
	/*	
		System.out.println(rshiToEr(255));
		System.out.println(rshiToEr(39));
		System.out.println(rshiToEr(25));*/
		System.out.println(countBitDiff(16807,282475249));
		
	}
	   /**
     * ����������ζ����Ʊ��λ����ͬ������
     * 
     * @param m ����m
     * @param n ����n
     * @return ����
     */
    public static int countBitDiff(int m, int n) {
    	String s1 = rshiToEr(m);
    	String s2 = rshiToEr(n);
    	int count = 0;
    	if (s1.length()>s2.length()) {
    		for (int i=0; i<s2.length(); i++) {
    			if (s1.charAt(s1.length()-i-1) != s2.charAt(s2.length()-i-1))
    				count++;
    		}
    		count += s1.length() - s2.length();
    	} else {
    		for (int i=0; i<s1.length(); i++) {
    			if (s1.charAt(s1.length()-i-1) != s2.charAt(s2.length()-i-1))
    				count++;
    		}
    		count += s2.length() - s1.length();
    	}
    	return count;
    }
    
    public static void shiToEr(int m) {
    	if (0 == m/2) {
    		System.out.println(m%2); 
    	}
    	else {
    		System.out.println(m%2);
    		shiToEr(m/2);
    	}
    }
    
    public static String rshiToEr(int m) {
    	if (m/2 != 0 || m%2 != 0) {
	    	String s = "";
	    	
	    	if (0 == m/2) {
	    		s = s+m%2;
	    	} else {
	    		s =  s+m%2+rshiToEr(m/2);
	    	}
	    	return s;
    	} 
    	return ""+0;
    }

    
}
