package dev.mnascimento0392.leetCode._43;

import java.math.BigInteger;
import static java.math.BigInteger.valueOf;


class Solution {
	public String multiply(String num1, String num2) {

		StringBuilder sb = new StringBuilder();

		BigInteger current = BigInteger.ZERO;

		BigInteger base = toNum(num1);

		for (int i = num2.length() - 1; i >= 0; i--) {
			current = current.add(product(i, base, num2));
			long lastAlg = current.mod(valueOf(10)).longValue();
			current = current.divide(valueOf(10));
			sb.append(lastAlg);
		}

		sb = new StringBuilder(current + sb.reverse().toString());

		while (sb.charAt(0) == '0' && sb.length() > 1) {
			sb.deleteCharAt(0);
		}

		return sb.toString();
	}

	private BigInteger product(int i, BigInteger base, String sub) {
		return base.multiply(new BigInteger(sub.substring(i,i+1)));
	}

	/*Long toNum(String num) {
		Long result = 0l;
		for (int i = 0; i < num.length(); i++) {
			result += (long) (num.charAt(i) - '0') * (long) Math.pow(10, num.length() - i - 1);
		}
		return result;
	}*/
	
	BigInteger toNum(String num) {
		BigInteger result = new BigInteger("0");
		for (int i = 0; i < num.length(); i++) {
			result= result.add( new BigInteger(num.substring(i,i+1),10).multiply(valueOf(10).pow(num.length() - i - 1)));
		}
		 
		return result;
	}


}