package dev.mnascimento0392.leetCode._6;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode._6.Solution;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class ZigzagConversionTest {

	@BeforeAll
	void test() {
		System.err.println("6. Zigzag Conversion");
	}


	@Test
	void test1() {
		assertFormatted(new Solution().convert("PAYPALISHIRING",3), "PAHNAPLSIIGYIR");
	}

	@Test
	void test2() {
		assertFormatted(new Solution().convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
	}
	
	@Test
	void test3() {
		assertFormatted(new Solution().convert("A", 1), "A");
	}
}