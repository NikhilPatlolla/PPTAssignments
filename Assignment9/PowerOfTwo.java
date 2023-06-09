public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 16;
        PowerOfTwo solution = new PowerOfTwo();
        boolean isPowerOfTwo = solution.isPowerOfTwo(n);
        System.out.println("Is power of two: " + isPowerOfTwo);
    }
}
