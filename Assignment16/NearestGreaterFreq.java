import java.util.*;

public class NearestGreaterFreq {
    public static int[] findNearestGreaterFrequency(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            int currentElement = arr[i];
            int nearestGreaterElement = -1;

            for (int j = i + 1; j < n; j++) {
                if (frequencyMap.get(arr[j]) > frequencyMap.get(currentElement)) {
                    nearestGreaterElement = arr[j];
                    break;
                }
            }

            result[i] = nearestGreaterElement;
            frequencyMap.put(currentElement, frequencyMap.getOrDefault(currentElement, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 2, 1 };
        int[] result = findNearestGreaterFrequency(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Result: " + Arrays.toString(result));
    }
}
