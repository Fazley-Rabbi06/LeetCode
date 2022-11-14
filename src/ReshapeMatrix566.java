import java.util.Arrays;

public class ReshapeMatrix566 {
    public static int[][] reshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int row = 0;
        int col = 0;
        if ((mat.length * mat[0].length) == (r * c)) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (col < c) {
                        result[row][col] = mat[i][j];
                        col++;
                    } else {
                        row++;
                        col = 0;
                        result[row][col++] = mat[i][j];
                    }
                }
            }
        } else
        return mat;
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        int[][] reshape = reshape(mat, 2, 4);
        System.out.println(Arrays.toString(reshape[0]));
    }
}

/*

Algorithm :

1. Check length : (mat.length * mat[0].length) == (r * c)
    if yes then possible to reshape otherwise return mat.
2. Traverse mat array mat[i] and added the value in result[r][c] array.
    traverse mat array in row wise and added in result array also row wise. If column in row exceed then we go for next row if needed.

 */