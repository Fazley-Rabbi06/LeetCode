public class HouseRobber196 {
    public static int rob(int[] nums) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < 2; i++) {
            int total = 0;
            int currentMax = 0;

            for (int j = i; j < nums.length; j += 2) {
                currentMax += nums[j];
                if (index < nums.length) {
                    total += nums[index];
                    index += 3;
                }
            }
            index = 1;
            if (currentMax > total) {
                total = currentMax;
            }
            if (total > max)
                max = total;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{4,1,2,7,5,3,1}));
    }
}
/*
Steps:
1. Traverse the nums after one interval
2. Add total sum;
3. Then compare and return max;


 */