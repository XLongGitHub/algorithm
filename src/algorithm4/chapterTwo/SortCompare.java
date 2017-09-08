package algorithm4.chapterTwo;

import edu.princeton.cs.algs4.StdRandom;

public class SortCompare {
   public static double time(String alg, Double[] a) {
       return 0.0;
   }

   public static double timeRandomInput(String alg, int N, int T) {
       double total = 0.0;
       Double[] a = new Double[N];
       for (int t = 0; t < T; t++) {
           for (int i = 0; i < N; i++)
               a[i] = StdRandom.uniform();
           total += time(alg, a);
       }
       return total;
   }

}
