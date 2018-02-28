package leetcode;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        //标出障碍物
        for (int row = 0; row < obstacleGrid.length; row++) {
            for (int col = 0; col < obstacleGrid[0].length; col++) {
                if (obstacleGrid[row][col] == 1) obstacleGrid[row][col] = -1;
            }
        }
        obstacleGrid[0][0] = 1;
        for (int row  = 1; row < obstacleGrid.length; row++) {
            if (obstacleGrid[row][0] == -1) continue;
            if (obstacleGrid[row - 1][0] == -1) {
                obstacleGrid[row][0] = 0;
            } else {
                obstacleGrid[row][0] = obstacleGrid[row - 1][0];
            }
        }
        for (int col = 1; col < obstacleGrid[0].length; col++) {
            if (obstacleGrid[0][col] == -1) continue;
            if (obstacleGrid[0][col - 1] == -1) {
                obstacleGrid[0][col] = 0;
            } else {
                obstacleGrid[0][col] = obstacleGrid[0][col - 1];
            }
        }
        for (int row = 1; row < obstacleGrid.length; row++) {
            for (int col = 1; col < obstacleGrid[0].length; col++) {
                if (obstacleGrid[row][col] == -1) continue;
                if (obstacleGrid[row - 1][col] == -1 && obstacleGrid[row][col - 1] == -1) {
                    obstacleGrid[row][col] = 0;
                } else if (obstacleGrid[row - 1][col] != -1 && obstacleGrid[row][col - 1] == -1) {
                    obstacleGrid[row][col] = obstacleGrid[row - 1][col];
                } else if (obstacleGrid[row - 1][col] == -1 && obstacleGrid[row][col - 1] != -1) {
                    obstacleGrid[row][col] = obstacleGrid[row][col - 1];
                } else {
                    obstacleGrid[row][col] = obstacleGrid[row - 1][col] + obstacleGrid[row][col - 1];
                }
            }
        }
        int result = obstacleGrid[obstacleGrid.length -1][obstacleGrid[0].length - 1] == -1 ? 0:obstacleGrid[obstacleGrid.length -1][obstacleGrid[0].length - 1];
        return result;
    }

    public static void main(String[] args) {
        UniquePathsII up = new UniquePathsII();
        int[][] paths= {{0,1},{0,0}};
        int num = up.uniquePathsWithObstacles(paths);
        System.out.println(num);

    }

}
