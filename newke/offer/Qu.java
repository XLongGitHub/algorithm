package newke.offer;
import java.util.Scanner;

public class Qu {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Student[] students = new Student[N];
		char operator = 'U';
		int A = 0;
		int B = 0;
		
		for (int i=0; i<N; i++) {
			students[i].num = i+1;
		}
		
		for (int i=0; i<N; i++) {
			students[i].score = sc.nextInt();
		}
		
		while(M>0) {
			M--;
			operator = sc.nextLine().charAt(0);
			A = sc.nextInt();
			B = sc.nextInt();
			
			if (operator == 'Q') {
				if (A>B) {
					int tem = A;
					A = B;
					B = tem;
				}
				int max = 0;
				while(B>A) {
					if (max < students[A].score) {
						max = students[A].score;
						A++;
					}
				}
			} else {
				if (A>B) return;
				int temp;
				 temp = students[A].score;
				 students[A].score = students[B].score;
				 students[B].score = temp;
			}
		}
		
		
		
	}
	
	/*public  int q(int A, int B) {
		if (A>B) {
			int tem = A;
			A = B;
			B = tem;
		}
		int max = 0;
		while(B>A) {
			if (max < students[A]) {
				max = students[A];
				A++;
			}
		}
		return studnets[A].num;
	}*/
	
	
	/*public void u(int A, int B) {
		if (A>B) return;
		int temp;
		 temp = students[A];
		 students[A] = students[B];
		 students[B] = temp;
		
	}
	*/
	private class Student {
		int num;
		int score;
		
		public Student(int num) {
			this.num = num;
		}
		public Student(int num, int score) {
			this.num = num;
			this.score = score;
		}
	}

}
