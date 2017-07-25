package newke.offer;

/**
 * Created by Xulong on 2017/4/10.
 */
public class Bonus {
    public int getMost(int[][] board) {
        // write code here
        int len = board.length;
        int len2 = board[0].length;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 && j == 0) {

                } else if (i == 0) {
                    board[i][j] += board[i][j-1];
                } else if (j == 0) {
                    board[i][j] += board[i-1][j];
                } else {
                    board[i][j] += max(board[i-1][j], board[i][j-1]);
                }
            }
        }
        return board[len-1][len2-1];
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
