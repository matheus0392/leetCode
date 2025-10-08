package dev.mnascimento0392.leetCode._37;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

	class Input {
		int i, j;
		Character[][] copy;

		public Input(Character[][] copy, int i, int j) {
			this.i = i;
			this.j = j;
			this.copy = copy;
		}
	}

	public void solveSudoku(char[][] board) {

		Character[][] copy = new Character[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				copy[i][j] = board[i][j];
			}
		}

		Stack<Input> stack = new Stack<>();
		stack.add(new Input(copy, 0, 0));

		List<Character[][]> visited_ = new ArrayList<>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (copy[i][j] == '.') {
					for (int k = 0; k < 9; k++) {
						Character[][] c = copy(stack.peek().copy);
						c[i][j] = (char) (k + '0' + 1);
						if (!isValidSudokuInput(c, i, j)) {
							continue;
						}

						if (isVisited(visited_, c)) {
							continue;
						}

						stack.add(new Input(c, i, j));
							
						if (completed(c)) {
							copy = stack.peek().copy;
							for (int ii = 0; ii < 9; ii++) {
								for (int jj = 0; jj < 9; jj++) {
									board[ii][jj] = copy[ii][jj];
								}
							}
							return;
						}

					}
				}
				if (j == 8) {
					Input top = stack.peek();
					for (int f = 8; f >= 0; f--) {
						if (top.copy[i][f] == '.') {
							if (!stack.isEmpty()) {
								visited_.add(stack.pop().copy);
								Input in = stack.peek();
								i = in.i;
								j = in.j;
							}
							break;
						}
					}
				}
			}
		}
		return;
	}

	private boolean isVisited(List<Character[][]> visited_, Character[][] c) {
		for (Character[][] array : visited_) {
			if (isVisited(array, c)) {
				return true;
			}
		}
		return false;
	}

	private boolean isVisited(Character[][] visited, Character[][] c) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (visited[i][j] == c[i][j]) {
					if (i == 8 && j == 8) {
						return true;
					}
				} else {
					return false;
				}
			}
		}
		return false;
	}

	private Character[][] copy(Character[][] board) {
		Character[][] copy = new Character[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				copy[i][j] = board[i][j];
			}
		}
		return copy;
	}

	private boolean completed(Character[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isValidSudokuInput(Character[][] board, int i, int j) {
		for (int x = 0; x < 9; x++) {
			if (board[i][x] != '.') {
				if (x != j && board[i][x] == board[i][j]) {
					return false;
				}
			}
			if (board[x][j] != '.') {
				if (x != i && board[x][j] == board[i][j]) {
					return false;
				}
			}
		}
		int boxI = i / 3, boxJ = j / 3;
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (x != i - boxI * 3 && y != j - boxJ * 3 && board[boxI * 3 + x][boxJ * 3 + y] == board[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	/*private boolean isValidSudoku(Character[][] board) {

		List<Set<Character>> setRows = new ArrayList<>();
		List<Set<Character>> setColumns = new ArrayList<>();
		List<Set<Character>> setBoxes = new ArrayList<>();

		for (int i = 0; i < 9; i++) {
			setColumns.add(new HashSet<>());
			setRows.add(new HashSet<>());
			setBoxes.add(new HashSet<>());
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (setRows.get(i).contains(board[i][j])) {
						return false;
					}
					setRows.get(i).add(board[i][j]);

					if (setColumns.get(j).contains(board[i][j])) {
						return false;
					}
					setColumns.get(j).add(board[i][j]);

					if (setBoxes.get(j / 3 + (i / 3) * 3).contains(board[i][j])) {
						return false;
					}

					setBoxes.get(j / 3 + (i / 3) * 3).add(board[i][j]);
				}
			}
		}

		return true;
	}*/

}