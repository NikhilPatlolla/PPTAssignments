package Assignements2;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums){
        boolean increasing = true, decreasing = true;

        for(int i=1; i< nums.length; i++){
            if(nums[i] < nums[i-1]) {
                increasing = false;
            }
            if(nums[i] > nums[i-1]){
                decreasing =false;
            }
        }

        return increasing || decreasing;
    }


    public static void main(String[] args) {
        int[] nums ={1,2,2,3};
        boolean monotonic = isMonotonic(nums);
        System.out.println(monotonic);
    }
}
