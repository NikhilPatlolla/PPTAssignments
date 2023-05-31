import java.util.Arrays;

public class RemoveZeros {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 12, 23, 1, 0, 0, 0, 0 };
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void moveZeroes(int[] nums) {
		int left = 0;

		for (int right = 0; right < nums.length; right++) {
			if (nums[right] != 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
			}
		}
	}

}
