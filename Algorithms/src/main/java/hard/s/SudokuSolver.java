package hard.s;

/**
 * Created by jsong on 2019-04-01.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Sudoku Solver (https://leetcode.com/problems/sudoku-solver/)
 */
public class SudokuSolver {

  private char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

  public void solveSudoku(char[][] board) {
    backTracking(board, 0, 0);
  }

  private boolean backTracking(char[][] board, int row, int column) {
    boolean valid = false;
    if (board[row][column] == '.') {
      for (int x = 1; x < 10; x++) {
        if (isValid(board, row, column, x)) {
          board[row][column] = numbers[x];
          if (column < 8) {
            valid = backTracking(board, row, column + 1);
          } else if (row < 8) {
            valid = backTracking(board, row + 1, 0);
          } else {
            valid = true;
          }
          if (valid) {
            return true;
          }
        }
        board[row][column] = '.';
      }
    } else {
      if (column < 8) {
        return backTracking(board, row, column + 1);
      } else if (row < 8) {
        return backTracking(board, row + 1, 0);
      } else {
        valid = true;
      }
    }

    return valid;
  }

  private boolean isValid(char[][] board, int row, int column, int number) {
    for (int i = 0; i < 9; i++) {
      int rowNumb = Character.getNumericValue(board[row][i]);
      int columnNumb = Character.getNumericValue(board[i][column]);
      int boxRow = 3 * (row / 3) + (i / 3);
      int boxColumn = 3 * (column / 3) + (i % 3);
      int boxNumb = Character.getNumericValue(board[boxRow][boxColumn]);

      if (rowNumb == number || columnNumb == number || boxNumb == number) {
        return false;
      }
    }
    return true;
  }
}
