import java.util.Arrays;

public class IncrementDigitInteger {

	public static void main(String[] args) {
		int[] plusOne = additionToArray(new int[] {1,2,3});
		System.out.println(Arrays.toString(plusOne));
	}
	
	public static int[] additionToArray(int[] digits) {
	    int carry = 1;
	    
	    for (int i = digits.length - 1; i >= 0; i--) {
	        int sum = digits[i] + carry;
	        digits[i] = sum % 10;
	        carry = sum / 10;
	        
	        if (carry == 0) {
	            break;
	        }
	    }
	    
	    if (carry == 1) {
	        int[] result = new int[digits.length + 1];
	        result[0] = carry;
	        System.arraycopy(digits, 0, result, 1, digits.length);
	        return result;
	    }
	    
	    return digits;
	}


}
