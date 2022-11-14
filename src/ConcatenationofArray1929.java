import java.util.Arrays;

public class ConcatenationofArray1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,3,2,1})));
    }
}

/*
1. Take ans array with length twice time of nums array.
2. Traverse nums array and assign value to ans array
    ans[i] = nums[i]
    ans[i + nums.length] = nums[i]

 */
