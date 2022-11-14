import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers1380 {
    public static List<Integer> luckyNumbers(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        int max;

        for (int i = 0; i < matrix.length; i++) {
           int min = matrix[i][0];
           int column = 0;

            //findout minimum value
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    column = j;
                }
            }
            max = min;

            //findout maximum value
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][column] > max){
                    max = matrix[k][column];
                }
            }

            if (min == max)
                result.add(max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] res = {
                {7,8},
                {1,2}
        };

        System.out.println(luckyNumbers(res));

    }
}
