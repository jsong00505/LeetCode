package medium.u;

/**
 * Created by jsong on 2019-04-10.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Unique Paths II (https://leetcode.com/problems/unique-paths-ii/)
 */
public class UniquePathsTwo {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    // if empty array or null returns 0
    if (obstacleGrid == null || obstacleGrid.length == 0) {
      return 0;
    }

    int row = obstacleGrid.length;
    int column = obstacleGrid[0].length;

    // return 0 if the very first path has obstacle
    if (obstacleGrid[0][0] == 1) {
      return 0;
    } else {
      obstacleGrid[0][0] = 1;
    }

    for (int i = 1; i < row; i++) {
      if (obstacleGrid[i][0] == 1 || obstacleGrid[i - 1][0] == 0) {
        obstacleGrid[i][0] = 0;
      } else {
        obstacleGrid[i][0] = 1;
      }
    }

    for (int i = 1; i < column; i++) {
      if (obstacleGrid[0][i] == 1 || obstacleGrid[0][i - 1] == 0) {
        obstacleGrid[0][i] = 0;
      } else {
        obstacleGrid[0][i] = 1;
      }
    }

    for (int i = 1; i < row; i++) {
      for (int j = 1; j < column; j++) {

        if (obstacleGrid[i][j] == 1) {
          obstacleGrid[i][j] = 0;
        } else {
          obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
        }
      }
    }
    return obstacleGrid[row - 1][column - 1];
  }
}
