package leetcode;

import java.util.*;

public class ValidSudoku {
    
    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet();
        //检测数据是否规范
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ( !( '9' >= board[i][j] && board[i][j] >= '0' || board[i][j] == '.') )
                return false;
            }
        }
        for (int row  = 0; row < 9; row++) {
            int idotCount = 0;
            for (int column = 0; column < 9; column++) {
                if (board[row][column] == '.') {
                    idotCount++;
                } else {
                    set.add(board[row][column]);
                }
            }
            if (idotCount + set.size() != 9) return false;
            set.clear();
        }
        //check column
        for (int column = 0; column < 9; column++) {
                int idotCount = 0;
                for (int row = 0; row < 9; row++) {
                    if (board[row][column] == '.') {
                        idotCount++;
                    } else {
                        set.add(board[row][column]);
                    }
            }
            if (idotCount + set.size() != 9) return false;
            set.clear();
        }
        //check subgird
        for (int i = 0; i < 7;i += 3) {
            for (int j = 0; j < 7; j+=3) {
                int idotCount = 0;
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        if (board[i + m][j + n] == '.') {
                            idotCount++;
                        } else {
                            set.add(board[i + m][j + n]);
                        }
                    }
                }
                if (idotCount + set.size() != 9) return false;
                set.clear();
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        char[][] sudoku = {{".","8","7","6","5","4","3","2","1"},{"2",".",".",".",".",".",".",".","."},{"3",".",".",".",".",".",".",".","."},{"4",".",".",".",".",".",".",".","."},{"5",".",".",".",".",".",".",".","."},{"6",".",".",".",".",".",".",".","."},{"7",".",".",".",".",".",".",".","."},{"8",".",".",".",".",".",".",".","."},{"9",".",".",".",".",".",".",".","."}};
//        char[][] sudoku = {{'.','8','7','6','5','4','3','2','1'},
//                {'2','.','.','.','.','.','.','.','.'},
//                {'3','.','.','.','.','.','.','.','.'},
//                {'4','.','.','.','.','.','.','.','.'},
//                {'5','.','.','.','.','.','.','.','.'},
//                {'6','.','.','.','.','.','.','.','.'},
//                {'7','.','.','.','.','.','.','.','.'},
//                {'8','.','.','.','.','.','.','.','.'},
//                {'9','.','.','.','.','.','.','.','.'}};
        char[][] sudoku = {
                {'.','.','5','.','.','.','.','.','6'},
                {'.','.','.','.','1','4','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','9','2','.','.'},
                {'5','.','.','.','.','2','.','.','.'},
                {'.','.','.','.','.','.','.','3','.'},
                {'.','.','.','5','4','.','.','.','.'},
                {'3','.','.','.','.','.','4','2','.'},
                {'.','.','.','2','7','.','6','.','.'}};
        ValidSudoku validSudoku = new ValidSudoku();
        boolean isValid = validSudoku.isValidSudoku(sudoku);
        System.out.print(isValid);
    }
}