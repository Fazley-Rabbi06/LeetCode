import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddStringSignature6225 {
    public static String oddString(String[] words) {
        String result = "";
        Map<String, String> map = new HashMap<>();
        int[][] differences = new int[words.length][words[0].length() - 1];
        for (int i = 0; i < words.length; i++) {
            String element = words[i];

            for (int j = 0; j < element.length() - 1; j++) {
                int diff = element.charAt(j + 1) - element.charAt(j);
                differences[i][j] = diff;
            }
            map.put(differences[i].toString(), element);
        }
        String key = Arrays.stream(differences).distinct().toString();
        result = map.get(key);
        return result;
    }

    public static void main(String[] args) {
     String[] words = {"adc","wzy","abc"};
        System.out.println(oddString(words));
     }
}
