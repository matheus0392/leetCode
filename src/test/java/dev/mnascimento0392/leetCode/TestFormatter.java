package dev.mnascimento0392.leetCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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
		System.out.println((System.currentTimeMillis() - start) + " ms\n");
	}

	public static void assertArrayFormatted(int[] a, int[] b) {

		System.out.println(String.format("out: %s  expected: %s %s", Arrays.toString(a), Arrays.toString(b),
				Arrays.compare(a, b) == 0 ? "OK" : "ERR"));

		assertEquals(Arrays.toString(a), Arrays.toString(b));
	}

	public static void assertIntFormatted(int a, int b) {
		System.out.println(String.format("out: %s  expected: %s %s", a, b, a == b ? "OK" : "ERR"));
		assertEquals(a, b);
	}

	public static void assertFormatted(Object a, Object b) {
		if (a == null) {
			System.err.println("output NULL: ERR");
		}
		System.out.println(String.format("out: %s  expected: %s %s", a, b, a.equals(b) ? "OK" : "ERR"));
		assertEquals(a, b);
	}

	public List<String> readTestCase(String fileName, int lines) {

		String folder = this.getClass().getCanonicalName();
		folder = "src/test/java/" + folder.substring(0, folder.lastIndexOf(".") + 1).replaceAll("\\.", "/");
		folder = folder + fileName;

		Path path = Path.of(folder);
		File file = path.toFile();

		String input1 = null, input2 = null, input3 = null, input4 = null;

		List<String> scan = new ArrayList<>();
		try (Scanner scanner = new Scanner(file)) {
			for (int x = 0; x < lines; x++) {
				scan.add(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			Assertions.fail("File not found.");
		}

		setStart(System.currentTimeMillis());
		return scan;
	}

}
