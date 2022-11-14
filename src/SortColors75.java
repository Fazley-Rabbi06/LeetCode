import java.util.Arrays;

public class SortColors75 {
    public static void sortColors(int[] nums) {
        int initial;
        int j;
        for (int i = 1; i < nums.length; i++) {
            initial = nums[i];
            j = i-1;
            while (j >= 0 && nums[j] > initial){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = initial;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        sortColors(new int[] {2,0,2,1,1,0});
    }
}
