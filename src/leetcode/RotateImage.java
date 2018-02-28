package leetcode;

import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return;
        int[] arr = new int[n * n];
        int index = 0;
//        复制数组
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[index++] = matrix[row][col];

            }
        }
//        System.out.println(Arrays.toString(arr));

        index = 0;
        for (int col = n - 1; col >= 0; col--) {
            for (int row = 0; row < n; row++)
                matrix[row][col] = arr[index++];
        }

    }

    public void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        RotateImage ri = new RotateImage();
        ri.rotate(matrix);
        ri.printMatrix(matrix);
    }
}
