public class MountainArray {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Check if array length is less than 3
        if (n < 3) {
            return false;
        }

        // Traverse uphill
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Check if peak is not the first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Traverse downhill
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // Check if reached the end of the array
        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        boolean result = validMountainArray(arr);
        System.out.println(result);
    }
}
