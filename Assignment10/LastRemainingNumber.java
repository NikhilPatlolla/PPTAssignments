public class LastRemainingNumber {
    public static int lastRemaining(int n) {
        return lastRemainingRecursive(n, true);
    }

    private static int lastRemainingRecursive(int n, boolean leftToRight) {
        if (n == 1) {
            return 1;
        }

        if (leftToRight) {
            return 2 * lastRemainingRecursive(n / 2, false);
        } else {
            if (n % 2 == 0) {
                return 2 * lastRemainingRecursive(n / 2, true) - 1;
            } else {
                return 2 * lastRemainingRecursive(n / 2, true);
            }
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int result = lastRemaining(n);
        System.out.println("Last remaining number: " + result);
    }
}
