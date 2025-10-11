package dev.mnascimento0392.leetCode._38;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class CountAndSayTest extends TestFormatter {

	CountAndSayTest() {
		setQuestion("38. Count and Say");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().countAndSay(4), "1211");
	}

	@Test
	void test2() {
		assertFormatted(new Solution().countAndSay(1), "1");
	}

}
