package dev.mnascimento0392.leetCode._wc463q1;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class BestTimetoBuyandSellStockusingStrategyTest {

	@BeforeAll
	void test() {
		System.err.println("Q1. Best Time to Buy and Sell Stock using Strategy");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().maxProfit(new int[] { 4, 2, 8 }, new int[] { -1, 0, 1 }, 2), 10);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().maxProfit(new int[] { 5, 4, 3 }, new int[] { 1, 1, 0 }, 2), 9);
	}

}