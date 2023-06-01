package Assignements2;

import java.util.HashSet;
import java.util.Set;

public class MaximumCandies {
    public static int maxCandies(int[] candyType){
        int maxEat = candyType.length/2;
        Set<Integer> uniqueCandies = new HashSet<>();

        for(int candy: candyType){
            uniqueCandies.add(candy);

        }

        return Math.min(uniqueCandies.size(), maxEat);
    }


    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3,4,6,9,12};
        int maxTypes = maxCandies(candyType);
        System.out.println(maxTypes);
    }
}
