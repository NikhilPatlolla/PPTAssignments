public class ArrayProduct {
    public static int getProduct(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int product = getProduct(arr);
        System.out.println("Product of array elements: " + product);

        arr = new int[]{1, 6, 3};
        product = getProduct(arr);
        System.out.println("Product of array elements: " + product);
    }
}
