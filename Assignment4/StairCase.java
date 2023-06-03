public class StairCase {
    public static int arrangeCoins(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sum = (long) mid * (mid + 1) / 2;

            if (sum <= n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        int arrangeCoins = arrangeCoins(5);
        System.out.println(arrangeCoins);
    }
}
