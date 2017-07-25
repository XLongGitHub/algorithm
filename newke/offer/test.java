package newke.offer;

public class test {
	public static void main(String [] args) {
		String i1 ="10001111010111000110101100001";
		String i2 =              "111001011000001";
		
		System.out.println(i1.length());
		System.out.println(i2.length());
		int sum1 = 0;
		int sum2 = 0;
		for (int i=0; i<i1.length(); i++) {
			int temp = Integer.parseInt(i1.charAt(i)+"");
			sum1 += temp * Math.pow(2, i);
		}
		for (int i=0; i<i2.length(); i++) {
			int temp = Integer.parseInt(i2.charAt(i)+"");
			sum2 += temp * Math.pow(2, i);
		}
		//2147483647
		System.out.println(sum1);
		System.out.println(sum2);
		//int i = 282475249;
	}
}
