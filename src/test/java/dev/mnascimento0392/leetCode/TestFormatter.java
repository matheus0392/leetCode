package dev.mnascimento0392.leetCode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class TestFormatter {

	public static void assertArrayFormatted(int[] a, int[] b) {
		System.out.println(String.format("out: %s  expected: %s %s", Arrays.toString(a), Arrays.toString(b),
				Arrays.compare(a, b) == 0 ? "OK" : ""));
		System.out.println();
		assertEquals(Arrays.toString(a), Arrays.toString(b));
	}

	public static void assertIntFormatted(int a, int b) {
		System.out.println(String.format("out: %s  expected: %s %s", a, b, a == b ? "OK" : ""));
		System.out.println();
		assertEquals(a, b);
	}

	public static void assertFormatted(Object a, Object b) {
		System.out.println(String.format("out: %s  expected: %s %s", a, b, a.equals(b) ? "OK" : ""));
		System.out.println();
		assertEquals(a, b);
	}

}
