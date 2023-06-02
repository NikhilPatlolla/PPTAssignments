import java.util.Arrays;

public class IncrementIntegerArray {

    public static int[] increment(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        arr = new int[arr.length + 1];
        arr[0] =1;
        return  arr;
    }


    public static void main(String[] args) {
        int[] incremented = increment(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(incremented));
    }
}
