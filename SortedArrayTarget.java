
public class SortedArrayTarget {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 6 };
		int index = targetIndex(arr, 7);
		System.out.println(index);
	}

	private static int targetIndex(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while (high >= low) {

			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

}
