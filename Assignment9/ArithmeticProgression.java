public class ArithmeticProgression {
    public int findNthTerm(int a, int d, int N) {
        int nthTerm = a + (N - 1) * d;
        return nthTerm;
    }

    public static void main(String[] args) {
        int a = 2;
        int d = 1;
        int N = 5;

        ArithmeticProgression progression = new ArithmeticProgression();
        int nthTerm = progression.findNthTerm(a, d, N);
        System.out.println("The " + N + "th term of the series is: " + nthTerm);
    }
}
