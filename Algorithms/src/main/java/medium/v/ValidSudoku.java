package medium.v;

/**
 * Created by jsong on 2019-04-01.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Valid Sudoku (https://leetcode.com/problems/valid-sudoku/)
 */
public class ValidSudoku {
  public boolean isValidSudoku(char[][] board) {

    // rows
    for (int i = 0; i < 9; i++) {
      boolean[] rows = new boolean[9];
      boolean[] columns = new boolean[9];
      boolean[] cube = new boolean[9];
      for (int j = 0; j < 9; j++) {
        char row = board[i][j];
        if (isNotValid(rows, row)) {
          return false;
        }
        char column = board[j][i];
        if (isNotValid(columns, column)) {
          return false;
        }

        int cubeRow = 3 * (i / 3) + (j / 3);
        int cubeColumn = 3 * (i % 3) + (j % 3);
        char cubeChar = board[cubeRow][cubeColumn];
        if (isNotValid(cube, cubeChar)) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean isNotValid(boolean[] check, int num) {
    char EMPTY = '.';
    if (num != EMPTY) {
      // convert char to numeric
      int digit = Character.getNumericValue(num - 1);
      if (check[digit]) {
        return true;
      } else {
        check[digit] = true;
      }
    }
    return false;
  }
}
