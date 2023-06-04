import java.util.*;

public class DistinctArrays {
    public static List<List<Integer>> findDisappearedNumbers(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        for (int num : nums1) {
            if (!set2.contains(num)) {
                result1.add(num);
            }
        }

        for (int num : nums2) {
            if (!set1.contains(num)) {
                result2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = findDisappearedNumbers(new int[]{1,2,3}, new int[]{2,4,6});
        System.out.println(lists);
    }
}
