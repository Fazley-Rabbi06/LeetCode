import java.util.HashMap;
import java.util.Map;

public class SmallestLetter744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabet.put((char) ('a' + i), i + 1);
        }
        int start = 0;
        int end = letters.length;
        while (start <= end) {
            int mid = start + end / 2;
            if (mid == letters.length)
                mid = mid -1;
            if (alphabet.get(letters[mid]) > alphabet.get(target)) {
                if (mid - 1 >= 0 && alphabet.get(letters[mid - 1]) <= alphabet.get(target))
                    return letters[mid];
                else
                    end = mid - 1;
            }
            if (alphabet.get(letters[mid]) < alphabet.get(target))
                start = mid + 1;
            else
                end = mid - 1;
        }
        return letters[0];
    }


    public static void main(String[] args) {
        char a = nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd');
        System.out.println(a);
    }
}
