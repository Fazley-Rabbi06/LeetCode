import java.util.Arrays;

public class CountingDigits {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        if (n == 0) {
            ans[0] = 0;
            return ans;
        }
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            String binaryValue = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < binaryValue.length(); j++) {
                if (binaryValue.charAt(j) == '1')
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(1)));
    }
}
