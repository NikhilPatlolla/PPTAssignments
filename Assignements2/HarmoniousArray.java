package Assignements2;

import java.util.HashMap;
import java.util.Map;

public class HarmoniousArray {
    public static int findingHarmoniousArray(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        for(int num: map.keySet()){
            if(map.containsKey(num+1)){
                result = Math.max(result, map.get(num)+map.get(num+1));
            }
        }
        return  result;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        int i = findingHarmoniousArray(nums);
        System.out.println(i);
    }
}
