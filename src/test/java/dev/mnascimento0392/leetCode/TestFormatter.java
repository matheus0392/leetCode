package dev.mnascimento0392.leetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.Setter;

@Setter
@TestInstance(Lifecycle.PER_CLASS)
public class TestFormatter {

	long start;
	String question = "question";

	@BeforeAll
	void test() {
		System.err.println(this.question);
	}

	@BeforeEach
	void timer() {
		this.start = System.currentTimeMillis();
	}

	@AfterEach
	void timerCount() {
		long end = System.currentTimeMillis();
		System.out.println((end - this.start) + " ms");
		System.out.println();
	}

	public static void assertArrayFormatted(int[] a, int[] b) {

		System.out.println(String.format("out: %s  expected: %s %s", Arrays.toString(a), Arrays.toString(b),
				Arrays.compare(a, b) == 0 ? "OK" : "ERR"));
		/*
		 * if (Arrays.compare(a, b) != 0) { System.err.println("ERR"); } else {
		 * System.out.println(); }
		 */
		assertEquals(Arrays.toString(a), Arrays.toString(b));
	}

	public static void assertIntFormatted(int a, int b) {
		System.out.print(String.format("out: %s  expected: %s %s", a, b, a == b ? "OK" : "ERR"));
		assertEquals(a, b);
	}

	public static void assertFormatted(Object a, Object b) {
		System.out.print(String.format("out: %s  expected: %s %s", a, b, a.equals(b) ? "OK" : "ERR"));
		assertEquals(a, b);
	}

}
