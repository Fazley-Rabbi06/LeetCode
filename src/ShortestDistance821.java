import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShortestDistance821 {
    public static int[] shortestToChar(String s, char c) {
        List<Integer> matchIndex = new ArrayList<>();
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
                matchIndex.add(i);
        }

        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (int index: matchIndex
                 ) {
                int diff = Math.abs(i-index);
                min = Math.min(diff,min);
            }
      result[i] = min;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("aaab",'b')));
    }
}
