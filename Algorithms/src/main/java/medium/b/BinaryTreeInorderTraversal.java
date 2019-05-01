package medium.b;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsong on 2019-04-30.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @challenge Medium - Binary Tree Inorder Traversal
 *     (https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/)
 */
public class BinaryTreeInorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {

    List<Integer> result = new ArrayList<>();
    if (root != null) {
      travel(result, root);
    }

    return result;
  }

  private void travel(List<Integer> result, TreeNode root) {
    if (root.left != null) {
      travel(result, root.left);
    }
    result.add(root.val);
    if (root.right != null) {
      travel(result, root.right);
    }
  }
}
