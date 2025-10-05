package dev.mnascimento0392.leetCode._36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {

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

                    if (setColumns.get(j % 9).contains(board[i][j])) {
                        return false;
                    }
                    setColumns.get(j % 9).add(board[i][j]);

                    if (setBoxes.get(j / 3 + (i / 3) * 3).contains(board[i][j])) {
                        return false;
                    }

                    setBoxes.get(j / 3 + (i / 3) * 3).add(board[i][j]);
                }
            }
        }

        return true;
    }
}