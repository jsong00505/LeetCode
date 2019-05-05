package easy.c;

import common.Node;

/**
 * Created by jsong on 2019-05-05.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Easy - Construct Quad Tree (https://leetcode.com/problems/construct-quad-tree/)
 */
public class ConstructQuadTree {
  public Node construct(int[][] grid) {
    if (grid.length == 0) {
      return null;
    }
    return divideAndConquer(grid, 0, 0, grid.length);
  }

  private Node divideAndConquer(int[][] grid, int row, int column, int length) {
    if (length == 1) {
      if (grid[row][column] == 1) {
        return new Node(true, true, null, null, null, null);
      } else {
        return new Node(false, true, null, null, null, null);
      }
    } else {
      int l = length / 2;

      Node result = new Node();
      Node topLeft = divideAndConquer(grid, row, column, l);
      Node topRight = divideAndConquer(grid, row, column + l, l);
      Node bottomLeft = divideAndConquer(grid, row + l, column, l);
      Node bottomRight = divideAndConquer(grid, row + l, column + l, l);

      if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf)
        if (topLeft.val && topRight.val && bottomLeft.val && bottomRight.val) {
          return new Node(true, true, null, null, null, null);
        } else if (!topLeft.val && !topRight.val && !bottomLeft.val && !bottomRight.val) {
          return new Node(false, true, null, null, null, null);
        }

      return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }
  }
}
