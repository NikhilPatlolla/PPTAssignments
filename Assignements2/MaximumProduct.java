package Assignements2;

import java.util.Arrays;

public class MaximumProduct {
    public static int maximumProduct(int[] numbs){
        Arrays.sort(numbs);
        System.out.println(Arrays.toString(numbs));

        int n =numbs.length;
        return Math.max(numbs[n-1]*numbs[n-2]*numbs[n-3], numbs[0]*numbs[1]*numbs[n-1]);
    }

    public static void main(String[] args) {
        int[] numbs = {1,3,5,9,34,-90,-23};
        int product = maximumProduct(numbs);
        System.out.println(product);
    }
}
