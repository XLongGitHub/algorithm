package offer;

import java.util.Arrays;

/**
 * Created by Xulong on 2017/4/7.
 */
public class hasPath {

    public static void main(String [] args) {
        char[] martix = {'a', 'b', 'c', 'd'};
        char[] str = {'a', 'c'};
        boolean has = new hasPath().hasPath(martix, 2, 2, str);
        System.out.println(has);
    }

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int[][] mark = new int[rows][cols];
        char[][] matr = new char[rows][cols];
        int pos = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matr[i][j] = matrix[pos++];
            }
        }

        int row = 0;
        int col = 0;

//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                for (int k = 0; k < str.length; k++) {
//                    if (matr[i][j] == str[k]) {
//
//                    }
//                }
//
//            }
//        }
        return ss(matr, mark, str);
    }


    public boolean ss(char[][] matrix,int[][] mark, char[] str) {
        if (str == null || str.length == 0)
            return true;
        int row = 0;
        int col = 0;
        boolean b2 = true;

        for (; row < matrix.length && b2; row++) {
            for (; col < matrix[0].length && b2; col++) {
                if (matrix[row][col] == str[0])
                    b2 = false;
            }
        }
        mark[row][col] = 1;
        if (row - 1 >= 0 && mark[row-1][col] != 1) {
            if (matrix[row-1][col] == str[1]) {
              return   ss(matrix, mark, str.toString().substring(1, str.length).toCharArray());
            }
        }
        if (col - 1 >= 0 && mark[row][col-1] != 1) {
            if (matrix[row][col-1] == str[1]) {
              return   ss(matrix, mark, str.toString().substring(1, str.length).toCharArray());
            }
        }
        if (row + 1 <= matrix.length && mark[row+1][col] != 1) {
            if (matrix[row+1][col] == str[1]) {
              return   ss(matrix, mark, str.toString().substring(1, str.length).toCharArray());
            }
        }
        if (col + 1 <= matrix[0].length && mark[row][col+1] != 1) {
            if (matrix[row][col+1] == str[1]) {
              return   ss(matrix, mark, str.toString().substring(1, str.length).toCharArray());
            }
        }
        return false;
    }

    public boolean contain(char[] matrix, char[] str) {
        Arrays.sort(matrix);
        for (int i = 0; i < str.length; i++)
            if ( !(Arrays.binarySearch(matrix, str[i]) < 0)) {
                return false;
            }
        return true;
    }
}
