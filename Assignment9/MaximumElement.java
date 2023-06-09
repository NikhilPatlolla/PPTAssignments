public class MaximumElement {
    public int findMaxElement(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            int currentElement = arr[index];
            int maxElement = findMaxElement(arr, index + 1);
            return Math.max(currentElement, maxElement);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        MaximumElement solution = new MaximumElement();
        int maxElement = solution.findMaxElement(arr, 0);
        System.out.println("The maximum element is: " + maxElement);
    }
}
