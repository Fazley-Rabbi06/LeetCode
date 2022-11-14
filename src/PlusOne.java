import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9) {
            digits = new int[digits.length + 1];
            digits[digits.length - 2] = 1;
            digits[digits.length - 1] = 0;
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
