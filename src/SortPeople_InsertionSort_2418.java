import java.util.Arrays;

public class SortPeople_InsertionSort_2418 {
    public static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 1; i < heights.length; i++) {
            int currentHeight = heights[i];
            String initialName = names[i];
            int previousHeight = i-1;
            while (previousHeight >= 0 && currentHeight > heights[previousHeight]){
                heights[previousHeight+1] = heights[previousHeight];
                names[previousHeight+1] = names[previousHeight];
                previousHeight --;
            }
            heights[previousHeight+1] = currentHeight;
            names[previousHeight+1] = initialName;
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