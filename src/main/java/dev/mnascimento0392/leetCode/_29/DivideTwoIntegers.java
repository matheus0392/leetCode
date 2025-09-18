package dev.mnascimento0392.leetCode._29;

class Solution {
	public int divide(int dividend, int divisor) {
		// return (int) dividend/divisor;

		long divisor_ = divisor, dividendAbs = dividend, dividend__ = 0;
		long resp_ = 0, sum = 0, resto = 0;
		int count = 0;
		String resp = "";

		divisor_ = Math.abs(divisor_);
		dividendAbs = Math.abs(dividendAbs);

		if (dividendAbs < divisor_) {
			return 0;
		}

		while (true) {
			while (dividend__ < divisor_) {
				dividend__ = (long) (Long.parseLong(String.valueOf(dividendAbs).substring(0, count + 1)));
				count++;
				if (count > 1 && resto == 0) {
					if (resp.length() > 0) {
						resp += String.valueOf(0);
					}
				}
			}

			while (true) {
				sum += divisor_;
				if (sum > dividend__) {
					resto = dividend__ - sum + divisor_;
					break;
				}
				resp_ += 1;
			}
			resp += String.valueOf(resp_);

			String bb = String.valueOf(dividendAbs).substring(count);
			dividendAbs = (int) (Long.parseLong(String.valueOf(resto) + bb));
			if (dividendAbs < divisor_) {
				/*int a = String.valueOf(Math.abs(dividend)).length();
				int b = String.valueOf(Math.abs(divisor)).length() + String.valueOf(resp).length();
				if (a > b) {
					for (int j = 0; j < a - b; j++) {
						resp += String.valueOf(0);
					}
				}else if(a ==b) {
					resp += String.valueOf(0);
				}
				break;*/
				
				//int a = String.valueOf(Math.abs(dividend)).length();
				int b = bb.length();
				if (b>=1) {
					for (int j = 0; j <  b; j++) {
						resp += String.valueOf(0);
					}
				}
				break;
			}
			sum = 0;
			dividend__ = 0;
			count = 0;
			resp_ = 0;
		}

		resp_ = Long.parseLong(resp);

		if ((divisor > 0 && dividend < 0) || (divisor < 0 && dividend > 0))

		{
			resp_ = -resp_;
		}

		if (resp_ > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (resp_ < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		return (int) resp_;
	}
}
