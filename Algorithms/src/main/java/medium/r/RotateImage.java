package medium.r;

/**
 * Created by jsong on 2019-04-03.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Rotate Image (https://leetcode.com/problems/rotate-image/)
 */
public class RotateImage {

  public void rotate(int[][] matrix) {
    int len = matrix.length;
    // flip symmetrically
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][len - 1 - j];
        matrix[i][len - 1 - j] = temp;
      }
    }

    // flip horizontally
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len - 1 - i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[len - 1 - j][len - 1 - i];
        matrix[len - 1 - j][len - 1 - i] = temp;
      }
    }
  }

  public void myOwnSolution(int[][] matrix) {
    int len = matrix.length;
    for (int i = 0; i < len / 2 + len % 2; i++) {
      for (int j = i; j < len - 1 - i; j++) {
        int top = matrix[i][j];
        int right = matrix[j][len - 1 - i];
        int bottom = matrix[len - 1 - i][len - 1 - j];
        int left = matrix[len - 1 - j][i];

        // rotate
        matrix[i][j] = left;
        matrix[j][len - 1 - i] = top;
        matrix[len - 1 - i][len - 1 - j] = right;
        matrix[len - 1 - j][i] = bottom;
      }
    }
  }
}
