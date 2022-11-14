import java.util.*;

public class MatchingRule1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String, Integer> ruleKeyWithIndex = new HashMap<>();
        ruleKeyWithIndex.put("type", 0);
        ruleKeyWithIndex.put("color", 1);
        ruleKeyWithIndex.put("name", 2);

        int index = ruleKeyWithIndex.get(ruleKey);
        int count = 0;

        for (List<String> item : items
        ) {
            if(item.get(index).equalsIgnoreCase(ruleValue))
                count++;
            else
                continue;
        }
        return count;

    }

    public static void main(String[] args) {
        List<String> item1 = new ArrayList<>(Arrays.asList("phone","blue","pixel"));
        List<String> item2 = new ArrayList<>(Arrays.asList("computer","silver","lenovo"));
        List<String> item3 = new ArrayList<>(Arrays.asList("phone","gold","iphone"));

        List<List<String>> items = new ArrayList<>(Arrays.asList(item1,item2,item3));

        int i = countMatches(items, "color", "silver");
        System.out.println(i);


    }
}
