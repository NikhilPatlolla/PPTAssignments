import java.util.*;
public class IntersectionPointII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        // Store the frequency of elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the common elements in nums2
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
}
