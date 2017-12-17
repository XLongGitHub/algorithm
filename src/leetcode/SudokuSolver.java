package leetcode;

import java.util.*;

/**
 * @Date 2017/12/17
 */
public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        int idotCount = 0;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (board[row][column] == '.') idotCount++;
            }
        }
        while (idotCount > 0) {
            for (int row = 0; row < 9; row++) {
                for (int column = 0; column < 9; column++) {
                    if (board[row][column] >= '0' && board[row][column] <= '9') continue;
                    //step1 找到在那一个子方格
                    int m = row / 3;
                    int n = column / 3;
                    //收集方格中已存在的元素
                    Set set = new HashSet();
                    for (int i = m * 3; i < 3; i++) {
                        for (int j = n * 3; j < 3; j++) {
                            char ch = board[i][j];
                            if (ch == '.') continue;
                            set.add(ch);
                        }
                    }
                    //收集所在行的元素
                    for (int i = 0; i < 9; i++) {
                        char ch = board[row][i];
                        if (ch == '.') continue;
                        set.add(ch);
                    }
                    // 收集所在列的元素
                    for (int j = 0; j < 9; j++) {
                        char ch = board[j][column];
                        if (ch == '.') continue;
                        set.add(ch);
                    }
                    //只剩下一个数，能够完全确定时
                    if (set.size() == 8) {
                        for (int i = '1'; i <= '9'; i++) {
                            if (!set.contains((char) i)) {
                                board[row][column] = (char) i;
                                idotCount--;
                                System.out.println(idotCount);
                                System.out.println("row: " + row + " column: " + column);
                                System.out.println(board[row][column]);
                                print(board);
                            }
                        }
                    }
                    // 剩余两个数时
                    if (set.size() == 7) {
                        int index = 0;
                        int[] nums = new int[2]; 
                        for (int i = '1'; i <= '9'; i++) {
                            if (!set.contains((char) i)) {
                                
                                board[row][column] = (char) i;

                    }
                    set.clear();
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] sudoku = {
                {'.', '9', '7', '8', '4', '3', '2', '6', '.'},
                {'1', '6', '4', '2', '5', '9', '3', '8', '7'},
                {'8', '2', '3', '6', '1', '7', '5', '4', '9'},
                {'9', '8', '2', '5', '7', '4', '6', '1', '3'},
                {'4', '1', '6', '3', '9', '8', '7', '2', '5'},
                {'3', '7', '5', '1', '2', '6', '8', '9', '4'},
                {'2', '4', '1', '7', '6', '5', '9', '3', '8'},
                {'6', '5', '8', '9', '3', '1', '4', '7', '2'},
                {'7', '3', '9', '4', '.', '2', '1', '5', '6'}
        };
        char[][] sudoku2 = {
                {'.','.','9','7','4','8','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'.','2','.','1','.','9','.','.','.'},
                {'.','.','7','.','.','.','2','4','.'},
                {'.','6','4','.','1','.','5','9','.'},
                {'.','9','8','.','.','.','3','.','.'},
                {'.','.','.','8','.','3','.','2','.'},
                {'.','.','.','.','.','.','.','.','6'},
                {'.','.','.','2','7','5','9','.','.'}};
        SudokuSolver ss = new SudokuSolver();
        print(sudoku2);
        ss.solveSudoku(sudoku2);
        System.out.println();
        print(sudoku2);

    }

    public static void print(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                System.out.print(chars[i][j] + "  ");
            }
            System.out.println();
        }
    }
}