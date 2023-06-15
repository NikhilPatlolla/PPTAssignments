public class StringLengthCalculator {
    public static int calculateLength(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + calculateLength(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = calculateLength(str);
        System.out.println("Length of the string: " + length);
    }
}
