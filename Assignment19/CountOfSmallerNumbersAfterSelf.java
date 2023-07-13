import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

    private int[] count;
    private int[] indexes;
    private int[] temp;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        indexes = new int[n];
        temp = new int[n];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        mergeSort(nums, 0, n - 1);

        for (int i = 0; i < n; i++) {
            result.add(count[i]);
        }

        return result;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (nums[indexes[i]] <= nums[indexes[j]]) {
                count[indexes[i]] += (j - mid - 1);
                temp[k++] = indexes[i++];
            } else {
                temp[k++] = indexes[j++];
            }
        }

        while (i <= mid) {
            count[indexes[i]] += (j - mid - 1);
            temp[k++] = indexes[i++];
        }

        while (j <= right) {
            temp[k++] = indexes[j++];
        }

        for (int p = left; p <= right; p++) {
            indexes[p] = temp[p];
        }
    }
}
