package hard.q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jsong on 2019-04-07.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - N-Queens II (https://leetcode.com/problems/n-queens-ii/)
 */
public class QueensN2 {
  private int total = 0;

  public int totalNQueens(int n) {

    boolean[][] positions = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(positions[i], true);
    }

    backTracking(positions, 0);
    return total;
  }

  private void backTracking(boolean[][] positions, int row) {

    int n = positions.length;
    if (row > n - 1) {
      total++;
      return;
    }

    for (int i = 0; i < n; i++) {

      if (positions[row][i]) {
        boolean[][] copy = copyPositions(n, positions);
        // make false in the row
        for (int x = 0; x < n; x++) {
          copy[row][x] = x == i;
        }

        // make false in the column
        for (int x = 0; x < n; x++) {
          copy[x][i] = x == row;
        }

        // make false in the diagonal direction
        int x = 1;
        while (row + x < n && i + x < n) {
          copy[row + x][i + x] = false;
          x++;
        }

        x = 1;
        while (row + x < n && i - x >= 0) {
          copy[row + x][i - x] = false;
          x++;
        }

        backTracking(copy, row + 1);
      }
    }
  }

  private boolean[][] copyPositions(int n, boolean[][] positions) {
    boolean[][] copy = new boolean[n][n];
    for (int x = 0; x < n; x++) {
      System.arraycopy(positions[x], 0, copy[x], 0, n);
    }
    return copy;
  }
}
