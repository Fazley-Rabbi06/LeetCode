public class Leetcode1281 {
    public static int subtractProductAndSum(int n) {
        if (n == 0)
            return 0;
        int product = 1;
        int sum = 0;
        int digit;
        while (n != 0) {
            digit = n % 10;
            product *= digit;
            sum += digit;
            n = n / 10;
        }
        return (product - sum);
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(-22));
    }
}
