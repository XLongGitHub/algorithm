package newke.offer;
/*
���ӣ�https://www.nowcoder.com/practice/a386fd3a5080435dad3252bac76950a7?tpId=49&tqId=29280&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
��Դ��ţ����

�����һ����Ч�㷨���ٸ������ַ��������У��ҵ�����"Coder"���ַ���(�����ִ�Сд)����������Ϊһ���µ����鷵�ء�����ַ�����˳����"Coder"���ֵĴ����ݼ����У�����������"Coder"���ֵĴ�����ͬ���򱣳�������ԭ�����е�λ�ù�ϵ��
����һ���ַ�������A�����Ĵ�Сn���뷵�ؽ�����顣��֤ԭ�����СС�ڵ���300,����ÿ�����ĳ���С�ڵ���200��ͬʱ��֤һ�����ڰ���coder���ַ�����
����������
["i am a coder","Coder Coder","Code"],3
���أ�["Coder Coder","i am a coder"]
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
