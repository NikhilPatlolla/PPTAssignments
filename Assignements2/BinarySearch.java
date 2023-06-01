package Assignements2;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low = arr[0];
        int high = arr[arr.length-1];
        int mid;

        while(low<=high){
            mid = low + (high-low)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int search = binarySearch(arr, 10);
        System.out.println(search);
    }
}
