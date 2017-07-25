package newke;

/*
链接：https://www.nowcoder.com/practice/dab59997905b4459a42587fece8a75f4?tpId=49&tqId=29279&tPage=1&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
来源：牛客网

对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。
给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。保证字符串中有重复字符，字符串的长度小于等于500。
测试样例：
"qywyer23tdd",11
返回：y
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
