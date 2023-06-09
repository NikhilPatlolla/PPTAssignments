public class SumOfNaturalNumbers {
    public int findSumOfNaturalNumbers(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        SumOfNaturalNumbers solution = new SumOfNaturalNumbers();
        int sum = solution.findSumOfNaturalNumbers(n);
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }
}
