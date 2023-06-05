import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoubledArray {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0];
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            int halfCount = countMap.getOrDefault(num / 2, 0);
            if (count != halfCount) {
                return new int[0];
            }
            for (int i = 0; i < count; i++) {
                originalList.add(num);
            }
        }

        int[] originalArray = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            originalArray[i] = originalList.get(i);
        }
        return originalArray;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        for (int num : original) {
            System.out.print(num + " ");
        }
    }
}
