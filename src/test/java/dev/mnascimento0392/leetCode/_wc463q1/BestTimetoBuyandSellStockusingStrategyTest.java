package dev.mnascimento0392.leetCode._wc463q1;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class BestTimetoBuyandSellStockusingStrategyTest extends TestFormatter {

	BestTimetoBuyandSellStockusingStrategyTest() {
		setQuestion("Q1. Best Time to Buy and Sell Stock using Strategy");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().maxProfit(new int[] { 8, 5 }, new int[] { 1, -1 }, 2), 5l);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().maxProfit(new int[] { 4, 2, 8 }, new int[] { -1, 0, 1 }, 2), 10l);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().maxProfit(new int[] { 5, 4, 3 }, new int[] { 1, 1, 0 }, 2), 9l);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().maxProfit(new int[] { 3, 14, 6, 18 }, new int[] { -1, -1, 1, -1 }, 4), 24l);
	}

	@Test
	void test0() {
		assertFormatted(new Solution().maxProfit(new int[] { 4, 7, 13 }, new int[] { -1, -1, 0 }, 2), 9l);
	}

	//@Test
	void test5() {
		List<String> scan = readTestCase("TestCase0.txt", 4);

		int[] int1 = Arrays.stream(scan.get(0).split(",")).mapToInt(i -> Integer.valueOf(i)).toArray();
		int[] int2 = Arrays.stream(scan.get(1).split(",")).mapToInt(i -> Integer.valueOf(i)).toArray();
		int int3 = Integer.valueOf(scan.get(2));
		long int4 = Long.valueOf(scan.get(3));

		assertFormatted(new Solution().maxProfit(int1, int2, int3), int4);
	}

	//@Test
	void test6() {

		List<String> scan = readTestCase("TestCase1.txt", 4);

		int[] int1 = Arrays.stream(scan.get(0).split(",")).mapToInt(i -> Integer.valueOf(i)).toArray();
		int[] int2 = Arrays.stream(scan.get(1).split(",")).mapToInt(i -> Integer.valueOf(i)).toArray();
		int int3 = Integer.valueOf(scan.get(2));
		long int4 = Long.valueOf(scan.get(3));

		assertFormatted(new Solution().maxProfit(int1, int2, int3), int4);
	}

	//@Test
	void test7() {

		List<String> scan = readTestCase("TestCase2.txt", 4);

		int[] int1 = Arrays.stream(scan.get(0).split(",")).mapToInt(i -> Integer.valueOf(i)).toArray();
		int[] int2 = Arrays.stream(scan.get(1).split(",")).mapToInt(i -> Integer.valueOf(i)).toArray();
		int int3 = Integer.valueOf(scan.get(2));
		long int4 = Long.valueOf(scan.get(3));

		assertFormatted(new Solution().maxProfit(int1, int2, int3), int4);
	}

}