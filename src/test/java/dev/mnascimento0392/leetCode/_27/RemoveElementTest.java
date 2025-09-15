package dev.mnascimento0392.leetCode._27;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class RemoveElementTest extends TestFormatter {

	RemoveElementTest() {
		setQuestion("27. Remove Element");
	}

		@Test
	void test1() {
		assertFormatted(new Solution().removeElement(new int[]{ 3 ,2 ,2 ,3 }, 3), 2);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().removeElement(new int[]{ 0 ,1 ,2 ,2 ,3 ,0 ,4 ,2 }, 2), 5);
	}


}
