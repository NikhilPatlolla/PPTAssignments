import java.util.*;

public class ChangedDoubleArray {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0]; // Not a doubled array
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : changed) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);
        List<Integer> originalList = new ArrayList<>();

        for (int num : changed) {
            if (frequencyMap.getOrDefault(num, 0) > 0 && frequencyMap.getOrDefault(num * 2, 0) > 0) {
                originalList.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
                frequencyMap.put(num * 2, frequencyMap.get(num * 2) - 1);
            }
        }

        if (originalList.size() == n / 2) {
            int[] original = new int[originalList.size()];
            for (int i = 0; i < original.length; i++) {
                original[i] = originalList.get(i);
            }
            return original;
        } else {
            return new int[0]; // Not a doubled array
        }
    }

    public static void main(String[] args) {
        int[] originalArray = findOriginalArray(new int[]{1, 3, 4, 2, 6, 8});
        System.out.println(Arrays.toString(originalArray));
    }
}
