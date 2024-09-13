package hackerHank;

import java.math.BigInteger;

public class BigIntegerTeste {

	public static void main(String[] args) {
		
		String calc1 = "12 + 30";
		
		String [] nums = calc1.split("[+]");
		
		BigInteger b1 = new BigInteger(nums[0].trim());
		BigInteger b2 = new BigInteger(nums[1].trim());
		
		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
		
		
		

	}

}
