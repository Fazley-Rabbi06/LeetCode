import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static boolean isHappy(int n) {
        List<Integer> num = new ArrayList<>();
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            if (num.contains(sum))
                return false;
            num.add(sum);
            n = sum;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
