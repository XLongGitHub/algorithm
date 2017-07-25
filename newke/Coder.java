package newke;
/*
链接：https://www.nowcoder.com/practice/a386fd3a5080435dad3252bac76950a7?tpId=49&tqId=29280&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
来源：牛客网

请设计一个高效算法，再给定的字符串数组中，找到包含"Coder"的字符串(不区分大小写)，并将其作为一个新的数组返回。结果字符串的顺序按照"Coder"出现的次数递减排列，若两个串中"Coder"出现的次数相同，则保持他们在原数组中的位置关系。
给定一个字符串数组A和它的大小n，请返回结果数组。保证原数组大小小于等于300,其中每个串的长度小于等于200。同时保证一定存在包含coder的字符串。
测试样例：
["i am a coder","Coder Coder","Code"],3
返回：["Coder Coder","i am a coder"]
*/

public class Coder {
	public static void main(String[] args) {
		String [] A = {"i am a coder","Coder Coder","Code"};
		String [] B = new String[A.length];
		
		B = findCoder(A, A.length);
		
		for (String str : B) 
			System.out.println(str);
 	}
	
	public static String[] findCoder(String[] A, int n) {
		String[] B = new String[A.length];
		int[] C = new int[A.length];
		
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<A[i].length()-5; j++) {
				if (A[i].substring(j, j+5).equalsIgnoreCase("coder")) {
					j += 5;
					C[i]++;
				}
			}
		}
		
		int max = 0;
		
		for (int i = 0; i < C.length; i++) {
			if (max < C[i])
				max = C[i];
		}
		int index = 0;
		
		for (int i = max; i >= 0; i--) {
			for (int j = 0; j < C.length; j++) {
				if (C[j] == i) {
					B[index++] = A[j];
				}
			}
		}
		
		return B;
	}
}
