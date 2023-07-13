public class Merge2SortedArrays {
    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < m) {
            merged[k++] = arr1[i++];
        }

        while (j < n) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}
