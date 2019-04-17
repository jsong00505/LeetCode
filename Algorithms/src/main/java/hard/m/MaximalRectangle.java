package hard.m;

import java.util.Stack;

/**
 * Created by jsong on 2019-04-16.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Hard - Maximal Rectangle (https://leetcode.com/problems/partition-list/)
 */
public class MaximalRectangle {
  // 24ms
  public int maximalRectangle(char[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }
    int i = 0;
    int max = 0;
    while (i < matrix.length) {
      Stack<Integer> stack = new Stack<>();
      if (i != 0) {
        for (int j = 0; j < matrix[0].length; j++) {
          if (matrix[i][j] == '1') {
            matrix[i][j] += matrix[i - 1][j] - '0';
          }
        }
      }

      int j = 0;
      while (j < matrix[0].length) {
        if (stack.isEmpty() || matrix[i][j] >= matrix[i][stack.peek()]) {
          stack.push(j++);
        } else {
          max = getMaxRectangleArea(matrix, stack, i, j, max);
        }
      }
      while (!stack.isEmpty()) {
        max = getMaxRectangleArea(matrix, stack, i, j, max);
      }
      i++;
    }

    return max;
  }

  private int getMaxRectangleArea(char[][] matrix, Stack<Integer> stack, int i, int j, int max) {
    int height = matrix[i][stack.peek()] - '0';
    stack.pop();
    int width = stack.isEmpty() ? j : j - stack.peek() - 1;
    int area = height * width;
    return Math.max(max, area);
  }
}
