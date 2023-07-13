public class AlternateNegativeAndPositiveItems {
    public void rearrangeArray(int[] arr) {
        int positive = 0;
        int negative = 0;
        int n = arr.length;

        while (positive < n && negative < n) {
            while (positive < n && arr[positive] >= 0) {
                positive++;
            }
            while (negative < n && arr[negative] < 0) {
                negative++;
            }

            if (positive < n && negative < n) {
                swap(arr, positive, negative);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
