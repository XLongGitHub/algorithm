package newke.offer;

/**
 * Created by Xulong on 2017/4/18.
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * 例如[a b c e s f c s a d e e]是3*4矩阵，其包含字符串"bcced"的路径，但是矩阵中不包含“abcb”路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子
 */
public class HasPathBack {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        char[] str = "abcb".toCharArray();
        HasPathBack hasPathBack = new HasPathBack();
        boolean has = hasPathBack.hasPath(chars, 3, 4, str);
        System.out.println(has);
    }

    public boolean hasPath(char[] matrix, int rows, int cols, char[] chars) {
        int[] flag = new int[matrix.length];  //用来标记该位置元素是否已经被访问过

        //以每一元素为起点进行深度搜索
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (helper(matrix,rows, cols, i, j, chars, 0, flag))
                    return true;
            }
        }
        return false;
    }

    public static boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] chars, int k, int[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || chars[k] != matrix[index] || flag[index] == 1)
            return false;
        if (k == chars.length - 1) return true; //已经将字符串全部遍历
        flag[index] = 1;  //标记该元素
        //每个位置朝上下左右进行深度遍历搜索
        if (helper(matrix, rows, cols, i - 1, j, chars, k+1, flag) ||
            helper(matrix, rows, cols, i + 1, j, chars, k+1, flag) ||
            helper(matrix, rows, cols, i, j - 1, chars, k + 1, flag)  ||
            helper(matrix, rows, cols, i, j + 1, chars, k + 1, flag))
            return true;  //若搜索到该字符串，直接返回。
        flag[index] = 0; //恢复元素标记
        return false;
    }
}






























//    public static void main(String[] args) {
//        char[] chars = {{'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
//        char[] str = "bcced".toCharArray();
//        HasPathBack hasPathBack = new HasPathBack();
//        boolean has = hasPathBack.hasPath(chars, 3, 4, str);
//    }
//
//    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
//        int[] flag = new int[matrix.length];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (helper(matrix, rows, cols, i, j, str,0, flag))
//                    return true;
//            }
//        }
//        return false;
//     }
//
//    private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, int[] flag) {
//        int index = i * cols + j;
//        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[index] != str[k] || flag[index] == 1)
//            return false;
//        if (k == str.length - 1) return true;
//        flag[index] = 1;
//        flag[index] = 0;
//        return false;
//    }

