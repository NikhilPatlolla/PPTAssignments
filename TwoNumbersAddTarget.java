import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example:**
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]

**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][
*/



public class TwoNumbersAddTarget {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9; 
		int[] twoSum = twoSum(arr, target);
		int[] twoSumWithMap = twoSumWithMap(arr, target);
		System.out.println(Arrays.toString(twoSumWithMap)); //O(n)
		System.out.println(Arrays.toString(twoSum)); // O(n^2)
	}

	public static int[] twoSum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	
	public static int[] twoSumWithMap(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int remaining = sum-arr[i];
			if(map.containsKey(remaining)) {
				return new int[] {map.get(remaining), i};
			}
			
			map.put(arr[i], i);
		}

		return new int[] { -1, -1 };
	}
}
