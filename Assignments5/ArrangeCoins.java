public class ArrangeCoins {
    public static int arrangeCoins(int n) {
        int completeRows = 0;
        int coins = n;
        int row = 1;

        while (coins >= row) {
            completeRows++;
            coins -= row;
            row++;
        }

        return completeRows;
    }

    public static void main(String[] args) {
        int coins = arrangeCoins(14);
        System.out.println(coins);
    }
}
