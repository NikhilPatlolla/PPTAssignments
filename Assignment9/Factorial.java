public class Factorial {
    public int findFactorial(int N) {
        int factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int N = 5;
        Factorial solution = new Factorial();
        int factorial = solution.findFactorial(N);
        System.out.println("Factorial of " + N + " is: " + factorial);
    }
}
