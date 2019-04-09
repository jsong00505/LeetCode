package medium.s;

/**
 * Created by jsong on 2019-04-08.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Spiral Matrix II (https://leetcode.com/problems/spiral-matrix-ii/)
 */
public class SpiralMatrixTwo {
  private int RIGHT = 0;
  private int DOWN = 1;
  private int LEFT = 2;
  private int UP = 3;
  private int[] rowDirection = {0, 1, 0, -1};
  private int[] columnDirection = {1, 0, -1, 0};

  public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    boolean[][] seen = new boolean[n][n];
    int direction = RIGHT;

    int number = 1;
    int row = 0;
    int column = 0;
    while (!seen[row][column]) {

      // save number
      matrix[row][column] = number++;
      seen[row][column] = true;

      // check if it is able to go this direction
      if (!isValidGoingToThisDirection(seen, direction, row, column, n)) {
        direction = (direction + 1) % 4;
      }

      // move
      if (direction == RIGHT) {
        row += rowDirection[RIGHT];
        column += columnDirection[RIGHT];
      } else if (direction == DOWN) {
        row += rowDirection[DOWN];
        column += columnDirection[DOWN];
      } else if (direction == LEFT) {
        row += rowDirection[LEFT];
        column += columnDirection[LEFT];
      } else {
        row += rowDirection[UP];
        column += columnDirection[UP];
      }

      // it won't happen but just check in case
      if (row < 0 || column < 0 || row >= n || column >= n) {
        break;
      }
    }
    return matrix;
  }

  private boolean isValidGoingToThisDirection(
      boolean[][] seen, int direction, int row, int column, int size) {
    if (direction == RIGHT && (column + 1 >= size || seen[row][column + 1])) {
      return false;
    } else if (direction == DOWN && (row + 1 >= size || seen[row + 1][column])) {
      return false;
    } else if (direction == LEFT && (column - 1 < 0 || seen[row][column - 1])) {
      return false;
    } else if (direction == UP && (row - 1 < 0 || seen[row - 1][column])) {
      return false;
    }
    return true;
  }
}
