package medium.b;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-05-05.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Binary Tree Level Order Traversal
 *     (https://leetcode.com/problems/binary-tree-level-order-traversal/)
 */
public class BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    helper(result, root, 1);
    return result;
  }

  private void helper(List<List<Integer>> result, TreeNode root, int level) {
    if (root == null) {
      return;
    }

    if (result.size() < level) {
      result.add(new ArrayList<>());
    }
    result.get(level - 1).add(root.val);

    if (root.left != null) {
      helper(result, root.left, level + 1);
    }
    if (root.right != null) {
      helper(result, root.right, level + 1);
    }
  }
}
