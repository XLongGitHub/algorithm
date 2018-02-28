package leetcode;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[] min = {Integer.MAX_VALUE};
        path(grid, 0, 0, grid[0][0], min);
        return min[0];
    }

    public void path(int[][] grid, int row, int col, int sum, int[] min) {
        if (sum >= min[0]) return;
        if (col == grid[0].length - 1 && row == grid.length - 1) {
            if (sum < min[0]) {
                min[0] = sum;
            }
            return;
        }
//向右走一步
        if (col + 1 < grid[0].length) {
            int leftSum = grid[row][col + 1] + sum;
            path(grid, row, col + 1, leftSum, min);
        }
//        向下走一步
        if (row + 1 < grid.length) {
            int downSum = grid[row + 1][col] + sum;
            path(grid, row + 1, col, downSum, min);
        }
    }

    // public void leftStep(int[][] grid, int row, int col, int sum, int[] min) {
    //     if (col + 1  < grid[0].length) {
    //         int leftSum = grid[row][col] + min[0];
    //     }
    // }

    // public void downStep(int[][] grid, int row, int col, int sum, int[] min) {

    // }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},
                        {1,5,1},
                        {4,2,1}};
        MinimumPathSum mps = new MinimumPathSum();
        int minSum = mps.minPathSum(grid);
        System.out.println(minSum);
    }
}