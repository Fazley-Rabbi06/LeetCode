public class EvenNumberOfDigits1295 {
    public int findNumber(int[] nums){
        int count = 0;
        for (int i = 0; i<nums.length;i++){
            int num = nums[i];
            if(Integer.toString(num).length() % 2 == 0)
                count++;
        }
        return count;
    }
}

/*
1. First take each element
2. Then convert it to String and find out it's length.
3. If length % 2 == 0
   then increment count value;
 */