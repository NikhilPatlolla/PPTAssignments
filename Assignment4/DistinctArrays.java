import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctArrays {
    public static List<List<Integer>> findDisappearedNumbers(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        for (int num : nums1) {
            if (frequencyMap.get(num) == 1) {
                result1.add(num);
            }
        }

        for (int num : nums2) {
            if (frequencyMap.get(num) == 1) {
                result2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(result1);
        answer.add(result2);

        return answer;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = findDisappearedNumbers(new int[]{1, 2, 3}, new int[]{2, 4, 6});
        System.out.println(lists);
    }
}
