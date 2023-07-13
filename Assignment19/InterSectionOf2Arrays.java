import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
public class InterSectionOf2Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> intersection = new ArrayList<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
                set.remove(num); // Remove the element to avoid duplicates
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
}
