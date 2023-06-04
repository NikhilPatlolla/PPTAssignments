public class DistanceValue {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;

        for (int num1 : arr1) {
            boolean isValid = true;

            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                distance++;
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        int theDistanceValue = findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2);
        System.out.println(theDistanceValue);
    }
}
