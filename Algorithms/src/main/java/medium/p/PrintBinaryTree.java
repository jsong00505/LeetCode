package medium.p;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-05-03.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Print Binary Tree (https://leetcode.com/problems/print-binary-tree/)
 */
public class PrintBinaryTree {
  public List<List<String>> printTree(TreeNode root) {
    int height = getHeight(root);
    int width = getWidth(height);
    List<List<String>> tree = new ArrayList<>();

    // initiate print
    for (int i = 0; i < height; i++) {
      List<String> line = new ArrayList<>();
      for (int j = 0; j < width; j++) {
        line.add("");
      }
      tree.add(line);
    }

    printTree(tree, root, 0, width / 2, width / 2);
    return tree;
  }

  private void printTree(
      List<List<String>> tree, TreeNode root, int height, int width, int position) {
    if (root == null) {
      return;
    }
    tree.get(height).set(position, Integer.toString(root.val));
    int left = position - width / 2 - 1;
    int right = position + width / 2 + 1;
    printTree(tree, root.left, height + 1, width / 2, left);
    printTree(tree, root.right, height + 1, width / 2, right);
  }

  private int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(getHeight(root.left), getHeight(root.right));
  }

  private int getWidth(int height) {
    int width = 0;
    for (int i = 0; i < height; i++) {
      width += (int) Math.pow(2, i);
    }
    return width;
  }
}
