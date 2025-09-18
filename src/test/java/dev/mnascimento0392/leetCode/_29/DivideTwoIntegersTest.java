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
	void test01() {
		assertFormatted(new Solution().divide(10, 3), 3);
	}
	@Test
	void test03() {
		assertFormatted(new Solution().divide(100, 3), 33);
	}
	@Test
	void test02() {
		assertFormatted(new Solution().divide(1000, 3), 333);
	}
	
	@Test
	void test04() {
		assertFormatted(new Solution().divide(11, 3), 3);
	}
	@Test
	void test05() {
		assertFormatted(new Solution().divide(111, 3), 37);
	}
	@Test
	void test06() {
		assertFormatted(new Solution().divide(1111, 3), 370);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().divide(7, -3), -2);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().divide(7, -1), -7);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().divide(-7, 1), -7);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().divide(7, 8), 0);
	}

	@Test
	void test6() {
		assertFormatted(new Solution().divide(Integer.MAX_VALUE, 1), Integer.MAX_VALUE);
	}

	@Test
	void test7() {
		assertFormatted(new Solution().divide(Integer.MIN_VALUE, 1), Integer.MIN_VALUE);
	}

	@Test
	void test8() {
		assertFormatted(new Solution().divide(Integer.MIN_VALUE, -1), Integer.MAX_VALUE);
	}
	
	@Test
	void test9() {
		assertFormatted(new Solution().divide(Integer.MAX_VALUE, -1), -Integer.MAX_VALUE);
	}
	
	@Test
	void test10() {
		assertFormatted(new Solution().divide(2147483647, 2), 1073741823);
	}
	
	@Test
	void test11() {
		assertFormatted(new Solution().divide(-1060849722, 99958928), -10);
	}
	
	@Test
	void test12() {
		assertFormatted(new Solution().divide(-1001849722, 9958928), -100);
	}
	
	@Test
	void test13() {
		assertFormatted(new Solution().divide(-231, 3), -77);
	}
	
	@Test
	void test14() {
		assertFormatted(new Solution().divide(-1730782680, -159474903), 10);
	}
	
}
