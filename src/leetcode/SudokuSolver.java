package leetcode;

import java.util.*;

/**
 * @Date 2017/12/17
 */
public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) return;
        solve(board);
    }

    public boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, row, col, ch)) {
                            board[row][col] = ch;
                            if (solve(board))
                                return true;
                            else 
                                 board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int row, int col, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch) return false;
            if (board[i][col] == ch) return false;
            //注意这里使用%进行横向数据检查
            if(board[3 * (row / 3) + i / 3][3 * (col / 3)  + i % 3] == ch) return false;
        }
        return true;
    }
































//    public void solveSudoku(char[][] board) {
//        int idotCount = 0;
//        for (int row = 0; row < 9; row++) {
//            for (int column = 0; column < 9; column++) {
//                if (board[row][column] == '.') idotCount++;
//            }
//        }
//        while (idotCount > 0) {
//            for (int row = 0; row < 9; row++) {
//                for (int column = 0; column < 9; column++) {
//                    if (board[row][column] >= '0' && board[row][column] <= '9') continue;
//                    Set set = findNumsSet(board, row, column);
//                    // //只剩下一个数，能够完全确定时
//                    // if (set.size() == 8) {
//                    //     for (int i = '1'; i <= '9'; i++) {
//                    //         if (!set.contains((char) i)) {
//                    //             board[row][column] = (char) i;
//                    //             idotCount--;
//                    //             System.out.println(idotCount);
//                    //             System.out.println("row: " + row + " column: " + column);
//                    //             System.out.println(board[row][column]);
//                    //             print(board);
//                    //         }
//                    //     }
//                    // }
//                    Set avaliableSet = findAvaliableNumsSet(set);
//                    for (Object ch : avaliableSet) {
//                        if (isValid(board, row, column, (char)ch)) {
//                            idotCount--;
//                            //             System.out.println(idotCount);
//                            //             System.out.println("row: " + row + " column: " + column);
//                            //             System.out.println(board[row][column]);
//                            //             print(board);
//                            break;
//                        }
//
//                    }
//                    // 剩余两个数时
////                    if (set.size() == 7) {
////                        int index = 0;
////                        int[] nums = new int[2];
////                        for (int i = '1'; i <= '9'; i++) {
////                            if (!set.contains((char) i)) {
////
////                                board[row][column] = (char)i;
////                            }
////                        }
////                        set.clear();
////                    }
//                }
//            }
//        }
//    }
//
//    /**
//     * 返回该空格不可能写入的元素
//     * @param board
//     * @param row
//     * @param column
//     * @return
//     */
//    public Set findNumsSet(char[][] board, int row, int column){
//        //step1 找到在那一个子方格
//        int m = row / 3;
//        int n = column / 3;
//        //收集方格中已存在的元素
//        Set set = new HashSet();
//        for (int i = m * 3; i < 3; i++) {
//            for (int j = n * 3; j < 3; j++) {
//                char ch = board[i][j];
//                if (ch == '.') continue;
//                set.add(ch);
//            }
//        }
//        //收集所在行的元素
//        for (int i = 0; i < 9; i++) {
//            char ch = board[row][i];
//            if (ch == '.') continue;
//            set.add(ch);
//        }
//        // 收集所在列的元素
//        for (int j = 0; j < 9; j++) {
//            char ch = board[j][column];
//            if (ch == '.') continue;
//            set.add(ch);
//        }
//        return  set;
//    }
//
//    public boolean isValid(char[][] board, int row, int column, char value) {
//        board[row][column] = value;
//        //判断该行是否会出现问题
//        for (int i = 0; i < 9; i++) {
//            if (board[row][i] == '.') {
//                Set set = findNumsSet(board, row, i);
//                if (set.size() == 9) return false;
//            }
//
//        }
//        //判断该列是否会出现问题
//        for (int j = 0; j < 9; j++) {
//            if (board[j][column] == '.') {
//                Set set = findNumsSet(board, j, column);
//                if (set.size() == 9) return false;
//            }
//        }
//        return true;
//    }
//
//
//    /**
//     * 收集某空格可能写入的元素
//     * @param set
//     * @return
//     */
//    public  Set findAvaliableNumsSet(Set set) {
//        Set  avaliableNumsSet = new HashSet();
//        for (int i = 1; i <= 9; i++) {
//            char ch = (char) ('0' + i);
//            if (!set.contains(ch)) avaliableNumsSet.add(ch);
//        }
//        return avaliableNumsSet;
//    }
//
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
                {'.', '.', '9', '7', '4', '8', '.', '.', '.'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '2', '.', '1', '.', '9', '.', '.', '.'},
                {'.', '.', '7', '.', '.', '.', '2', '4', '.'},
                {'.', '6', '4', '.', '1', '.', '5', '9', '.'},
                {'.', '9', '8', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '8', '.', '3', '.', '2', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '2', '7', '5', '9', '.', '.'}};
        SudokuSolver ss = new SudokuSolver();
        print(sudoku2);
        ss.solveSudoku(sudoku2);
        System.out.println();
        print(sudoku2);

    }
//
    public static void print(char[][] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                System.out.print(chars[i][j] + "  ");
            }
            System.out.println();
        }
    }
}