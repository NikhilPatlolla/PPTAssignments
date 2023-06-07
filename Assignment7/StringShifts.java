public class StringShifts {
    public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubleS = s + s;

        return doubleS.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(canShift(s, goal)); // Output: true

        s = "abcde";
        goal = "abced";
        System.out.println(canShift(s, goal)); // Output: false
    }
}
