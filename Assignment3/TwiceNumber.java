public class TwiceNumber {
        public static int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 3, 1};
            int single = singleNumber(nums);
            System.out.println(single);
        }
}
