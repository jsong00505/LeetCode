package medium.u;

/**
 * Created by jsong on 2019-04-10.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Unique Paths (https://leetcode.com/problems/unique-paths/)
 */
public class UniquePaths {

  public int uniquePaths(int m, int n) {
    int[][] map = new int[m][n];
    for (int i = 0; i < m; i++) {
      map[i][0] = 1;
    }
    for (int i = 0; i < n; i++) {
      map[0][i] = 1;
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        map[i][j] = map[i - 1][j] + map[i][j - 1];
      }
    }

    return m == 0 || n == 0 ? 0 : map[m - 1][n - 1];
  }

  // time limit exceeded
  private int count = 0;
  private int row = 0;
  private int column = 0;
  private int length = 0;

  public int uniquePathsByBackTracking(int m, int n) {
    row = m;
    column = n;
    length = row + column - 2;
    backTracking(0, 0);
    return count;
  }

  private void backTracking(int curRow, int curColumn) {
    if (length == curRow + curColumn) {
      count++;
      return;
    }

    if (curColumn + 1 < column) {
      backTracking(curRow, curColumn + 1);
    }

    if (curRow + 1 < row) {
      backTracking(curRow + 1, curColumn);
    }
  }
}
