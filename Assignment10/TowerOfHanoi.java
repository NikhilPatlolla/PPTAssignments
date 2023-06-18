public class TowerOfHanoi {
    public static void towerOfHanoi(int n, int source, int destination, int auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, auxiliary, destination);

        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);

        towerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int N = 2;
        towerOfHanoi(N, 1, 3, 2);
    }
}
