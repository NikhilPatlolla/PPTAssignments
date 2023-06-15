import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionWithFrequency {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Create a hashmap to store element frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies of elements in nums1
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();

        // Find intersection while considering frequencies
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                intersection.add(num);
                freqMap.put(num, freqMap.get(num) - 1);
            }
        }

        // Convert the result list to an array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersection = intersect(nums1, nums2);

        System.out.print("Intersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
