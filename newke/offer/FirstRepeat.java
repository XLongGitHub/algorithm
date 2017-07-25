package newke.offer;

/*
���ӣ�https://www.nowcoder.com/practice/dab59997905b4459a42587fece8a75f4?tpId=49&tqId=29279&tPage=1&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
��Դ��ţ����

����һ���ַ����������һ����Ч�㷨���ҵ���һ���ظ����ֵ��ַ���
����һ���ַ���(��һ��ȫΪ��ĸ)A�����ĳ���n���뷵�ص�һ���ظ����ֵ��ַ�����֤�ַ��������ظ��ַ����ַ����ĳ���С�ڵ���500��
����������
"qywyer23tdd",11
���أ�y
*/
public class FirstRepeat {
	public static void main(String[] args) {
		int a = 0;
		char ch = 'a';
		a = ch;
		a = '9';
		System.out.println(a);
		int n = 11;
		String str = "qywyer23td";
		System.out.println(new FirstRepeat().findFirstRepeat(str, n));
	}
	
	public char findFirstRepeat(String A, int n) {
		char[] str = A.toCharArray();
		int [] rep = new int[123];
		
		for (int i=0; i<rep.length; i++) 
			rep[i] = 0;
		
		for (int i=0; i<str.length; i++) {
			if (str[i] < '9')
				continue;
			if (++rep[str[i]] == 2)
				return str[i];
		}
		return ' ';
	}
}
