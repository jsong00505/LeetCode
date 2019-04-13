package medium.s;

/**
 * Created by jsong on 2019-04-12.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Set Matrix Zeroes (https://leetcode.com/problems/set-matrix-zeroes/)
 */
public class SetMatrixZeroes {
  public void setZeroes(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return;
    }
    boolean[] rows = new boolean[matrix.length];
    boolean[] columns = new boolean[matrix[0].length];
    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < columns.length; j++) {
        if (matrix[i][j] == 0) {
          rows[i] = true;
          columns[j] = true;
        }
      }
    }

    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < columns.length; j++) {
        if (rows[i] || columns[j]) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
