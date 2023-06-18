public class SubsetPrinter {
    public static void printSubsets(String set) {
        printSubsetsRecursive(set, "", 0);
    }

    private static void printSubsetsRecursive(String set, String currentSubset, int index) {
        if (index == set.length()) {
            System.out.print(currentSubset + " ");
            return;
        }

        // Include the current character in the subset
        printSubsetsRecursive(set, currentSubset + set.charAt(index), index + 1);

        // Exclude the current character from the subset
        printSubsetsRecursive(set, currentSubset, index + 1);
    }

    public static void main(String[] args) {
        String set = "abc";
        System.out.println("Subsets of the set: ");
        printSubsets(set);
    }
}
