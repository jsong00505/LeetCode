package medium.m;

/**
 * Created by jsong on 2019-04-10.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Minimum Path Sum (https://leetcode.com/problems/minimum-path-sum/)
 */
public class MinimumPathSum {
  public int minPathSum(int[][] grid) {

    int row = grid.length;
    int column = grid[0].length;

    for (int i = 1; i < row; i++) {
      grid[i][0] += grid[i - 1][0];
    }

    for (int i = 1; i < column; i++) {
      grid[0][i] += grid[0][i - 1];
    }

    for (int i = 1; i < row; i++) {
      for (int j = 1; j < column; j++) {
        if (grid[i - 1][j] > grid[i][j - 1]) {
          grid[i][j] += grid[i][j - 1];
        } else {
          grid[i][j] += grid[i - 1][j];
        }
      }
    }
    return grid[row - 1][column - 1];
  }
}
