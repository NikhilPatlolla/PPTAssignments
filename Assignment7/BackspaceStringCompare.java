public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t)); // Output: true

        s = "ab##";
        t = "c#d#";
        System.out.println(backspaceCompare(s, t)); // Output: true

        s = "a##c";
        t = "#a#c";
        System.out.println(backspaceCompare(s, t)); // Output: true

        s = "a#c";
        t = "b";
        System.out.println(backspaceCompare(s, t)); // Output: false
    }
}
