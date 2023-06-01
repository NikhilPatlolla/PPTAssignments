package Assignements2;

public class MinimumOperation {
    public static int minScore(int[] nums, int k){
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for(int num: nums){
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        int initialScore  = maxVal-minVal;

        if(initialScore == 0){
            return 0 ;
        }

        minVal = Integer.MAX_VALUE;
        maxVal = Integer.MIN_VALUE;

        for(int num: nums){
            minVal = Math.min(minVal, num-k);
            maxVal = Math.min(maxVal, num+k);
        }

        int updatedScore = maxVal-minVal;

        return Math.min(initialScore, updatedScore);
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 3;
        int minScore = minScore(nums, k);
        System.out.println(minScore);
    }
}
