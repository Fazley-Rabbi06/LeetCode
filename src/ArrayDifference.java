import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDifference {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        int[] currentnums = nums1;
        int[] anotherNums = nums2;
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < currentnums.length; i++) {
            int target = currentnums[i];
            if (!exist(target, anotherNums)) {
                if (!answer.contains(target))
                    answer.add(target);
            }
            if (i == currentnums.length - 1) {
                currentnums = nums2;
                anotherNums = nums1;
                i = -1;
                result.add(answer);
                answer = new ArrayList<>();
            }
            if (result.size() == 2)
                break;
        }
        return result;
    }

    private static boolean exist(int target, int[] anotherNums) {
        Arrays.sort(anotherNums);
        int start = 0;
        int end = anotherNums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (anotherNums[mid] == target)
                return true;
            if (anotherNums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
    }
}
