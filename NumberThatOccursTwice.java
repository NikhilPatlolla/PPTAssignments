import java.util.Arrays;

public class NumberThatOccursTwice {

	public static void main(String[] args) {
		int[] errorNums = findErrorNums(new int[] {1,2,2,4});
		System.out.println(Arrays.toString(errorNums));
	}

	public static int[] findErrorNums(int[] nums) {
		int i = 0;

		while (i < nums.length) {
			if (nums[i] != nums[nums[i] - 1]) {
				swap(nums, i, nums[i] - 1);
			} else {
				i++;
			}
		}

		for (i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				return new int[] { nums[i], i + 1 };
			}
		}

		return new int[] { -1, -1 }; // If no error is found
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
