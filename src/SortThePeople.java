import java.util.Arrays;

public class SortThePeople {

    public  static String[] sortPeople(String[] names, int[] heights) {
        String tempName;
        int tempHeight;
        for (int i = 0; i < heights.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > heights[max])
                    max = j;
            }
            if (max != i) {
                tempName = names[i];
                names[i] = names[max];
                names[max] = tempName;

                tempHeight = heights[i];
                heights[i] = heights[max];
                heights[max] = tempHeight;
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};
        String[] strings = sortPeople(names, heights);
        System.out.println(Arrays.toString(strings));
    }
}


//        ["EPCFFt","RPJOFYZUBFSIYp","VOYGWWNCf","Vk","Sgizfdfrims","IEO","QTASHKQ","WSpmqvb"]