public class Exponent {
    public double calculateExponent(int N, int P) {
        return Math.pow(N, P);
    }

    public static void main(String[] args) {
        int N = 5;
        int P = 2;
        Exponent solution = new Exponent();
        double result = solution.calculateExponent(N, P);
        System.out.println(N + " raised to the power " + P + " is: " + result);
    }
}
