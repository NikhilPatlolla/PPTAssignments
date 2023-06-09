public class StringPermutations {
    public void printPermutations(String s) {
        char[] arr = s.toCharArray();
        backtrack(arr, 0);
    }

    private void backtrack(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            backtrack(arr, index + 1);
            swap(arr, index, i); // backtrack: restore the original order
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        StringPermutations permutations = new StringPermutations();
        String s = "ABC";
        System.out.println("Permutations of " + s + ":");
        permutations.printPermutations(s);

        System.out.println();

        s = "XY";
        System.out.println("Permutations of " + s + ":");
        permutations.printPermutations(s);
    }
}
