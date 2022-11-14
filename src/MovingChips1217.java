import java.util.Arrays;

public class MovingChips1217 {
    public static int minCostToMoveChips(int[] position) {
        int evenPosition = 0;
        int oddPosition = 0;
        for (int index = 0; index < position.length; index++) {
            int i = position[index] % 2 == 0 ? evenPosition++ : oddPosition++;
        }
        return Math.min(evenPosition,oddPosition);
    }

    public static void main(String[] args) {
        int[] positions = {3, 3, 1, 2, 2};
        System.out.println(minCostToMoveChips(positions));
    }
}
