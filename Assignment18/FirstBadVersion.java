public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Example implementation of the isBadVersion API
    private boolean isBadVersion(int version) {
        // Implementation logic for the API
        // ...
        return false; // Placeholder return value
    }

    public static void main(String[] args) {
        FirstBadVersion solution = new FirstBadVersion();

        // Example usage
        int n = 10;
        int firstBadVersion = solution.firstBadVersion(n);
        System.out.println("First Bad Version: " + firstBadVersion);
    }
}
