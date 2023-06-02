
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
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int search = binarySearch(arr, 5);
        System.out.println(search);
    }
}
