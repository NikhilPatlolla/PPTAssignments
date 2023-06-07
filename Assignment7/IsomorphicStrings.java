import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (sToT.containsKey(chS) && tToS.containsKey(chT)) {
                if (sToT.get(chS) != chT || tToS.get(chT) != chS) {
                    return false;
                }
            } else if (!sToT.containsKey(chS) && !tToS.containsKey(chT)) {
                sToT.put(chS, chT);
                tToS.put(chT, chS);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t)); // Output: true

        s = "foo";
        t = "bar";
        System.out.println(isIsomorphic(s, t)); // Output: false
    }
}
