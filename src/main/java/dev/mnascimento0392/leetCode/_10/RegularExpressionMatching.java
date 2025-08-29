package dev.mnascimento0392.leetCode._10;

class Solution {
	public boolean isMatch(String s, String p) {

		// return s.matches(p);
		return isPattern(s, p, null);
	}

	boolean isPattern(String s, String p, String last) {

		if (s.length() == 0 && p.length() == 0) {
			return true;
		}

		if (s.length() > 0 && p.length() == 0) {
			return false;
		}

		if (s.length() == 0) {
			if ( p.substring(0, 1).equals("*") ||(p.length() >1 && p.substring(1, 2).equals("*"))) {
				return isPattern(s, p.substring(1), null);
			}
			if (p.length() >1 && p.substring(0,1).equals("*")) {
				return isPattern(s, p.substring(1), null);
			}

			if (p.length() == 0) {
				return true;
			}

			return false;
		}

		String current = s.substring(0, 1);
		String currentPattern = p.substring(0, 1);
		if (s.length() == 1 && p.length() == 1) {
			if (currentPattern.equals(current) || currentPattern.equals(".")
					|| (last != null && (last.equals(".") || last.equals(current)) && p.equals("*"))) {
				return true;
			}
			return false;
		}

		if (currentPattern.equals("*")) {
			if(current.equals(last)|| last.equals(".")) {				
				return isPattern(s, p.substring(1), null) || isPattern(s.substring(1), p, last);
			}else {
				return isPattern(s, p.substring(1), null);
			}
		}

		if (currentPattern.equals(current) || currentPattern.equals(".")) {
			if (p.length() > 1 && p.substring(1, 2).equals("*")) {
				return isPattern(s.substring(1), p.substring(1), currentPattern) || isPattern(s, p.substring(2), null);
			} else {
				return isPattern(s.substring(1), p.substring(1), currentPattern);
			}
		}

		if (p.length() > 1 && p.substring(1, 2).equals("*")) {
			return isPattern(s, p.substring(2), null);
		}

		if (currentPattern.equals("*")) {
			return isPattern(s, p.substring(1), null);
		}

		return false;
	}

}