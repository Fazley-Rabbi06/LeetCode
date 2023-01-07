public class Substring1367 {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if(word.contains(patterns[i]))
                count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int abc = numOfStrings(new String[]{"a","b","c"}, "abc");
        System.out.println(abc);
    }


}
