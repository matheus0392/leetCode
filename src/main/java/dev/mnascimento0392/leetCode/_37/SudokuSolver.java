package dev.mnascimento0392.leetCode._37;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class Solution {

	long count = 0;

	class Input {
		int i, j;
		char[][] copy;
		String shrinked;

		public Input(char[][] copy, int i, int j) {
			this.i = i;
			this.j = j;
			this.copy = copy;
			this.shrinked = stackToString(copy);
		}

		public void print() {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(this.copy[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public void solveSudoku(char[][] board) {

		List<List<List<Character>>> cube = new ArrayList<>();

		for (int i = 0; i < 9; i++) {
			cube.add(new ArrayList<>());
			for (int j = 0; j < 9; j++) {
				cube.get(i).add(new ArrayList<>());
				for (int k = 1; k <= 9; k++) {
					cube.get(i).get(j).add((char) (k + '0'));
				}
			}
		}

		boolean nochanges = true;

		while (nochanges) {
			nochanges = false;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (board[i][j] != '.') {
						cube.get(i).get(j).clear();
						continue;
					}

					char[][] copy = copy(board);
					for (int k = 0; k < 9; k++) {
						copy[i][j] = (char) (k + '0' + 1);
						if (!isValidSudokuInput(new Input(copy, i, j))) {
							cube.get(i).get(j).remove(new Character(copy[i][j]));

							if (cube.get(i).get(j).size() == 1) {
								board[i][j] = cube.get(i).get(j).get(0);
								cube.get(i).get(j).clear();
								nochanges = true;
							}
						} else if (isOnlyOption(copy, i, j)) {
							board[i][j] = copy[i][j];
							nochanges = true;
							break;
						}
					}

				}
			}
			if (completed(board)) {
				return;
			}
		}

		char[][] copy = new char[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				copy[i][j] = board[i][j];
			}
		}

		Set<String> visited_ = new HashSet<>();
		Stack<Input> stack = new Stack<>();
		stack.add(new Input(copy, 0, 0));

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (copy[i][j] == '.') {
					boolean added = false;
					for (int k = 0; k < 9; k++) {
						char[][] c = copy(stack.peek().copy);
						c[i][j] = (char) (k + '0' + 1);

						if (!cube.get(i).get(j).contains(c[i][j])) {
							continue;
						}

						Input input = new Input(c, i, j);
						if (!isValidSudokuInput(input)) {
							continue;
						}

						if (isVisited(visited_, input.shrinked)) {
							continue;
						}

						added = true;
						stack.add(input);

						if (!input.shrinked.contains(".")) {
							copy = stack.peek().copy;
							for (int ii = 0; ii < 9; ii++) {
								for (int jj = 0; jj < 9; jj++) {
									board[ii][jj] = copy[ii][jj];
								}
							}
							System.out.println(visited_.size());
							System.out.println(count);
							return;
						}

					}
					if (!added) {
						if (!stack.isEmpty()) {
							visited_.add(stack.pop().shrinked);
							Input in = stack.peek();
							i = in.i;
							j = in.j;
						}
					}
				}
			}
		}

	}

	private String stackToString(char[][] copy) {
		StringBuilder bs = new StringBuilder();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				bs.append(copy[i][j]);
			}
		}
		return bs.toString();
	}

	private boolean isVisited(Set<String> visited_, String curent) {
		count++;

		return visited_.contains(curent);
	}

	private char[][] copy(char[][] board) {
		char[][] copy = new char[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				copy[i][j] = board[i][j];
			}
		}
		return copy;
	}

	private boolean completed(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isOnlyOption(char[][] board, int i, int j) {

		char c = board[i][j];
		board[i][j] = '.';

		int boxI = i / 3, boxJ = j / 3;
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				if (board[boxI * 3 + y][boxJ * 3 + x] == '.') {

					board[boxI * 3 + y][boxJ * 3 + x] = c;
					if (!(y == i - boxI * 3 && x == j - boxJ * 3)) {
						if (isValidSudokuInput(new Input(board, boxI * 3 + y, boxJ * 3 + x))) {
							board[boxI * 3 + y][boxJ * 3 + x] = '.';
							board[i][j] = c;
							return false;
						}
					}
					board[boxI * 3 + y][boxJ * 3 + x] = '.';
				}
			}
		}

		board[i][j] = c;
		return true;

	}

	private boolean isValidSudokuInput(Input input /* Character[][] board, int i, int j */) {

		for (int x = 0; x < 9; x++) {
			if (input.copy[input.i][x] != '.') {
				if (x != input.j && input.copy[input.i][x] == input.copy[input.i][input.j]) {
					return false;
				}
			}
			if (input.copy[x][input.j] != '.') {
				if (x != input.i && input.copy[x][input.j] == input.copy[input.i][input.j]) {
					return false;
				}
			}
		}
		int boxI = input.i / 3, boxJ = input.j / 3;
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (!(x == input.i - boxI * 3 && y == input.j - boxJ * 3)
						&& input.copy[boxI * 3 + x][boxJ * 3 + y] == input.copy[input.i][input.j]) {
					return false;
				}
			}
		}
		return true;
	}
}