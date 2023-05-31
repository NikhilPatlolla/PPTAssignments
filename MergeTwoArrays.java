import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] array2 = new int[] { 2, 5, 6 };
		merge(array1, 3, array2, 3);
		System.out.println(Arrays.toString(array1));
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int p = m + n - 1;

		while (p1 >= 0 && p2 >= 0) {
			if (nums1[p1] >= nums2[p2]) {
				nums1[p] = nums1[p1];
				p1--;
			} else {
				nums1[p] = nums2[p2];
				p2--;
			}
			p--;
		}

		while (p2 >= 0) {
			nums1[p] = nums2[p2];
			p2--;
			p--;
		}
	}

}
