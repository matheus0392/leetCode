package dev.mnascimento0392.leetCode._37;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class SudokuSolverTest extends TestFormatter {

	SudokuSolverTest() {
		setQuestion("37. Sudoku Solver");
	}

	@Test
	void test1() {

		char[][] sudoku = new char[][] { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		char[][] answer = new char[][] { { '5', '3', '4', '6', '7', '8', '9', '1', '2' },
				{ '6', '7', '2', '1', '9', '5', '3', '4', '8' }, { '1', '9', '8', '3', '4', '2', '5', '6', '7' },
				{ '8', '5', '9', '7', '6', '1', '4', '2', '3' }, { '4', '2', '6', '8', '5', '3', '7', '9', '1' },
				{ '7', '1', '3', '9', '2', '4', '8', '5', '6' }, { '9', '6', '1', '5', '3', '7', '2', '8', '4' },
				{ '2', '8', '7', '4', '1', '9', '6', '3', '5' }, { '3', '4', '5', '2', '8', '6', '1', '7', '9' } };
		new Solution().solveSudoku(sudoku);

		assertMatrixFormatted(sudoku, answer);
	}


}
