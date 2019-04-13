package medium.s;

/**
 * Created by jsong on 2019-04-12.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Search a 2D Matrix (https://leetcode.com/problems/search-a-2d-matrix/)
 */
public class SearchA2DMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }

    int i = 0;
    int j = matrix[0].length - 1;
    while (i < matrix.length && j >= 0) {
      if (matrix[i][j] == target) {
        return true;
      } else if (matrix[i][j] > target) {
        j--;
      } else {
        i++;
      }
    }
    return false;
  }

  public boolean myOwnSolution(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    // find a row
    int row = 0;
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] == target) {
        return true;
      } else if (matrix[i][0] > target) {
        break;
      }
      row = i;
    }

    int leftIndex = 0;
    int rightIndex = matrix[0].length - 1;
    while (leftIndex < rightIndex) {
      int middleIndex = (leftIndex + rightIndex) / 2;
      int middle = matrix[row][middleIndex];
      if (target == middle) {
        return true;
      } else if (target > middle) {
        leftIndex = middleIndex + 1;
      } else {
        rightIndex = middleIndex - 1;
      }
    }

    return matrix[row][leftIndex] == target;
  }
}
