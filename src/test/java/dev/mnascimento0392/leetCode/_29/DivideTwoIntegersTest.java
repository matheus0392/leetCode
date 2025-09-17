package dev.mnascimento0392.leetCode._29;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class DivideTwoIntegersTest extends TestFormatter {

	DivideTwoIntegersTest() {
		setQuestion("29. Divide Two Integers");
	}

		@Test
	void test1() {
		assertFormatted(new Solution().divide(10, 3), 3);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().divide(7, -3), -2);
	}


}
