import java.util.ArrayList;
import java.util.List;

public class ThreePointerSortedArray {
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();

        int ptr1 = 0, ptr2 = 0, ptr3 = 0;

        while (ptr1 < arr1.length && ptr2 < arr2.length && ptr3 < arr3.length) {
            int num1 = arr1[ptr1];
            int num2 = arr2[ptr2];
            int num3 = arr3[ptr3];

            if (num1 == num2 && num2 == num3) {
                result.add(num1);
                ptr1++;
                ptr2++;
                ptr3++;
            } else if (num1 <= num2 && num1 <= num3) {
                ptr1++;
            } else if (num2 <= num1 && num2 <= num3) {
                ptr2++;
            } else {
                ptr3++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> integers = arraysIntersection(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 5, 7, 9}, new int[]{1, 3, 4, 5, 8});
        System.out.println(integers);
    }
}
