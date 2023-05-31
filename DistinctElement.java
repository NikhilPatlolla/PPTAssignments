import java.util.HashSet;
import java.util.Set;

public class DistinctElement {

	public static void main(String[] args) {
		boolean distinct = isDistinct(new int[] {1,2,3,1});
		System.out.println(distinct);
	}

	private static boolean isDistinct(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i]))
				return false;
			set.add(arr[i]);
		}
		return true;
	}

}
