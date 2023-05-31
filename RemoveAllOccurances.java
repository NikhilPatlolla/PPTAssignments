
public class RemoveAllOccurances {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 1, 4, 5, 6, 23, 2, 2, 2, 2, 2, 2, 3 };
		int removeOccurance = removeOccurance(arr, 2);
		int removeElement = removeElement(arr, 2);
		
		
		System.out.println(removeOccurance);
		System.out.println(removeElement);
	}

	private static int removeOccurance(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				swap(i, nums);
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				break;
			}
			count++;
		}
		return count;
	}

	//The changes are made to the array, such that the values =! are kept in the array, and rest are ignored. 
	private static int removeElement(int[] nums, int val) {
		int k = 0; 
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				nums[k] = nums[i]; 
				k++;
			}
		}
		return k; 
	}

	private static void swap(int i, int[] nums) {
		if (nums.length < 2 || i == nums.length - 1)
			return;

		int value = nums[nums.length - 1];
		nums[nums.length - 1] = nums[i];
		nums[i] = value;

	}
}
