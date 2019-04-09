package medium.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jsong on 2019-04-07.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Spiral Matrix (https://leetcode.com/problems/spiral-matrix/)
 */
public class SpiralMatrix {

  private int RIGHT = 0;
  private int DOWN = 1;
  private int LEFT = 2;
  private int UP = 3;
  private int[] directions = {0, 1, 2, 3};

  public List<Integer> spiralOrder(int[][] matrix) {
    if (matrix.length == 0) {
      return Collections.emptyList();
    }
    List<Integer> result = new ArrayList<>();
    boolean[][] visited = new boolean[matrix.length][matrix[0].length];
    int row = 0, column = 0;
    int direction = directions[RIGHT];
    int maxRow = visited.length - 1;
    int maxColumn = visited[0].length - 1;
    while (row >= 0
        && row <= maxRow
        && column >= 0
        && column <= maxColumn
        && !visited[row][column]) {
      result.add(matrix[row][column]);
      visited[row][column] = true;

      // change the current direction
      if (!isValidGoingToThisDirection(visited, direction, maxRow, maxColumn, row, column)) {
        direction = (direction + 1) % 4;
      }

      if (direction == RIGHT) {
        column++;
      } else if (direction == DOWN) {
        row++;
      } else if (direction == LEFT) {
        column--;
      } else if (direction == UP) {
        row--;
      }
    }
    return result;
  }

  private boolean isValidGoingToThisDirection(
      boolean[][] visited, int direction, int maxRow, int maxColumn, int row, int column) {

    if (directions[RIGHT] == direction && (column + 1 > maxColumn || visited[row][column + 1])) {
      return false;
    }

    if (directions[DOWN] == direction && (row + 1 > maxRow || visited[row + 1][column])) {
      return false;
    }

    if (directions[LEFT] == direction && (column - 1 < 0 || visited[row][column - 1])) {
      return false;
    }

    if (directions[UP] == direction && (row - 1 < 0 || visited[row - 1][column])) {
      return false;
    }

    return true;
  }
}
