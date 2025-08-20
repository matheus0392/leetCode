package dev.mnascimento0392.leetCode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class TesteFormatter {

	public static void assertArrayFormatted(int[] a, int[] b) {
		System.out.println(String.format("out: %s  expected: %s %s", Arrays.toString(a), Arrays.toString(b),
				Arrays.compare(a, b) == 0 ? "OK" : ""));
		System.out.println();
		assertEquals(Arrays.toString(a), Arrays.toString(b));
	}

	public static void assertintFormatted(int a, int b) {
		System.out.println(String.format("out: %s  expected: %s %s", a, b, a == b ? "OK" : ""));
		System.out.println();
		assertEquals(a, b);
	}
}
