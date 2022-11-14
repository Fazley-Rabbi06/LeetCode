public class HouseRobber196 {
    public static int rob(int[] nums) {
        int total = 0;
        int currentMax = 0;
        int index = 1;
        for (int i = 0; i < nums.length; i += 2) {
            currentMax += nums[i];
            if (index < nums.length) {
                total += nums[index];
            }
            index += 2;
        }
        if (total > currentMax)
            return total;
        return currentMax;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[] {0}));
    }
}
/*
Steps:
1. Traverse the nums after one interval
2. Add total sum;
3. Then compare and return max;


 */