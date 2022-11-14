import java.util.Arrays;

public class SetMatrixZeroes72 {

    public static int[][] setZeroes(int[][] matrix) {
        int index = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 0) {
                    int up = row - 1;
                    for (int bottom = row + 1; bottom < matrix.length; bottom++) {
                        matrix[bottom][column] = 0;
                        if (up >= 0) {
                            matrix[up][column] = 0;
                            up--;
                        }
                    }
                    index++;
                }
            }
            if (index > 0) {
                Arrays.fill(matrix[row], 0);
                break;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 1, 2, 3}, {3, 4, 0, 2}, {1, 3, 1, 5}
        };
        int[][] res = setZeroes(matrix);
        System.out.println(Arrays.toString(res[0]));

    }
}
/*
Steps::

1. flag = false;
2. Traverse matrix -> matrix.length(), till it's length
    2.1 traverse matrix each row till last column -> matrix[row].length()
        3. if(matrix[row][col] == o)
             then traverse each matrix row from next here with same column and assign o up and down :
                matrix[row+1][col] = 0;
                matrix[row-1][col] = 0;
                flag = true;
    2.2 if(flag = true)
            matrix[row] = 0 ;assign all elements of this row is 0.
            break;

Space Complexity:: O(1)
Time Complexity:: O(n*n*n)

 */

