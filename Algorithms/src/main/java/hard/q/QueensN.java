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
 * @challenge Hard - N-Queens (https://leetcode.com/problems/n-queens/)
 */
public class QueensN {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> solutions = new ArrayList<>();
    boolean[][] positions = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(positions[i], true);
    }

    backTracking(solutions, positions, 0);
    return solutions;
  }

  private void backTracking(List<List<String>> solutions, boolean[][] positions, int row) {

    int n = positions.length;
    if (row > n - 1) {
      solutions.add(generateLine(positions));
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

        backTracking(solutions, copy, row + 1);
      }
    }
  }

  private List<String> generateLine(boolean[][] positions) {
    List<String> solution = new ArrayList<>();
    int n = positions.length;
    for (boolean[] position : positions) {
      StringBuilder row = new StringBuilder();
      for (int j = 0; j < n; j++) {
        if (position[j]) {
          row.append("Q");
        } else {
          row.append(".");
        }
      }
      solution.add(row.toString());
    }
    return solution;
  }

  private boolean[][] copyPositions(int n, boolean[][] positions) {
    boolean[][] copy = new boolean[n][n];
    for (int x = 0; x < n; x++) {
      System.arraycopy(positions[x], 0, copy[x], 0, n);
    }
    return copy;
  }
}
