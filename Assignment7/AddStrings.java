public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder sum = new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            int currentSum = digit1 + digit2 + carry;
            int digitSum = currentSum % 10;
            carry = currentSum / 10;

            sum.insert(0, digitSum);
        }

        return sum.toString();
    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2)); // Output: "134"

        num1 = "456";
        num2 = "789";
        System.out.println(addStrings(num1, num2)); // Output: "1245"

        num1 = "999";
        num2 = "1";
        System.out.println(addStrings(num1, num2)); // Output: "1000"
    }
}
