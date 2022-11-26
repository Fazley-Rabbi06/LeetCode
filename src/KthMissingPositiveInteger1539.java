import java.util.Arrays;
import java.util.List;

public class KthMissingPositiveInteger1539 {
    public static int findKthPositive(int[] arr, int k) {
        int[] result = new int[k];
        int count = 0;
        int i = 1;
        while (count < result.length) {
            if (!binarySearch(arr, i)) {
                result[count] = i;
                count++;
            }
            i++;
        }
        return result[result.length-1];
    }

    static boolean binarySearch(int[] arr, int i) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == i) {
                return true;
            }
            if (arr[mid] > i)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int kthPositive = findKthPositive(new int[]{1,2,3,4}, 2);
        System.out.println(kthPositive);
    }
}

/*

1. Take an array result with length k
2. Search value from 1 to n until arrays.length cover
    if search value not exist in arr then add this value in result;
    if not then skip
3. Finally, return the last index value of result's array

 */