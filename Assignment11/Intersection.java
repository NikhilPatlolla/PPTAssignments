import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add all elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Find the common elements between nums1 and nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the set to an array
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersection = intersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
}
