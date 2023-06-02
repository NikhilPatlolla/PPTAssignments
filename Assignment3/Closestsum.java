import java.util.Arrays;

public class Closestsum {


    public static int closestSum(int[] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;

        int closest  = nums[0] + nums[1] + nums[n-1];

        for (int i=0; i<n-2; i++){
            int j = i+1;
            int k = n-1;


            while(j<k){
                int sum = nums[i]+ nums[j]+ nums[k];
                if(sum < target){
                    j++;
                }else if (sum > target){
                    k--;
                }else{
                    return sum;
                }

                if(Math.abs(closest-target) > Math.abs(sum-target)){
                    closest = sum;
                }
            }
        }
        return closest;
    }


    public static void main(String[] args) {
        int sum = closestSum(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(sum);
    }
}
