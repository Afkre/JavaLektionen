package Exercise;

import java.math.BigInteger;
import java.util.Arrays;

public class Start {
	public static void main(String[] args) {
		int[] nums = {1,5,3,9,6,3};
		String[] names = {"Tim","Gernot","Alfred","Jörg","Ben"};
		

		System.out.println(MyArrayTools.find(nums, 7));
		System.out.println(MyArrayTools.indexOf(nums, 7));

		MyArrayTools.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println(Arrays.toString(MyArrayTools.sort(names)));
		System.out.println(names);
		
		System.out.println(factorial(500).toString().length());
	}

	public static BigInteger factorial(int fac) {
		BigInteger result = new BigInteger("1");
		while(fac > 0) {
			BigInteger miltipyer = new BigInteger(fac+"");
			result = result.multiply(miltipyer);
			fac--;
		}
		return result;
	}
	
	
}
