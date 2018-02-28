package leetcode;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        int[][] matrix = new int[m][n];
        for (int row = 1; row < m; row++)
            matrix[row][0] = 1;
        for (int col = 1; col < n; col++)
            matrix[0][col] = 1;
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                matrix[row][col] = matrix[row - 1][col] + matrix[row][col - 1];
            }
        }
        return matrix[m - 1][n - 1];
    }

}
